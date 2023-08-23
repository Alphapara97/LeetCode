import pandas as pd

def article_views(views: pd.DataFrame) -> pd.DataFrame:
    filter1 = views['author_id']==views['viewer_id']
  
# filtering data on basis of both filters
    filtered_views = views[filter1]
    #Extract unique viewer IDs from the filtered DataFrame
    unique_ids = filtered_views['viewer_id'].unique()

    # Create a new DataFrame with the unique IDs
    output_df = pd.DataFrame({'id': unique_ids})
    return output_df.sort_values(by='id')