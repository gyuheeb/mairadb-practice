select version(), current_date(), now() from dual;

-- 수학 함수, 사칙 연산 
select sin(pi() / 4) ,1+2+3+4 /5  from dual;

-- 대소문자 구분 안해
SelECt version(), current_date(), now() from dual;

select version(),
current_date(),
now();

show databases;

-- table 생성: DML
create table pet (
	name varchar(100), 
    owner varchar(20), 
    species varchar(20),
    gender char(1),
	birth date, death date);

-- schema 확인 (desc = describe)
desc pet;
describe pet; 

-- database , table 삭제 
drop table pet;
show tables;

-- insert : DML(c)
insert into pet values('똥방구','gyuhee','dog','N',"2023-03-03",null);

-- delete : DML(D)
delete from pet where name='똥빵구';
-- update: DML(U)
update pet set name='똥빵구'  where name = '똥방구';

update pet set death =null where name !='Brower';

-- select : DML(R)
select * from pet;

-- load data
load data local infile 'd:\pet.txt' into table pet;

-- select 연습
select name,species from pet where name = 'bowser';

select name,species from pet where birth >= '1998-01-01';

select name,species,gender from pet where species = 'dog' and gender = 'f';

select name,species from pet where species = 'snake' or species = 'bird';

select name,species, birth from pet order by birth desc;
select name,species, birth from pet order by birth asc;

select name,birth,death from pet where death is not null;

select name from pet where name like 'b%';
select name from pet where name like '%fy';
select name from pet where name like '%w%';
select name from pet where name like '_____';

select count(*) from pet;



