select u.user_id as buyer_id,u.join_date,
coalesce(count(case when extract(year from order_date)=2019 then i.item_id else null end),0) as orders_in_2019
from Users u 
left join Orders o on u.user_id = o.buyer_id
left join Items i on o.item_id = i.item_id
group by 1,2