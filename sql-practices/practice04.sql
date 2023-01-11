-- 서브쿼리(SUBQUERY) SQL 문제입니다.

-- 문제1.
-- 현재 평균 급여보다 많은 월급을 받는 직원은 몇 명이나 있습니까?
select count(b.salary) as 직원수 from employees a, salaries b where a.emp_no = b.emp_no
and b.to_date='9999-01-01' and b.salary > (select avg(salary) as avg_salary from employees a, salaries b where a.emp_no = b.emp_no
and b.to_date='9999-01-01')  order by b.salary asc;
-- 문제2. (x)
-- 현재, 각 부서별로 최고의 급여를 받는 사원의 사번, 이름, 부서 급여를 조회하세요. 단 조회결과는 급여의 내림차순으로 정렬되어 나타나야 합니다. 

-- 문제3.
-- 현재, 자신의 부서 평균 급여보다 급여(salary)이 많은 사원의 사번, 이름과 급여을 조회하세요 
select a.emp_no, a.last_name, b.salary from employees a, salaries b , dept_emp c ,(select b.dept_no, avg(a.salary) as avg_salary from salaries a, dept_emp b where a.emp_no=b.emp_no 
and a.to_date ='9999-01-01'and b.to_date ='9999-01-01' group by(b.dept_no) ) d
where a.emp_no=b.emp_no and a.emp_no=c.emp_no and c.dept_no=d.dept_no
and b.to_date ='9999-01-01' and c.to_date ='9999-01-01' and b.salary > d.avg_salary order by b.salary desc ;

-- 문제4.
-- 현재, 사원들의 사번, 이름, 매니저 이름, 부서 이름으로 출력해 보세요.
select  a.emp_no, concat(a.first_name,' ',a.last_name) as 사원 , c.dept_name , d.managerName
from employees a, dept_manager b, departments c ,
(select   a.emp_no, a.title, b.dept_no ,concat(c.first_name,' ',c.last_name) as managerName from titles a,dept_manager b,employees c where a.to_date=b.to_date and a.emp_no=c.emp_no and a.to_date='9999-01-01'  and b.to_date='9999-01-01' and a.title = 'Manager' 
order by a.emp_no asc) d
where a.emp_no=b.emp_no and b.dept_no =c.dept_no  and b.to_date='9999-01-01' 
 order by a.emp_no ; 

-- 문제5.
-- 현재, 평균연봉이 가장 높은 부서의 사원들의 사번, 이름, 직책, 급여을 조회하고 급여 순으로 출력하세요.
select b.emp_no, concat(b.first_name,' ',b.last_name)as managerName , d.dept_name, e.salary
from employees b, dept_emp c, departments d, salaries e ,(select a.dept_no, max(a.avg_salary) from (select b.dept_no, avg(a.salary) as avg_salary from salaries a, dept_emp b 
where a.emp_no=b.emp_no and a.to_date='9999-01-01'and b.to_date='9999-01-01'  group by(b.dept_no) order by avg_salary desc) a) f
where b.emp_no= c.emp_no and d.dept_no=c.dept_no and e.emp_no=b.emp_no and f.dept_no =c.dept_no and 
c.to_date='9999-01-01' and e.to_date='9999-01-01'and d.dept_no =f.dept_no;

-- 문제6.
-- 평균 급여이 가장 높은 부서는? 
-- 부서 이름, 평균급여
select c.dept_name, avg(b.salary) as avg_salary from titles a, salaries b, departments c, dept_emp d ,(select a.dept_no, max(a.avg_salary) 
																										from (select b.dept_no, avg(a.salary) as avg_salary 
																										from salaries a, dept_emp b where a.emp_no=b.emp_no  
																										group by(b.dept_no)) a) z
where a.emp_no=b.emp_no and a.emp_no=d.emp_no and d.dept_no = c.dept_no and c.dept_no=z.dept_no; 

-- 문제7.
-- 평균 급여이 가장 높은 직책?
select a.title, max(a.avg_salary)
 from (select b.title, avg(a.salary) as avg_salary from salaries a, titles b 
where a.emp_no=b.emp_no and a.to_date='9999-01-01'and b.to_date='9999-01-01'  group by(b.title) order by avg_salary desc) a;

-- 문제8.
-- 현재 자신의 매니저보다 높은 급여을 받고 있는 직원은?
-- 부서이름, 사원이름, 연봉, 매니저 이름, 메니저 급여 순으로 출력합니다.
select a.dept_name , concat(b.first_name,' ',b.last_name) as 사원이름 , c.salary, f.managerName , f.salary
from departments a , employees b,  salaries c , dept_emp d,
 (select c.dept_no, concat(a.first_name,' ',a.last_name) as managerName, b.salary
						from employees a, salaries b, dept_emp c
						 where a.emp_no= b.emp_no and c.emp_no = b.emp_no 
						 and b.to_date='9999-01-01'and c.to_date='9999-01-01' ) f
where a.dept_no= f.dept_no and c.emp_no=b.emp_no and d.dept_no=a.dept_no and f.dept_no = a.dept_no
 and c.to_date='9999-01-01'and d.to_date='9999-01-01'
   and c.salary> f.salary  ;