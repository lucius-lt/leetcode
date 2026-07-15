-- Last updated: 7/16/2026, 1:10:34 AM
# Write your MySQL query statement below
SELECT name AS Customers
FROM Customers
LEFT JOIN Orders
ON Customers.id = Orders.customerId
WHERE Orders.id IS NULL;