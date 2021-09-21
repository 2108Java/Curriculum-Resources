--Joins 
-- Useful to combine tables that referece another table 
-- By combining both, we get information from the reference table. 


--Why do we use join? Why not put everything into a table?
-- Because this will contradict normalization. 
-- By normalizing our tables, we end up with seperate tables (as a consequence)
-- joins help us to combine together them together to "see" the data better

select * from planets;

select * from features;

select * from planet_features_junction;

--FULL OUTER JOIN (all the values from the left and right table)
select * from planets p full outer join planet_features_junction pfj --this is an alias
		on p.planet_id = pfj.p_id ;	
	
select * from features full outer join planet_features_junction pfj 
		on features.features_id = pfj.f_id;
			
select * from planets p full outer join ( 
	select * from features f full outer join planet_features_junction pfj 
		on f.features_id = pfj.f_id 
		--The nested select statement is our first join. 
		-- We're joining to gether the juntion table and the features 
		--We need to combine the junction table because it holds the reference to planet and features. 
		) 
	foo on p.planet_id = foo.p_id;
		

--INNER JOIN (only matching values will be shown from both tables)

select * from planets p inner join planet_features_junction pfj --this is an alias
		on p.planet_id = pfj.p_id ;	
	
select * from features inner join planet_features_junction pfj 
		on features.features_id = pfj.f_id;

select * from planets p inner join ( 
	select * from features f inner join planet_features_junction pfj 
		on f.features_id = pfj.f_id 
		--The nested select statement is our first join. 
		-- We're joining to gether the juntion table and the features 
		--We need to combine the junction table because it holds the reference to planet and features. 
		) 
	feature_junction_join on p.planet_id = feature_junction_join.p_id;


delete from features where features_name = 'Floating islands';
delete from features where features_name = 'Storms'; --we can't delete 'storms' is because our 
														-- junction table points to that row

delete from planets where planet_name = 'Earth'; -- we would end up with orphan records! 
												-- pointing to rows that no longer exists. 

--First have to delete any relating rows. 
delete from planet_features_junction 
	where p_id = (select planet_id from planets 
	where planet_name = 'Earth');

	
	
	
	
	
	
	
	
	
	
	