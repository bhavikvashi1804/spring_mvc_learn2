create database demo;

use demo;


create table Person(
	id int,
    name varchar(20),
    age int
);

insert into Person values
(101,"Bhavik",22),
(102,"Raj",18);

select * from Person;