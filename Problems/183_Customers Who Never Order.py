import pandas as pd

def find_customers(customers: pd.DataFrame, orders: pd.DataFrame) -> pd.DataFrame:
    merged_df = customers.merge(orders, how='left', left_on='id', right_on='customerId')
    # Filter customers who haven't placed orders
    customers_without_orders = merged_df[merged_df['id_y'].isnull()]
    output_df = customers_without_orders[['name']].rename(columns={'name': 'Customers'})
    return output_df