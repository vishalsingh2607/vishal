create database ats;

use ats;



drop table user;

                 
insert into user value(1, '26-07-92', 'vishal@gmail.com', 'mohali',9999999, 'Vishal', 'hr','pending','26-07-92');
insert into user value(2, '27-07-92', 'rishav@gmail.com', 'dehradun',8888888, 'Rishav', 'recruiter','pending','27-07-92');
insert into user value(3, '28-07-92', 'sachin@gmail.com', 'pune',7777777, 'Sachin','team lead','pending','28-07-92');
insert into user value(4, '29-07-92', 'kamal@gmail.com', 'mumbai',6666666, 'Kamal','candidate','pending','29-07-92');
insert into user value(5, '30-07-92', 'ram@gmail.com', 'chennai',5555555, 'Ram','BOD','pending','30-07-92');



create table role(roleId integer, role varchar(255));
insert into role values (1,'candidate'),
						(2,'Recruiter'),
                        (6,'HR'),
                        (9,'Team Lead'),
                        (7,'BOD');
insert into candidate values(201,5,'No Comments', 9999999999, 4.2,1.8,'21-09-12','25-09-12','immediate', 4,'mohali','Rahul Singh','accepted','19-09-12','NEha','Riya','4.1','Rekha',4,'Java');
select * from candidate;
select * from role;
select *from user;