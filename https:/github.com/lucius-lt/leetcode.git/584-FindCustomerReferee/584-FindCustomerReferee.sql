-- Last updated: 7/16/2026, 1:09:29 AM
# Write your MySQL query statement below
select name
FROM Customer 
WHERE referee_id 
IS NULL
OR referee_id!=2;