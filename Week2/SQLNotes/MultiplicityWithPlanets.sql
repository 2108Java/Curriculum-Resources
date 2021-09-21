--Multiplicity 
-- Relationships between each other 
-- 1-1
-- 1-many 
-- many-1
-- many-many 


--One to Many relationship

drop table if exists planet cascade;

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

-- One to One relationship

create table planets(
	planet_id serial primary key, --primary key 
	planet_name varchar(30) unique,
	planet_description varchar(60)

);

create table moons(
	moon_id serial primary key,
	moon_name varchar(30) unique not null, 
	--this is a foreign key, which is the same as the primary key in planets. 
	foreign_planet_key int unique references planets(planet_id) 

);

insert into planets(planet_name, planet_description ) values 
	('Earth','Green and Blue'),
	('Mars','Red and Red'),
	('Jupiter','Big');

insert into moons(moon_name, foreign_planet_key) 
values ('Deimos', 
		(select planet_id from planets where planet_name = 'Mars')),
		('Phobus',
		(select planet_id from planets where planet_name = 'Mars'))	;

select * from planets;

--Many To Many 
-- A many to many, as the name suggests maps entities to multiuple other entites. 
-- A normal example would be a student has many professors, and a professor has many students. 

drop table if exists planets cascade;
drop table if exists features cascade;

create table planets( 
	planet_id serial primary key, 
	planet_name varchar(30)
);

create table features(
	features_id serial primary key, 
	features_name varchar(30)
);

-- A Junction table 

create table planet_features_junction(
	p_id int references planets(planet_id),
	f_id int references features(features_id)
);

select * from planets;

insert into planets(planet_name) values ('Earth'), ('Mars'), ('Jupiter'), ('Saturn');

insert into features(features_name) values
	('Mountains'),('Deserts'),('Storms'),('Magnetic Poles');

insert into features(features_name) values ('Floating islands');

select * from planet_features_junction ;

insert into planet_features_junction values (
	(select planet_id from planets where planet_name = 'Jupiter'),
	(select features_id from features where features_name = 'Magnetic Poles'));


--Select all the features that Earth has!
select * from features;
select * from planet_features_junction ;

select * from features where features_id in (
	select f_id from planet_features_junction where p_id = 
		(select planet_id from planets where planet_name = 'Earth')
);

select * from features where features_id in (1,2,3,4);

select * from features where features_id = 1 or features_id = 2 or features_id = 3 or features_id = 4;















