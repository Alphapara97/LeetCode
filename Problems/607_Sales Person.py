import pandas as pd

def sales_person(sales_person: pd.DataFrame, company: pd.DataFrame, orders: pd.DataFrame) -> pd.DataFrame:
    # Merge orders and company DataFrames on com_id
    merged_orders_company_df = pd.merge(orders, company, on='com_id')

    # Filter merged DataFrame to get sales_ids related to company with name 'RED'
    red_related_sales_ids = merged_orders_company_df[merged_orders_company_df['name'] == 'RED']['sales_id'].unique()

    # Filter salesperson DataFrame based on sales_ids that are not in red_related_sales_ids
    filtered_salesperson_df = sales_person[~sales_person['sales_id'].isin(red_related_sales_ids)][['name']]

    return filtered_salesperson_df