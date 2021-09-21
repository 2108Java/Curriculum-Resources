--More Advanced DQL commands 

select * from customer;

select count(*) from customer; -- the number of customers that I have 

select count(*) as number_of_customers from customer; -- number of customers with alias

select * from customer where country = 'Brazil';

select count(*) from customer where country = 'Brazil';

select count(*) from customer group by country; --returns the customers in each country 

select count(*), country from customer group by country;

select count(*), country from customer group by country having count(*) > 1;

select count(*), country from customer where first_name like 'J%' group by country having count(*) > 1

--Functions 
-- differences between a function, a method and a stored procedure 

-- both functions and methods and stored proccedues take in input arguments. 
-- functions and methods can have return values. 
-- stored procedures don't have a return type. 

--Aggregate functions in SQL 
-- These functions have to act on a group of records 
-- Takes in multiple records/values and returns a single value 
select count(total) from invoice; 
select sum(total) from invoice;
select avg(total) from invoice;
select max(total) from invoice;
select min(total) from invoice;

--Scalar functions in SQL 
-- Take in a single input and return an output. 
select upper(first_name) from employee e ;
select lower(first_name) from employee e ;
select upper(lower(upper(first_name))) from employee e ;

select now(); 
