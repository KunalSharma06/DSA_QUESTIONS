# Write your MySQL query statement below

select e1.unique_id, e2.name from employees e2 left join employeeuni e1 on e1.id = e2.id