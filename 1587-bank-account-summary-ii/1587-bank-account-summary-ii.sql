# Write your MySQL query statement below
select u.name , sum(t.amount) as balance from users u inner join transactions t on u.account=t.account group by t.account having balance > 10000;