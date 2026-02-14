B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.4
@EndOfDesignText@
'//<START-CloseOut-S01>
Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Private sv As ScrollView
	Private pnlScroll As B4XView
	
	' --- HEADERS ---
	Private spnUser As Spinner
	Private lblTimeIn As Label
	Private lblTimeOut As Label
	Private lblTimeTotal As Label
	
	' --- CLIENT DATA (Read Only) ---
	Private txtName As EditText
	Private txtPhone As EditText
	Private txtAddress As EditText
	
	' --- CLIENT GROUP (Editable) ---
	Private spnGroup As Spinner
	
	' --- JOB DATA (Editable) ---
	Private txtIssue As EditText
	Private radResolvedYes As RadioButton
	Private radResolvedNo As RadioButton
	
	' --- INVENTORY / TAGS ---
	Private chkTag As CheckBox
	Private txtTagQty As EditText
	
	Private chkAcc As CheckBox
	Private txtAccQty As EditText
	
	Private chkGate As CheckBox
	Private txtGateQty As EditText
	
	' --- FINANCIAL ---
	Private txtFee As EditText
	
	' --- CONTACT NOTES ---
	Private txtNotes As EditText
	
	' --- LOGIC HELPERS ---
	Private CurrentJobData As Map
	Private StartTime As Long
	Private EndTime As Long
	Private IsPageReady As Boolean = False
	Private TempState As Map
End Sub

Public Sub Initialize
	CurrentJobData.Initialize
	TempState.Initialize
End Sub

Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.Color = xui.Color_White
	
	' 1. SCROLLVIEW SETUP
	sv.Initialize(0)
	Root.AddView(sv, 0, 0, Root.Width, Root.Height)
	pnlScroll = sv.Panel
	pnlScroll.Color = xui.Color_White
	
	IsPageReady = True
	BuildUI
End Sub

' =========================================================
' ===            MASTER RESIZE RECEIVER                 ===
' =========================================================

Public Sub RedrawUI(CurrentW As Int)
	If Root.IsInitialized = False Then Return

	' Standardized layout routing based on Main Page Engine
	If CurrentW > 1300 Then
		Log(">>> [CloseOut] RedrawUI: Mike Open Big / Unfolded (" & CurrentW & ")")
	Else If CurrentW > 850 Then
		Log(">>> [CloseOut] RedrawUI: Mike Closed Small / Tall Phone (" & CurrentW & ")")
	Else
		Log(">>> [CloseOut] RedrawUI: Erin's Phone (" & CurrentW & ")")
	End If

	' Route to standard resize
	B4XPage_Resize(CurrentW, Root.Height)
End Sub

Private Sub B4XPage_Resize (Width As Int, Height As Int)
	If IsPageReady = False Then Return
	sv.SetLayoutAnimated(0, 0, 0, Width, Height)
	
	' 1. Capture current state (if views exist and user might have typed)
	If txtNotes.IsInitialized Then SaveTempState
	
	' 2. Rebuild UI to fit new width
	BuildUI
	
	' 3. Restore state
	If TempState.Size > 0 Then
		RestoreTempState
	Else If CurrentJobData.IsInitialized And CurrentJobData.Size > 0 Then
		LoadJob(Array(CurrentJobData, StartTime, EndTime))
	End If
End Sub

