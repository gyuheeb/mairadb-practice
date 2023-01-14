
select * from book;
select * from cart;
select * from category;
select * from order_book;
select * from orders;
select * from user;

select a.no,b.name,b.email,d.price,a.address from orders a,user b,cart c, book d where a.user_no=b.no and b.cart_no=c.no and c.book_no=d.no;


select * from orders a,user b where a.user_no=b.no;
select * from user b, cart c where b.cart_no=c.no;
select * from orders a,user b,cart c where a.user_no=b.no and b.cart_no=c.no;

select * from cart c, book d where c.book_no=d.no;

desc order_book;
select title, price, book_no from book;
select * from order_book;