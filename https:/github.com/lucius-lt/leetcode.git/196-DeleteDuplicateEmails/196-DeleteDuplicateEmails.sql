-- Last updated: 7/16/2026, 1:10:31 AM
# Write your MySQL query statement below
DELETE p1
FROM Person p1
JOIN Person p2
ON p1.email=p2.email
AND p1.id>p2.id;#deletes the row in which p1idis greater than p2.id