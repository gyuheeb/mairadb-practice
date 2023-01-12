-- emaillist

-- insert
insert into emaillist values(null,'둘','리', 'dooly@gamin.com');
 
-- delete
delete from emaillist where email='dooly@gamin.com';
 
-- list
 select no, first_name, last_name, email from emaillist order by no desc;