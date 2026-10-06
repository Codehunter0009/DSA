# Write your MySQL query statement below
SELECT firstName,lastName,city,state FROM Person  LEFT Join Address
ON  person.personId=Address.personId;