Private Sub BuildUI
	pnlScroll.RemoveAllViews
	
	Dim top As Int = 10dip
	Dim left As Int = 10dip
	Dim w As Int = Root.Width - 20dip
	
	' 2. HEADER SECTION
	Dim lblTitle As Label : lblTitle.Initialize("")
	lblTitle.Text = "JOB CLOSEOUT"
	lblTitle.TextSize = 24
	lblTitle.Typeface = LoadSafeFont("closeout - labels.ttf")
	lblTitle.Gravity = Gravity.CENTER
	pnlScroll.AddView(lblTitle, 0, top, Root.Width, 40dip)
	top = top + 50dip
	
	spnUser.Initialize("spnUser")
	spnUser.AddAll(Array As String("Mike", "Erin"))
	pnlScroll.AddView(spnUser, left, top, w, 50dip)
	top = top + 60dip
	
	' 3. TIME SECTION
	lblTimeIn = CreateLabel("In: --:--")
	pnlScroll.AddView(lblTimeIn, left, top, w/3, 30dip)
	
	lblTimeOut = CreateLabel("Out: --:--")
	pnlScroll.AddView(lblTimeOut, left + w/3, top, w/3, 30dip)
	
	lblTimeTotal = CreateLabel("Total: 0m")
	lblTimeTotal.Typeface = Typeface.DEFAULT_BOLD
	pnlScroll.AddView(lblTimeTotal, left + (w/3)*2, top, w/3, 30dip)
	top = top + 40dip
	
	' 4. CLIENT INFO
	txtName = CreateInput(False, "Client Name")
	pnlScroll.AddView(txtName, left, top, w, 50dip)
	top = top + 60dip
	
	txtAddress = CreateInput(False, "Address")
	pnlScroll.AddView(txtAddress, left, top, w, 50dip)
	top = top + 60dip
	
	txtPhone = CreateInput(False, "Phone")
	pnlScroll.AddView(txtPhone, left, top, w, 50dip)
	top = top + 60dip
	
	Dim lblGrp As Label : lblGrp.Initialize("")
	lblGrp.Text = "Client Group:"
	lblGrp.Typeface = LoadSafeFont("closeout - labels.ttf")
	pnlScroll.AddView(lblGrp, left, top, w, 20dip)
	top = top + 25dip
	
	spnGroup.Initialize("spnGroup")
	spnGroup.AddAll(Array As String("Client", "Preferred", "Blacklisted"))
	pnlScroll.AddView(spnGroup, left, top, w, 50dip)
	top = top + 60dip
	
	' 5. JOB DETAILS
	txtIssue = CreateInput(True, "Primary Issue (e.g. Printer, WiFi)")
	pnlScroll.AddView(txtIssue, left, top, w, 50dip)
	top = top + 60dip
	
	Dim lblRes As Label : lblRes.Initialize("")
	lblRes.Text = "Resolved?"
	lblRes.Typeface = LoadSafeFont("closeout - labels.ttf")
	pnlScroll.AddView(lblRes, left, top, 100dip, 30dip)
	
	radResolvedYes = CreateRadio("Yes", True)
	pnlScroll.AddView(radResolvedYes, left + 100dip, top, 80dip, 30dip)
	
	radResolvedNo = CreateRadio("No", False)
	pnlScroll.AddView(radResolvedNo, left + 190dip, top, 80dip, 30dip)
	top = top + 40dip
	
	' 6. INVENTORY (UPDATED TO ROWS WITH QUANTITY)
	Dim lblInv As Label : lblInv.Initialize("")
	lblInv.Text = "Inventory / Parts Used:"
	lblInv.Typeface = LoadSafeFont("closeout - labels.ttf")
	pnlScroll.AddView(lblInv, left, top, w, 20dip)
	top = top + 25dip
	
	' Row 1: Tag
	chkTag = CreateCheck("Tag Used", "Tag")
	txtTagQty = CreateQtyInput("Tag")
	top = AddInventoryRow(top, w, chkTag, txtTagQty)
	
	' Row 2: Acc
	chkAcc = CreateCheck("Accessory Sold", "Acc")
	txtAccQty = CreateQtyInput("Acc")
	top = AddInventoryRow(top, w, chkAcc, txtAccQty)
	
	' Row 3: Gate
	chkGate = CreateCheck("Gate Remote", "Gate")
	txtGateQty = CreateQtyInput("Gate")
	top = AddInventoryRow(top, w, chkGate, txtGateQty)
	
	top = top + 20dip
	
	' 7. FINANCIALS
	Dim lblFee As Label : lblFee.Initialize("")
	lblFee.Text = "Total Collected ($):"
	lblFee.Typeface = LoadSafeFont("closeout - labels.ttf")
	pnlScroll.AddView(lblFee, left, top, w, 20dip)
	top = top + 25dip
	
	txtFee.Initialize("txtFee")
	txtFee.Hint = "0.00"
	txtFee.TextSize = 14
	txtFee.TextColor = xui.Color_Black
	txtFee.Color = xui.Color_Transparent
	Dim cd As ColorDrawable : cd.Initialize2(xui.Color_Transparent, 0, 1dip, xui.Color_LightGray)
	txtFee.Background = cd
	txtFee.InputType = txtFee.INPUT_TYPE_DECIMAL_NUMBERS
	
	pnlScroll.AddView(txtFee, left, top, w, 50dip)
	top = top + 60dip
	
	' 8. NOTES
	Dim lblNotes As Label : lblNotes.Initialize("")
	lblNotes.Text = "Client Notes (Saved to Google Contacts):"
	lblNotes.Typeface = LoadSafeFont("closeout - labels.ttf")
	pnlScroll.AddView(lblNotes, left, top, w, 20dip)
	top = top + 25dip
	
	txtNotes = CreateInput(True, "Add visit notes here...")
	txtNotes.SingleLine = False
	txtNotes.Gravity = Gravity.TOP + Gravity.LEFT
	pnlScroll.AddView(txtNotes, left, top, w, 100dip)
	top = top + 110dip
	
	' 9. SUBMIT BUTTON
	Dim btnSave As Button : btnSave.Initialize("btnSave")
	btnSave.Text = "CLOSE JOB & SAVE"
	btnSave.Color = 0xFF2E7D32
	btnSave.TextColor = xui.Color_White
	btnSave.Typeface = LoadSafeFont("closeout - buttons.ttf")
	pnlScroll.AddView(btnSave, left, top, w, 60dip)
	top = top + 70dip
	
	pnlScroll.Height = top
