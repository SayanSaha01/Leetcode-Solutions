with cte as
(
    select u.name as results, count(distinct movie_id)
    from Users u join MovieRating mr on u.user_id = mr.user_id
    group by 1
    order by 2 desc,1 asc
    limit 1
),
cte2 as (
    select m.title as results, avg(rating)
    from Movies m 
    join MovieRating mr on m.movie_id = mr.movie_id
    where extract(year from created_at)=2020
    and extract(month from created_at)=02
    group by 1
    order by 2 desc, 1 asc
    limit 1
)
select results from cte 
union all
select results from cte2