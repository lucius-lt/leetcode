-- Last updated: 7/16/2026, 1:09:23 AM
SELECT name 
FROM SalesPerson 
WHERE sales_id NOT IN(
    SELECT sales_id
    FROM Orders
    WHERE com_id=(
        SELECT com_id
        FROM Company
        WHERE name='RED'
    )
);