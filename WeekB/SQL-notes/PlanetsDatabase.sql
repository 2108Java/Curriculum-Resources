--Multiplicity 
-- Relationships between each other 
-- 1-1
-- 1-many 
-- many-1
-- many-many 



--Planets and moons. 

-- Planet can have multiple moons 
-- Moon can have at most only one planet 


--DDL to create our table 

drop table moons;
drop table planets;

create table planets(
	planet_id serial primary key, --primary key 
	planet_name varchar(30) unique,
	planet_description varchar(60)

);

create table moons(
	moon_id serial primary key,
	moon_name varchar(30) unique not null, 
	--this is a foreign key, which is the same as the primary key in planets. 
	foreign_planet_key int references planets(planet_id) 
	

);

insert into planets(planet_name, planet_description ) values 
	('Earth','Green and Blue'),
	('Mars','Red and Red'),
	('Jupiter','Big');

insert into planets(planet_name, planet_description) values ('Pluto', 'very far away');

--select planet_id from planets;

insert into moons(moon_name, foreign_planet_key) values ('The Moon', 1);

insert into moons(moon_name, foreign_planet_key) 
values ('Deimos', 
		(select planet_id from planets where planet_name = 'Mars')),
		('Phobus',
		(select planet_id from planets where planet_name = 'Mars'))	;
		


select * from moons;
select * from planets;


select * from planets 
	where planet_id = 
		(select foreign_planet_key from moons where moon_name = 'Deimos');
	
	
--Joins
-- Normalization is the practice of reducing redundant data in our tables 
-- This leads to splitting up our tables
-- Which introduces of querying our tables efficiently, with all the info we need. 
-- Which is where joins come in . 
	
-- Inner Join 
select * from planets,moons where planets.planet_id = moons.foreign_planet_key ;
-- Outer Joins: left, right and full 

--full 
select * from planets full outer join moons on planets.planet_id = moons.foreign_planet_key ;



