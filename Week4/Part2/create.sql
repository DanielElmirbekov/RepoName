Create database CarService;

use CarService;

create table Car(
CarId int unsigned primary key auto_increment,
Model varchar(30) not null,
Color varchar(30) not null,
EngineVolume double not null,
Prise double not null
);

create table Customers(
CustomersId int unsigned primary key auto_increment,
CustomerName varchar(50) not null,
CustomerAddress varchar(50) not null,
CustomerEmail varchar(50) not null,
PhoneNumber varchar(30) not null,
unique(CustomerEmail, PhoneNumber)
);


create table Orders(
    OrdersID int unsigned primary key auto_increment,
    CarId int unsigned,
    CustomersId int unsigned,
    DateOrder DATE,
    foreign key (CustomersId) references Customers (CustomersId),
    foreign key (CarId) references Car(CarId)
);
