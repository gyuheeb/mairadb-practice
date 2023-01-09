## emplyee db install(restore)

1. 백업 db압축 풀기
''' sh
#unzip employees_db.zip
'''
2. employees 데이터베이스 생성 alc hr 계정 생성 및 권한 주기
''' sh
# mysql -u root -p
Enter password: '''
MariaDB [(none)]> create database employees;
MariaDB [(none)]> show databases;
MariaDB [(none)]> create user 'hr'@192.168.%' identified by 'hr';
MariaDB [(none)]> grant all privileges on employees.* to 'hr'@'192.168.%';
MariaDB [(none)]> flush privileges;
3. restotre
'''sh
# cd employees_db
# mysaol -u root -D employees - p < emplyees.sql
Enter password:
''''
