# Write your MySQL query statement below
SELECT max(SALARY) AS SecondHighestSalary FROM EMPLOYEE WHERE SALARY < (SELECT MAX(SALARY )FROM EMPLOYEE)
