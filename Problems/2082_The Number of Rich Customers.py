import pandas as pd

def count_rich_customers(store: pd.DataFrame) -> pd.DataFrame:
    amount_count = store[store['amount']>500]
    rich_count = amount_count['customer_id'].unique().shape[0]
    result_df = pd.DataFrame({'rich_count': [rich_count]})
    return result_df