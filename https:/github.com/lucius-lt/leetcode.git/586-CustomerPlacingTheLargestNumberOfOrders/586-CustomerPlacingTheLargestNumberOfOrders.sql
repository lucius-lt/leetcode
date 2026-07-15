-- Last updated: 7/16/2026, 1:09:28 AM
# Write your MySQL query statement below
SELECT customer_number 
FROM Orders
GROUP BY customer_number
ORDER BY COUNT(*) DESC
LIMIT 1;
