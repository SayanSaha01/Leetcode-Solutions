select contest_id, 
round(100 * count(distinct user_id) /(select count(distinct user_id) from Users),2) as percentage
from Register 
group by 1
order by 2 desc, 1 
