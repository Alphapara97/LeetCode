import pandas as pd

def actors_and_directors(actor_director: pd.DataFrame) -> pd.DataFrame:
    # Group by actor_id and director_id, then filter using count
    result = actor_director.groupby(['actor_id', 'director_id']).filter(lambda x: len(x) >= 3)

    # Drop duplicates to get distinct pairs
    result = result[['actor_id', 'director_id']].drop_duplicates()

    return result