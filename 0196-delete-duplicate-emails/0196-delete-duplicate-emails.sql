# Please write a DELETE statement and DO NOT write a SELECT statement.
# Write your MySQL query statement below
DELETE
FROM Person 
WHERE (
    id NOT IN (
        SELECT *
        FROM (
            SELECT min(id)
            FROM Person
            GROUP BY email
        ) AS rst
    )
)