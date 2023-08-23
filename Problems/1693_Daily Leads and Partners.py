import pandas as pd

def daily_leads_and_partners(daily_sales: pd.DataFrame) -> pd.DataFrame:
    # Group by actor_id and director_id, then filter using count
    result = daily_sales.groupby(['date_id', 'make_name']).agg(unique_leads=('lead_id', 'nunique'), unique_partners=('partner_id', 'nunique')).reset_index()
    return result