End Sub

' --- UI HELPERS ---

Private Sub AddInventoryRow(TopY As Int, Width As Int, Chk As CheckBox, QtyTxt As EditText) As Int
	Dim RowH As Int = 50dip
	Dim Margin As Int = 10dip
	Dim PickerW As Int = 130dip
	Dim ChkW As Int = Width - PickerW - 10dip
	
	pnlScroll.AddView(Chk, Margin, TopY, ChkW, RowH)
	
	' Picker Panel
	Dim pPicker As B4XView = xui.CreatePanel("")
	pPicker.SetColorAndBorder(xui.Color_White, 1dip, xui.Color_LightGray, 5dip)
	pnlScroll.AddView(pPicker, Margin + ChkW + 5dip, TopY, PickerW, RowH)
	
	' Buttons
	Dim ID As String = QtyTxt.Tag
	
	Dim btnDown As Button : btnDown.Initialize("btnQty")
	btnDown.Text = "▼" : btnDown.TextSize = 14 : btnDown.Tag = ID & "|-1"
	pPicker.AddView(btnDown, 0, 0, 40dip, RowH)
	
	QtyTxt.Text = "0"
	pPicker.AddView(QtyTxt, 40dip, 0, 50dip, RowH)
	
	Dim btnUp As Button : btnUp.Initialize("btnQty")
	btnUp.Text = "▲" : btnUp.TextSize = 14 : btnUp.Tag = ID & "|1"
	pPicker.AddView(btnUp, 90dip, 0, 40dip, RowH)
	
	Return TopY + RowH + 10dip
End Sub

Private Sub CreateLabel(Txt As String) As Label
	Dim l As Label : l.Initialize("")
	l.Text = Txt
	l.TextColor = xui.Color_Black
	l.TextSize = 14
	l.Typeface = LoadSafeFont("closeout - labels.ttf")
	Return l
End Sub

