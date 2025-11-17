create database bankmanagementsystem;

show databases;

use bankmanagementsystem;

create table Signup(formno varchar(20),name varchar(20),fname varchar(20),Dob varchar(20),gender varchar(20),email varchar(40),marital varchar(20),address varchar(40),city varchar(25),state varchar(25),Pincode varchar(25));
drop table Signup;
select * from Signup;

create table Signuptwo(formno varchar(20),religion varchar(20),Category varchar(20),Income varchar(20),Education varchar(20),Occupation varchar(40),Adhar varchar(20),SeniorCitizen varchar(40),PAN varchar(25),Exising varchar(25));
ALTER TABLE Signuptwo ADD COLUMN PAN varchar(20);
ALTER TABLE Signuptwo DROP COLUMN city;
show tables;

select * from Signuptwo;

create table Signupthree(formno varchar(20),accountType varchar(40),CardNo varchar(25),pinno varchar(15),facility varchar(100)); 
drop table Signupthree;
create table login(formno varchar(20), cardnumber varchar(25),pinno varchar(15));
drop table login;


select * from Signupthree;

select * from login;

create table bank(pinno varchar(15),date varchar(50),Type varchar(40),amount varchar(50));
drop table bank;
select * from bank;