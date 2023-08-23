import pandas as pd

def find_patients(patients: pd.DataFrame) -> pd.DataFrame:
    filtered_patients = patients[patients['conditions'].str.contains(r'\bDIAB1')]
    return filtered_patients[['patient_id','patient_name','conditions']]
#The str.contains() method with the regex pattern r'\bDIAB1' checks each entry in the 'conditions' column for the presence of 'DIAB1'. 
# The \b in the pattern is a word boundary assertion that ensures 'DIAB1' is a separate word and not part of another word. 
# This ensures that we only get patients with Type I Diabetes and not other conditions that might contain 'DIAB1' as part of the word.