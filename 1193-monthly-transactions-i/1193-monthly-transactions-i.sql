# Write your MySQL query statement below
select 
LEFT(trans_date,7) as month,country,
COUNT(id) AS trans_count,
    SUM(CASE WHEN state = 'approved' THEN 1 ELSE 0 END) AS approved_count,
    SUM(amount) AS trans_total_amount,
    SUM(CASE WHEN state = 'approved' THEN amount ELSE 0 END) AS approved_total_amount
from Transactions
group by 1,2
