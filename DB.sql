select bookname, publisher
from book
where price>=10000;

select bookid, Bookname, publisher, price
from book;

select publisher
from book;

select distinct publisher
from book;

select *
from book
where price>=20000;

select *
from book
where price>=10000 and price<20000;

select *
from book
where publisher in('굿스포츠', '대한미디어');

select publisher
from book
where bookname like '축구의 역사';

select publisher
from book
where bookname like '%축구%';

select *
from book
where bookname like '_구%';

select *
from book
order by price;

select SUM(saleprice) as 총매출
from orders;

select SUM(saleprice) as 총매출
from orders
where custid=2;

select SUM(saleprice) as 총매출,
AVG(saleprice) as 평균값,
MIN(saleprice) as 최저가,
MAX(saleprice) as 최고가
from orders;

select count(*)
from orders;

select custid, count(*) as 도서수량, SUM(saleprice) as 판매액
from orders
group by custid;

select custid, count(*) as 도서수량
from orders
where saleprice>=8000
group by custid
having count(*)>=2;

select *
from customer, orders
where customer.custid=orders.custid;

select *
from customer, orders
where customer.custid=orders.custid
order by customer.custid;

select name, SUM(saleprice)
from customer, orders
where customer.custid=orders.custid
group by customer.custid
order by customer.custid;

select customer.name, book.bookname
from customer, orders, book
where customer.custid=orders.custid and orders.bookid=book.bookid;

select customer.name, book.bookname
from customer, orders, book
where customer.custid=orders.custid and orders.bookid=book.bookid and book.price>=20000;

select bookname
from book
where price=(select MAX(price) from book);

select customer.name
from customer
where custid in (select custid from orders);

select customer.name
from customer
where custid in (select custid from orders where bookid in (select bookid from book where publisher='대한미디어'));

select b1.bookname
from book b1
where b1.price > (select avg(b2.price) from book b2 where b2.publisher=b1.publisher);

select bookname
from book
where price=(select MAX(price) from book);

select phone
from customer
where custid in (select custid from orders where bookid in (select bookid from imported_book));










