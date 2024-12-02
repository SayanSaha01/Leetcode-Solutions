select customer_id -- ,count(*) as cnt
from customer c
-- where product_key in (select distinct(product_key) from product)
group by 1
having count(distinct product_key)=(select count(distinct product_key) from product)