Private Sub CreateInput(Enabled As Boolean, Hint As String) As EditText
	Dim e As EditText : e.Initialize("txtInput")
	e.Hint = Hint
	e.TextSize = 14
	e.Enabled = Enabled
	e.TextColor = xui.Color_Black
	e.Color = xui.Color_Transparent
	Dim cd As ColorDrawable : cd.Initialize2(xui.Color_Transparent, 0, 1dip, xui.Color_LightGray)
	e.Background = cd
	Return e
End Sub

Private Sub CreateQtyInput(Tag As String) As EditText
	Dim e As EditText : e.Initialize("")
	e.TextSize = 16
	e.TextColor = xui.Color_Black
	e.Gravity = Gravity.CENTER
	e.InputType = e.INPUT_TYPE_NUMBERS
	e.Tag = Tag
	e.Enabled = False
	Return e
End Sub

Private Sub CreateCheck(Txt As String, Tag As String) As CheckBox
	Dim c As CheckBox : c.Initialize("chkInv")
	c.Text = Txt
	c.TextColor = xui.Color_Black
	c.Tag = Tag
	c.Typeface = LoadSafeFont("closeout - labels.ttf")
	Return c
End Sub

Private Sub CreateRadio(Txt As String, Checked As Boolean) As RadioButton
	Dim r As RadioButton : r.Initialize("")
	r.Text = Txt
	r.Checked = Checked
	r.TextColor = xui.Color_Black
	r.Typeface = LoadSafeFont("closeout - labels.ttf")
	Return r
End Sub

' [NEW] Points to Internal Storage / Geek God CRM / Fonts
Private Sub LoadSafeFont(FontName As String) As Typeface
	Dim BaseDir As String = File.DirRootExternal & "/Geek God CRM/Fonts"
	If File.Exists(BaseDir, FontName) Then
		Try
			Dim jo As JavaObject
			jo.InitializeStatic("android.graphics.Typeface")
			Return jo.RunMethod("createFromFile", Array(File.Combine(BaseDir, FontName)))
		Catch
			Log("Error loading external font: " & FontName)
		End Try
	End If
	If File.Exists(File.DirAssets, FontName) Then
		Return Typeface.LoadFromAssets(FontName)
	End If
	Return Typeface.DEFAULT_BOLD
End Sub
'Total Subroutines in Section S01 recorded last edit: 11
'Total Subroutines in Section S01 recorded after this edit - 12 
'Total Subroutines added in this edit - 1
'Total Subroutines removed in this edit - 0
'Difference between edits - 1
'Total Discrepancies - 0
'//<END-CloseOut-S01>




'//<START-CloseOut-S02>
' =========================================================
' ===            DATA LOADING & LOGIC                   ===
' =========================================================

Public Sub LoadJob(Params As List)
	CurrentJobData = Params.Get(0)
	StartTime = Params.Get(1)
	EndTime = Params.Get(2)
	
	TempState.Clear
	
	If txtName.IsInitialized = False Then Return
	
	txtName.Text = CurrentJobData.GetDefault("Name", "")
	txtPhone.Text = CurrentJobData.GetDefault("Phone", "")
	Dim rawAddr As String = CurrentJobData.GetDefault("Addr", "")
	txtAddress.Text = CleanAddress(rawAddr)
	
	txtIssue.Text = CurrentJobData.GetDefault("Issue", "")
	
	Dim grp As String = CurrentJobData.GetDefault("GroupLabel", "Client")
	If grp.Contains("Preferred") Then spnGroup.SelectedIndex = 1
	If grp.Contains("Blacklisted") Then spnGroup.SelectedIndex = 2
	If grp.Contains("Client") Or grp = "" Then spnGroup.SelectedIndex = 0
	
	DateTime.DateFormat = "h:mm a"
	lblTimeIn.Text = "In: " & DateTime.Time(StartTime)
	lblTimeOut.Text = "Out: " & DateTime.Time(EndTime)
	
	Dim Diff As Long = EndTime - StartTime
	Dim Mins As Int = Diff / 60000
	lblTimeTotal.Text = "Total: " & Mins & "m"
	
	txtFee.Text = "0.00"
	txtNotes.Text = ""
	
	' Reset Inventory
	chkTag.Checked = False : txtTagQty.Text = "0"
	chkAcc.Checked = False : txtAccQty.Text = "0"
	chkGate.Checked = False : txtGateQty.Text = "0"
	
	radResolvedYes.Checked = True
