-- Last updated: 7/16/2026, 1:10:40 AM
# Write your MySQL query statement below
SELECT firstName, lastName, city, state 
FROM Person
LEFT JOIN Address
ON Person.personId=Address.personId;
