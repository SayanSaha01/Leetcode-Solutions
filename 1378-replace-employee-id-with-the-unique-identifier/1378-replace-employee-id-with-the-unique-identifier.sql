# Write your MySQL query statement below
select eu.unique_id,
emp.name from
Employees emp left join EmployeeUNI eu
on eu.id = emp.id;