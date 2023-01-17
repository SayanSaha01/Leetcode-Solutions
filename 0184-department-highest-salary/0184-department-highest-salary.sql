# Write your MySQL query statement below
select d.name as Department, e.name as Employee, e.salary as Salary 
from Employee e, Department d 
where e.departmentId = d.id
and (departmentId,Salary) in
(select departmentId,max(Salary) from Employee group by departmentId);