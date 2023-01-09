-- 문자열 함수

-- upper
select upper('busan'), upper('BUSan'),upper('BUsan') from dual;
select upper(first_name), last_name from employees order by upper(first_name);

-- lower
select lower('BUSAN'), lower('BUSan'),lower('BUsan') from dual;
select lower(first_name), last_name from employees order by lower(first_name);

-- substring(문자열 , index,length)
select substring('Hello world',3,2);

-- 예제 ) 1989년에 입사한 사원들의 이름, 입사일을 출력해라
select first_name, hire_date from employees where substring(hire_date, 1, 4) ='1989';


-- lpad (오른쪽 정렬) , rpad(왼렬)
select lpad('1234', 10,'-'),rpad('1234', 10,'-');

-- 예제 ) 직원들의 월급을 오른쪽 정렬(빈공간*)
select lpad(salary, 10,'*') from salaries;

-- trim, ltrim, rtrim
select concat('---',ltrim('     hello     '),'---')
,concat('---',rtrim('     hello     '),'---')
,concat('---',trim(leading'*'from'***hello***'),'---')
,concat('---',trim(trailing'*'from'***hello***'),'---')
,concat('---',trim(both'*'from'***hello***'),'---') from dual;

-- length
select length('Hello World') from dual;

