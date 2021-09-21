--Joins 
-- Useful to combine tables that references another table 
-- combine both to get informatino from the reference table. 

-- Normalization allows us to efficiently store information while minimizing redundant data
-- Joins allows us to query data more effectively by combining these normalized tables. 


select * from album;

select * from artist;

select count(*) from artist;

select count(*) from album a ;


---- INNER JOIN 

select a.name , b.title from artist a inner join album b on a.artist_id = b.artist_id;

select * from artist, album where artist.artist_id = album.artist_id;

select count(*) from artist,album where artist.artist_id = album.artist_id;

select * from album a inner join film f on a.title = f.title ;

---- LEFT OUTER (all the values on the left table, even if there i sno matching value!)

select * from artist a left outer join album b on a.artist_id = b.artist_id ;

select * from album a left outer join artist b on a.artist_id = b.artist_id ;

---- RIGHT OUTER 

select * from artist a right outer join album b on a.artist_id = b.artist_id ;

select * from album a right outer join artist b on a.artist_id = b.artist_id ;

---- FULL OUTER (returns values from both tables, even if there is no matching value!)

select * from artist a full outer join album a2 on a.artist_id = a2.artist_id ;


select * from album a full outer join film f on a.album_id = f.film_id ;
--When we do a join, we typically join foreign key columns with primary key columns
-- We not bound to joining tables on their foreign key column. (data types match )


select count(*) from artist a full outer join album b on a.artist_id = b.artist_id ;

--SELF JOIN 
--A subset of inner join where you can link the same table with itself 

select * from album a inner join album b on a.album_id = b.album_id ;
select * from album a inner join album b on a.album_id = b.artist_id ;


--CROSS JOINS 
select * from album a cross join artist a2;

