drop database java;
create database java;
use java;
-- 테이블 생성
create table aa(
        no int primary key auto_increment,
        name varchar(100),
score int
);
select * from aa;
insert into aa
        (name,score)
values
        ('하늬',100);
update aa set name='천재' where no=1;
delete from aa where no=1;



