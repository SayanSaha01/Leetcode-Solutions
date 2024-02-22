select u.name, sum(t.amount) as balance 
from Users u inner join Transactions t
on u.account = t.account 
group by name
having sum(t.amount) > 10000;