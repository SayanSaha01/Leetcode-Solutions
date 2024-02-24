select T.employee_id 
from 
(select * from Employees e left join Salaries s using(employee_id)
union
select * from Employees e right join Salaries s using(employee_id)
)
As T
where T.name is null or T.salary is null
order by T.employee_id;