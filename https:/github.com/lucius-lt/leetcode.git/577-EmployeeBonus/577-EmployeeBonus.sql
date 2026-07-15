-- Last updated: 7/16/2026, 1:09:31 AM
# Write your MySQL query statement below
SELECT name, bonus
FROM Employee
LEFT JOIN Bonus
ON Employee.empId=Bonus.empId
WHERE bonus<1000
OR bonus IS NULL;