-- select 연습
select * from departments;


-- 프로젝션(projection)
-- 예제  emplyees 테이블에서 직원의 이름, 성별,입사일을 출력
select dept_no,dept_name from departments;

-- as (alias, 생략가능)
-- emplyees 테이블에서 직원의 이름,성별, 입사일을 출력
select first_name as '이름', gender as '성', hire_date as'입사일' from employees;

select concat( first_name,' ', gender) as'이름',gender as '성', hire_date as'입사일' from employees;
