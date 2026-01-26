# Write your MySQL query statement below
select e.name AS Employee from Employee e Join Employee m ON e.managerId=m.id where e.salary>m.salary; 