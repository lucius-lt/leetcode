-- Last updated: 7/16/2026, 1:09:16 AM
# Write your MySQL query statement below
update Salary
SET sex=CASE
WHEN sex='m'THEN 'f'
ELSE 'm'
END ;