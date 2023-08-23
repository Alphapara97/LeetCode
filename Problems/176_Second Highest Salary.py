import pandas as pd

def second_highest_salary(employee: pd.DataFrame) -> pd.DataFrame:
    sorted_salaries = employee['salary'].sort_values(ascending=False).drop_duplicates()
    output = pd.DataFrame({'SecondHighestSalary': [None if sorted_salaries.size < 2 else sorted_salaries.iloc[1]]})
    return output