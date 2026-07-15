-- Last updated: 7/16/2026, 1:09:20 AM
# Write your MySQL query statement below
SELECT MAX(num) as num
FROM (
SELECT num
FROM MyNumbers
GROUP BY num
HAVING COUNT(*)=1 )AS num;