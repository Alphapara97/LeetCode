import pandas as pd

def total_time(employees: pd.DataFrame) -> pd.DataFrame:
    employees['event_day'] = pd.to_datetime(employees['event_day'])  # Convert event_day to datetime

    # Calculate total time spent for each entry
    employees['total_time'] = employees['out_time'] - employees['in_time']
    employees.rename(columns={'event_day': 'day'}, inplace=True)
    result_df = employees.groupby(['day', 'emp_id'])['total_time'].sum().reset_index()
    return result_df