End Sub

Sub SaveTempState
	TempState.Clear
	TempState.Put("User", spnUser.SelectedIndex)
	TempState.Put("Group", spnGroup.SelectedIndex)
	TempState.Put("Issue", txtIssue.Text)
	TempState.Put("Resolved", radResolvedYes.Checked)
	
	' Save Quantities
	TempState.Put("TagQty", txtTagQty.Text)
	TempState.Put("AccQty", txtAccQty.Text)
	TempState.Put("GateQty", txtGateQty.Text)
	
	TempState.Put("Fee", txtFee.Text)
	TempState.Put("Notes", txtNotes.Text)
	
	TempState.Put("L_In", lblTimeIn.Text)
	TempState.Put("L_Out", lblTimeOut.Text)
	TempState.Put("L_Tot", lblTimeTotal.Text)
	TempState.Put("L_Name", txtName.Text)
	TempState.Put("L_Addr", txtAddress.Text)
	TempState.Put("L_Phone", txtPhone.Text)
End Sub

Sub RestoreTempState
	spnUser.SelectedIndex = TempState.Get("User")
	spnGroup.SelectedIndex = TempState.Get("Group")
	txtIssue.Text = TempState.Get("Issue")
	radResolvedYes.Checked = TempState.Get("Resolved")
	radResolvedNo.Checked = Not(radResolvedYes.Checked)
	
	txtTagQty.Text = TempState.GetDefault("TagQty", "0")
	txtAccQty.Text = TempState.GetDefault("AccQty", "0")
	txtGateQty.Text = TempState.GetDefault("GateQty", "0")
	
	' Sync Checkboxes
	If txtTagQty.Text <> "0" Then chkTag.Checked = True
	If txtAccQty.Text <> "0" Then chkAcc.Checked = True
	If txtGateQty.Text <> "0" Then chkGate.Checked = True
	
	txtFee.Text = TempState.Get("Fee")
	txtNotes.Text = TempState.Get("Notes")
	
	lblTimeIn.Text = TempState.Get("L_In")
	lblTimeOut.Text = TempState.Get("L_Out")
	lblTimeTotal.Text = TempState.Get("L_Tot")
	txtName.Text = TempState.Get("L_Name")
	txtAddress.Text = TempState.Get("L_Addr")
	txtPhone.Text = TempState.Get("L_Phone")
End Sub

' --- INVENTORY LOGIC ---

Sub chkInv_CheckedChange(Checked As Boolean)
	CallSub(B4XPages.MainPage, "PlayRandomSound")
	Dim c As CheckBox = Sender
	Dim Tag As String = c.Tag ' "Tag", "Acc", or "Gate"
	Dim TargetTxt As EditText
	
	If Tag = "Tag" Then TargetTxt = txtTagQty
	If Tag = "Acc" Then TargetTxt = txtAccQty
	If Tag = "Gate" Then TargetTxt = txtGateQty
	
	If Checked Then
		If TargetTxt.Text = "0" Then TargetTxt.Text = "1"
	Else
		TargetTxt.Text = "0"
	End If
End Sub

