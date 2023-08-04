-- Person schema
-- +-------------+---------+ 
-- | Column Name | Type    |
-- +-------------+---------+
-- | personId    | int     |
-- | lastName    | varchar |
-- | firstName   | varchar |
-- +-------------+---------+

-- Address schema
-- +-------------+---------+
-- | Column Name | Type    |
-- +-------------+---------+
-- | addressId   | int     |
-- | personId    | int     |
-- | city        | varchar |
-- | state       | varchar |
-- +-------------+---------+

-- Write an SQL query to report the first name, last name, city, and state of each person in the Person table. If the address of a personId is not present in the Address table, report null instead.

-- personId is the primary key column for this table.
-- This table contains information about the ID of some persons and their first and last names.


select p.firstName,p.lastName,a.city,a.state from Person p left outer join Address a on p.personId=a.personId;