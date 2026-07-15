-- Last updated: 7/16/2026, 1:10:36 AM
# Write your MySQL query statement below
SELECT email AS Email
FROM Person 
GROUP BY email
HAVING COUNT(email) >1;