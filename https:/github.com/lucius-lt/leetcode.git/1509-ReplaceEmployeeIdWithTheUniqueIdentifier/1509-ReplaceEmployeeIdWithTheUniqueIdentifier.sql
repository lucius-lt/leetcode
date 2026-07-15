-- Last updated: 7/16/2026, 1:08:31 AM
# Write your MySQL query statement below
select e.name,u.unique_id from employees as e
left join employeeuni as u
on e.id=u.id