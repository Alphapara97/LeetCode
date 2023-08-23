import pandas as pd

def valid_emails(users: pd.DataFrame) -> pd.DataFrame:

    valid_emails = users[users['mail'].str.match('^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode\.com$')]
    return valid_emails