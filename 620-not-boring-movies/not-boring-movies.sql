# Write your MySQL query statement below
SELECT id,movie,description,rating FROM Cinema c Where c.id%2=1 AND c.description !="boring" ORDER BY rating DESC ;