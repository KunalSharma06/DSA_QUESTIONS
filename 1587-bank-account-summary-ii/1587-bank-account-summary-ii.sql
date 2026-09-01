# Write your MySQL query statement below
select u.name, sum(t.amount) as balance from users u join transactions t on u.account = t.account group by 
u.name, u.account having sum(t.amount) > 10000

