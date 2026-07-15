-- Last updated: 7/16/2026, 1:08:40 AM
# Write your MySQL query statement below
SELECT player_id, MIN(event_date) AS first_login
FROM Activity
GROUP BY player_id;