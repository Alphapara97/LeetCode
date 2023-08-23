import pandas as pd

def categorize_products(activities: pd.DataFrame) -> pd.DataFrame:
    # Group by sell_date, then aggregate the number of different products and their sorted names
    result = activities.groupby('sell_date').agg(
    num_sold=('product', 'nunique'),
    products=('product', lambda x: ','.join(sorted(x.unique())))).reset_index()


    # Sort the result by sell_date
    return result.sort_values('sell_date')