select max(x.num) as num from
(
    select num, count(*) as cnt from MyNumbers group by 1
    order by cnt desc 
) x
where x.cnt=1