Sub btnQty_Click
	CallSub(B4XPages.MainPage, "PlayRandomSound")
	Dim b As Button = Sender
	Dim Data As String = b.Tag ' e.g. "Tag|1" or "Tag|-1"
	Dim Parts() As String = Regex.Split("\|", Data)
	Dim Tag As String = Parts(0)
	Dim Delta As Int = Parts(1)
	
	Dim TargetTxt As EditText
	Dim TargetChk As CheckBox
	
	If Tag = "Tag" Then
		TargetTxt = txtTagQty : TargetChk = chkTag
	Else If Tag = "Acc" Then
		TargetTxt = txtAccQty : TargetChk = chkAcc
	Else If Tag = "Gate" Then
		TargetTxt = txtGateQty : TargetChk = chkGate
	End If
	
	Dim CurVal As Int = 0
	If IsNumber(TargetTxt.Text) Then CurVal = TargetTxt.Text
	
	Dim NewVal As Int = CurVal + Delta
	If NewVal < 0 Then NewVal = 0
	
	TargetTxt.Text = NewVal
	
	' Sync Checkbox
	If NewVal > 0 And TargetChk.Checked = False Then TargetChk.Checked = True
	If NewVal = 0 And TargetChk.Checked = True Then TargetChk.Checked = False
End Sub

' ----------------------

Sub txtFee_FocusChanged (HasFocus As Boolean)
	If HasFocus Then
		If txtFee.Text = "0.00" Then txtFee.Text = ""
	End If
End Sub

Sub btnSave_Click
	CallSub(B4XPages.MainPage, "PlayRandomSound")
	If txtFee.Text = "" Then txtFee.Text = "0.00"
	
	DateTime.DateFormat = "MM/dd/yyyy"
	Dim DateStr As String = DateTime.Date(EndTime)
	Dim ResStr As String = "No" : If radResolvedYes.Checked Then ResStr = "Yes"
	
	Dim CleanAddr As String = CleanAddress(txtAddress.Text)
	
	' RAW DATA LIST
	Dim LedgerRow As List : LedgerRow.Initialize
	LedgerRow.Add(spnUser.SelectedItem)
	LedgerRow.Add(DateStr)
	LedgerRow.Add(txtName.Text)
	LedgerRow.Add(CleanAddr)
	LedgerRow.Add(txtPhone.Text)
	LedgerRow.Add(txtIssue.Text)
	LedgerRow.Add(ResStr)
	LedgerRow.Add("$" & txtFee.Text)
	LedgerRow.Add(lblTimeTotal.Text)
	
	' ADD QUANTITIES TO LEDGER
	LedgerRow.Add(txtTagQty.Text)
	LedgerRow.Add(txtAccQty.Text)
	LedgerRow.Add(txtGateQty.Text)
	
	Dim Container As List : Container.Initialize
	Container.Add(LedgerRow)
	Container.Add(txtNotes.Text)
	Container.Add(CurrentJobData.Get("ID"))
	Container.Add(spnGroup.SelectedItem)
	
	' Link to the restored logic in B4XMainPage S07
	CallSub2(B4XPages.MainPage, "SubmitCloseOut", Container)
End Sub

Private Sub CleanAddress(Addr As String) As String
	Dim temp As String = Addr.Replace(Chr(10), " ").Replace(Chr(13), " ")
	
	' 1. Find Zip Code (5 digits, optional hyphen)
	Dim Zip As String = ""
	Dim m As Matcher = Regex.Matcher("\b\d{5}(?:-\d{4})?\b", temp)
	If m.Find Then Zip = m.Match
	
	' 2. Get Street (Everything before first comma)
	Dim StreetPart As String = temp
	If temp.Contains(",") Then
		StreetPart = temp.SubString2(0, temp.IndexOf(",")).Trim
	End If
	
	If Zip <> "" Then
		Return StreetPart & " " & Zip
	Else
		Return StreetPart
	End If
End Sub
'Total Subroutines in Section S02 recorded last edit: 9
'Total Subroutines in Section S02 recorded after this edit - 9
'Total Subroutines added in this edit - 0
'Total Subroutines removed in this edit - 0
'Difference between edits - 0
'Total Discrepancies - 0
'//<END-CloseOut-S02>