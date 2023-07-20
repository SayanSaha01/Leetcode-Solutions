
select max(num) as num from MyNumbers where num in 
(select max(num) from MyNumbers group by num having count(*)=1);