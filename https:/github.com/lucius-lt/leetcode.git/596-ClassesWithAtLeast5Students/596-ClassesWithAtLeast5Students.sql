-- Last updated: 7/16/2026, 1:09:25 AM
# Write your MySQL query statement below
SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(*)>=5;