-- 집계 쿼리 : select 절에 통계함수(avg, max,min,count,sum,stddev,varance,...)
select avg(salary),sum(salary) from salaries;

-- 2)select절에 그뤃함수(통계함수)가 있는 경우, 어떤 컬럼도 select절에 올수 없다.
-- emp_no는 의미 없다.
-- 우류 !!
select emp_no, avg(salary) from salaries;

-- 3)query 순서
-- 1. from: 접근 테이블 확인
-- 2. where: 조건에 맞는 row를 선택(임시테이블)
-- 3. 집계 (결과 테이블)
-- 4. projection
--  예제: 사번이 10060인 사원이 받은 평균월급은 ?
select avg(salary) from salaries where emp_no ='10060';

-- 5) group by에 참여하고 있는 컬럼은 projection이 가능하다. : select절에 올 수 있다.
-- 예제:사원 개별 평균 월급은 ?
select avg(salary) from salaries  group by emp_no;

-- 6) having
-- 집계 결과 (결과 테이블)에서 row 를 선택해야하는 경우
-- 이미 where절은 실행이 되었기 때문에 having절에서 조건을 주어야한다.
-- 예제 :  사원 개별 평균  60,000 달러 이상인 사원의 사번과 평균월급을 출력하세요
select emp_no, avg(salary) as avg_slalary from salaries  group by emp_no having avg_slalary> 60000;

-- 7) order by
--    order by 는 항상 맨마지막 출력전에 한다.
select emp_no, avg(salary) as avg_slalary from salaries  group by emp_no having avg_slalary> 60000
order by avg_slalary asc;


-- 주의)
-- 예) 사번이 10060인 사원의 사번, 급여평균, 급여 총합을 출력하세요. 
-- 문법적 오류 (36) 하지만 의미적으로는 맞다(where절)
select emp_no, avg(salary),sum(salary) from salaries where emp_no ='10060';
-- 문법적, 의미적 맞다
select emp_no, avg(salary),sum(salary) from salaries group by emp_no having emp_no='10060';