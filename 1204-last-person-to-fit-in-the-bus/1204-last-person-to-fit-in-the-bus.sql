select person_name from (
    select *, sum(weight) over(order by Turn) as Total_Weight
    from Queue
) x
where x.Total_Weight<=1000
order by x.turn desc limit 1