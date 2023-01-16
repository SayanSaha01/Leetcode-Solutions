select customer_id, count(v.visit_id) as count_no_trans 
from Visits v left join Transactions t 
on v.visit_id=t.visit_id 
where t.visit_id is null 
group by customer_id;

/*We can see that if someone makes a visit but doesn't make a transaction, the customer_id will be registered in the Visits table yet there will not be a transaction_id corresponding to that visit_id. So we can take advantage of the NULLs that result when performing a LEFT JOIN with Visits on the left joined with Transactions.*/