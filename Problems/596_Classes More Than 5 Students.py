import pandas as pd

def find_classes(courses: pd.DataFrame) -> pd.DataFrame:
    classes = courses.groupby(['class']).count().reset_index()
    return classes[classes['student']>=5][['class']]