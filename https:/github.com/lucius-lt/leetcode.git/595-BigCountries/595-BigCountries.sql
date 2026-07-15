-- Last updated: 7/16/2026, 1:09:26 AM
# Write your MySQL query statement below
SELECT
name,
population,
area
FROM WORLD
WHERE population >= 25000000
OR
area>=3000000;