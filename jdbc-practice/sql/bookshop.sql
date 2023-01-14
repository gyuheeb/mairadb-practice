-- bookshop
delete  from book;
delete  from author;
select * from author order by no desc;
select no, title,rent,author_no from book order by no desc;
select * from book;
select * from author;

select a.no, a.title ,a.rent,b.name as authorname from book a, author b where a.no=b.no;

select * from emaillist;

insert into author values (null,?);

update book set rent = ? where no = ? ; 
select * from book a, author b where a.no=b.no;
select a.no, a.title ,a.rent,a.author_no,b.name as authorname from book a, author b where a.no=b.no;
insert into book values (null,?,null,?) ;
