# Write your MySQL query statement below

select score , dense_rank() over(order by score desc) as "rank" from scores

# had to give "" for rank otherwise it would not work