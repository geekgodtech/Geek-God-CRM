import os
import re

def batch_rename_ttf():
    # Get all files in the current directory
    files = [f for f in os.listdir('.') if os.path.isfile(f)]
    
    # Find the highest existing number in files named like "01.ttf", "45.ttf"
    existing_numbers = []
    pattern = re.compile(r'^(\d+)\.ttf$', re.IGNORECASE)
    
    for f in files:
        match = pattern.match(f)
        if match:
            existing_numbers.append(int(match.group(1)))
            
    # Determine the starting count
    if existing_numbers:
        next_number = max(existing_numbers) + 1
    else:
        next_number = 1
        
    # Find un-numbered TTF files to rename
    # We filter out files that already match the "digits.ttf" pattern
    files_to_rename = []
    for f in files:
        if f.lower().endswith('.ttf') and not pattern.match(f):
            files_to_rename.append(f)
            
    # Sort them so they are renamed in alphabetical order (optional)
    files_to_rename.sort()

    if not files_to_rename:
        print("No new TTF files found to rename.")
        return

    print(f"Found {len(files_to_rename)} files. Starting numbering at {next_number}...")

    # Rename loop
    for filename in files_to_rename:
        # Format with leading zero (01, 02... 10, 11)
        new_name = f"{next_number:02d}.ttf"
        
        # Safety check: Skip if target name somehow exists (unlikely given logic above)
        while os.path.exists(new_name):
            next_number += 1
            new_name = f"{next_number:02d}.ttf"
            
        try:
            os.rename(filename, new_name)
            print(f"Renamed: '{filename}' -> '{new_name}'")
            next_number += 1
        except OSError as e:
            print(f"Error renaming '{filename}': {e}")

if __name__ == "__main__":
    batch_rename_ttf()
