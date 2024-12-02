with cte as(
    select customer_id,
    case when min(order_date) = min(customer_pref_delivery_date) then 'immediate'
    else 'scheduled'
    end as status
    from delivery
    group by 1
)

select round(100 * sum(case when status='immediate' then 1 else 0 end)/count(*),2)
as immediate_percentage
from cte