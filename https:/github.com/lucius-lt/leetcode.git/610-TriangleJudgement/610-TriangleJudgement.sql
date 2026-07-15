-- Last updated: 7/16/2026, 1:09:22 AM
# Write your MySQL query statement below
SELECT x,y,z,
CASE
    WHEN abs(x)+abs(y)>abs(z) AND abs(y)+abs(z)>abs(x) AND abs(x)+abs(z)>abs(y) THEN 'Yes'
    ELSE 'No'
    END AS triangle
FROM Triangle;