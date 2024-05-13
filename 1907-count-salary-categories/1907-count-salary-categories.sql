
select "Low Salary" as Category,
sum(case when income <20000 then 1 else 0 end) as accounts_count
from Accounts
union
select "Average Salary" as Category,
sum(case when income >=20000 and income<=50000 then 1 else 0 end) as accounts_count
from accounts

union

select "High Salary" as Category,
sum(case when income >50000 then 1 else 0 end) as accounts_count
from accounts