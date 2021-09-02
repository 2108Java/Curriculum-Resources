--DDL intro 

--CREATING A TABLE

--creating a table
create table table_a(
	first_column int 
);

create table fruits(
	fruit_id int primary key, --primary key == not null & unique 
	fruit_name varchar(20) not null unique,
	description varchar(40),
	tasty bool 
);

create table todo_table(
	id int primary key,
	title varchar(20) not null,
	description varchar(120) not null,
	complete boolean not null
);

--ALTER 
--SELF LEARNING EXERCISE 



--deleting/removing a table
-- Drop command will remove all the data within the table and then remove the table itself
drop table table_a;
drop table todo_Table;
drop table fruits;


--just remove all the records without affecting the table structure
truncate fruits;