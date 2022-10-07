create database Week3;
use Week3;

create table Car(
id int auto_increment primary key,
model varchar(20) not null,
color varchar(20) not null,
fuel varchar(20) not null,
fuel_volume double not null,
year_of_issue datetime
);

create table Phone(
id int auto_increment primary key,
model varchar(20) not null,
color varchar(20) not null,
memoryPhone int not null,
ram int not null,
year_of_issue datetime
);