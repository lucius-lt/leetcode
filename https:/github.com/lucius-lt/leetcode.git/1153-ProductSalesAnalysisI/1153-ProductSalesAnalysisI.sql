-- Last updated: 7/16/2026, 1:08:41 AM
# Write your MySQL query statement below
SELECT p.product_name, s.year, s.price
FROM Sales s
INNER JOIN Product p ON s.product_id = p.product_id;