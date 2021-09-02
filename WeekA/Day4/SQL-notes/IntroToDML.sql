

--Intro to DML


--READ
--selecting all the elements from table_a 

--SELECT <rows> FROM <table-name> 
select * from table_a;
select * from fruits;

select fruit_name, description from fruits;


--create 
--Adding rows/records to the table 
-- INSERT INTO <table-name> VALUES (...)
insert into fruits values (1,'Dragon Fruit','Dissapointing',false);

insert into fruits (fruit_id,tasty)  values (27,false);

insert 
	into 
		fruits (fruit_id, fruit_name, description, tasty)
		values 
			(1,'Dragon Fruit','Dissapointing',false),
			(2, 'Banana','Is yellow', true),
			(3, 'Apple', 'Is red', true),
			(4, 'Orange','Is orange', true);
		
--UPDATE

update fruits set tasty = false where fruit_id = 4;

update fruits set tasty = true where tasty = false;
		
		
--DELETE

delete from fruits where fruit_id = 1;

delete from fruits where fruit_name = 'Orange';
