create database toll_bill_generator;
use toll_bill_generator;

show tables;

create table admin_credentials(
	sno int primary key auto_increment,
    admin_id int,
    name varchar(20),
    age int,
    dob date,
    phone_number varchar(10),
    address varchar(100),
    gender varchar(15),
    email varchar(30),
    password varchar(20)
);
drop table admin_credentials;

insert into admin_credentials(admin_id,name,age,dob,phone_number,address,gender,email,password) values(841855, "Dayasudan", 23, "1998-10-04", "8248834742", "Theni", "Male", "dayasudan1998@gmail.com", "Daya_5016");
truncate table admin_credentials;

select * from admin_credentials;

create table login_credentials (
    user_id int primary key auto_increment,
    user_type varchar(8),
    name varchar(20),
    password varchar(20)
);
drop table login_credentials;

insert into login_credentials(user_id, user_type, name, password) values("841855", "Admin", "Dayasudan", "Daya_5016");
truncate table login_credentials;
delete from login_credentials where user_type="User";
select * from login_credentials;
SET SQL_SAFE_UPDATES=0;
create table manager_registration_details (
    id int primary key,
    first_name varchar(20),
    last_name varchar(20),
    age int,
    phone_number varchar(11),
    address varchar(100),
    gender varchar(15),
    email varchar(30),
    password varchar(20),
    approval varchar(15)
);

desc manager_registration_details;
drop table manager_registration_details;
select * from manager_registration_details;

truncate table manager_registration_details;

create table user_registration_details (
	id int primary key,
    first_name varchar(20),
    last_name varchar(20),
    age int,
    phone_number varchar(10),
    address varchar(100),
    gender varchar(15),
    email varchar(30),
    password varchar(20),
    approval varchar(15)
);

truncate table user_registration_details;
drop table user_registration_details;
select * from user_registration_details;

create table toll_gate_generator (
	id int primary key,
    from_place varchar(30),
    to_place varchar(30),
    no_of_tolls int,
    cities_crossing_by varchar(100),
    avg_rate int,
    approval varchar(15)
);
desc toll_gate_generator;
SELECT * from toll_gate_generator WHERE from_place='chennai' AND to_place='tirunelveli' AND approval='approved' ORDER BY id;
truncate table toll_gate_generator;
drop table toll_gate_generator;
select * from toll_gate_generator;
SELECT DISTINCT from_place FROM toll_gate_generator WHERE approval='approved' ORDER BY id;
SELECT DISTINCT to_place FROM toll_gate_generator WHERE approval='approved' ORDER BY id;

INSERT INTO toll_gate_generator(id, from_place, to_place, no_of_tolls, cities_crossing_by, avg_rate, approval) VALUES
(1, "chennai", "coimbatore", 5, "chennai, villupuram, salem, erode, coimbatore", 50, "approved"), 
(2, "chennai", "madurai", 6, "chennai, villupuram, salem, trichy, dindugal, madurai", 60, "approved"), 
(3, "chennai", "salem", 3, "chennai, villupuram, salem", 30, "approved"),
(4, "chennai", "tirunelveli", 7, "chennai, villupuram, salem, trichy, madurai, virudhunagar, tirunelveli", 70, "approved"),
(5, "chennai", "thoothukudi", 7, "chennai, villupuram, salem, trichy, madurai, virudhunagar, thoothukudi", 70, "approved"),
(6, "coimbatore", "chennai", 5, "coimbatore, erode, salem, villupuram, chennai", 50, "approved"),
(7, "coimbatore", "madurai", 4, "coimbatore, erode, dindugal, madurai", 40, "approved"), 
(8, "coimbatore", "salem", 3, "coimbatore, erode, salem", 30, "approved"),
(9, "coimbatore", "tirunelveli", 6, "coimbatore, erode, dindugal, madurai, virudhunagar, tirunelveli", 60, "approved"),
(10, "coimbatore", "thoothukudi", 6, "coimbatore, erode, dindugal, madurai, virudhunagar, thoothukudi", 60, "approved"),
(11, "madurai", "chennai", 6, "madurai, dindugal, trichy, salem, villupuram, chennai", 60, "approved"),
(12, "madurai", "coimbatore", 4, "madurai, dindugal, erode, coimbatore", 40, "approved"), 
(13, "madurai", "salem", 4, "madurai, dindugal, trichy, salem", 30, "approved"),
(14, "madurai", "tirunelveli", 3, "madurai, virudhunagar, tirunelveli", 30, "approved"),
(15, "madurai", "thoothukudi", 3, "madurai, virudhunagar, thoothukudi", 30, "approved"),
(16, "salem", "chennai", 3, "salem, villupuram, chennai", 30, "approved"),
(17, "salem", "coimbatore", 3, "salem, erode, coimbatore", 30, "approved"), 
(18, "salem", "madurai", 4, "salem, trichy, dindugal, madurai", 40, "approved"),
(19, "salem", "tirunelveli", 6, "salem, trichy, dindugal, madurai, virudhunagar, tirunelveli", 60, "approved"),
(20, "salem", "thoothukudi", 6, "salem, trichy, dindugal, madurai, virudhunagar, thoothukudi", 60, "approved"),
(21, "tirunelveli", "chennai", 7, "tirunelveli, virudhunagar, madurai, trichy, salem, villupuram, chennai", 70, "approved"),
(22, "tirunelveli", "coimbatore", 6, "tirunelveli, viruchunagar, madurai, dindugal, erode, coimbatore", 60, "approved"), 
(23, "tirunelveli", "salem", 6, "tirunelveli, viruchunagar, madurai, dindugal, trichy, salem,", 60, "approved"),
(24, "tirunelveli", "madurai", 3, "tirunelveli, viruchunagar, madurai", 30, "approved"),
(25, "tirunelveli", "thoothukudi", 2, "tirunelveli, thoothuudi", 20, "approved"),
(26, "thoothukudi", "chennai", 7, "thoothukudi, virudhunagar, madurai, trichy, salem, villupuram, chennai", 70, "approved"),
(27, "thoothukudi", "coimbatore", 6, "thoothukudi, virudhunagar, madurai, dindugal, erode, coimbatore", 60, "approved"), 
(28, "thoothukudi", "salem", 6, "thoothukudi, virudhunagar, madurai, dindugal, trichy, salem", 60, "approved"),
(29, "thoothukudi", "tirunelveli", 2, "thoothukudi, tirunelveli", 20, "approved"),
(30, "thoothukudi", "madurai", 3, "thoothukudi, virudhunagar, madurai", 30, "approved");

create table toll_details (
	toll_id int primary key,
    highway_city varchar(20),
    no_of_lanes int,
    class_A_lane_no int, 
    class_A_lane_vehicles varchar(60),
    class_B_lane_no int,
    class_B_lane_vehicles varchar(60),
    class_C_lane_no int,
    class_C_lane_vehicles varchar(60),
    class_D_lane_no int,
    class_D_lane_vehicles varchar(60),
    approval varchar(15)
);

desc toll_details;
truncate table toll_details;
drop table toll_details;
select * from toll_details;
delete from tol_details where toll_id = 12;

insert into toll_details (toll_id, highway_city, no_of_lanes, class_A_lane_no, class_A_lane_vehicles, class_B_lane_no, class_B_lane_vehicles, class_C_lane_no, class_C_lane_vehicles, class_D_lane_no, class_d_lane_vehicles, approval) values
(1, "chennai", 10, 2, "bicycles, motor-cycles", 3, "taxis, sedan, hatch-back, MPV", 3, "SUV, coupe, convertible, crossover", 2, "omni-bus, lorry, truck, containers", "approved"),
(2, "villupuram", 4, 1, "bicycles, motor-cycles", 1, "taxis, MPV", 1, "SUV, coupe", 1, "omni-bus, lorry, truck", "approved"),
(3, "salem", 8, 2, "bicycles, motor-cycles", 2, "taxis, sedan, hatch-back, MPV", 2, "SUV, coupe", 2, "omni-bus, lorry, truck, containers", "approved"),
(4, "coimbatore", 8, 2, "bicycles, motor-cycles", 2, "taxis, sedan, hatch-back, MPV", 2, "SUV, coupe, crossover", 2, "omni-bus, lorry, truck, containers", "approved"),
(5, "erode", 4, 1, "bicycles, motor-cycles", 1, "taxis, MPV", 1, "SUV, coupe", 1, "omni-bus, lorry, truck", "approved"),
(6, "trichy", 6, 2, "bicycles, motor-cycles", 2, "taxis, sedan, hatch-back, MPV", 1, "SUV", 1, "omni-bus, lorry, truck", "approved"),
(7, "madurai", 8, 2, "bicycles, motor-cycles", 2, "taxis, sedan, hatch-back, MPV", 2, "SUV, coupe, convertible, crossover", 2, "omni-bus, lorry, truck, containers", "approved"),
(8, "dindugal", 6, 2, "bicycles, motor-cycles", 2, "taxis, sedan, hatch-back, MPV", 1, "SUV", 1, "omni-bus, lorry, truck", "approved"),
(9, "virudhunagar", 6, 2, "bicycles, motor-cycles", 2, "taxis, sedan, hatch-back, MPV", 1, "SUV", 1, "omni-bus, lorry, truck", "approved"),
(10, "tirunelveli", 6, 2, "bicycles, motor-cycles", 2, "taxis, sedan, hatch-back, MPV", 1, "SUV", 1, "omni-bus, lorry, truck", "approved"),
(11, "thoothukudi", 6, 2, "bicycles, motor-cycles", 2, "taxis, sedan, hatch-back, MPV", 1, "SUV", 1, "omni-bus, lorry, truck", "approved");

UPDATE toll_details SET highway_city='Theni', no_of_lanes=8, class_A_lane_no=2, class_A_lane_vehicles='bicycles, motor-cycles', class_B_lane_no=2, class_B_lane_vehicles='taxis, sedan, hatch-back, MPV', class_C_lane_no=2, class_C_lane_vehicles='SUV, coupe, convertible, crossover', class_D_lane_no=2, class_D_lane_vehicles='omni-bus, lorry, truck, containers' WHERE toll_id=12;
select * from toll_details where highway_city in (SELECT cities_crossing_by from toll_gate_generator WHERE from_place="chennai" AND to_place="tirunelveli" AND approval="approved");
select * from toll_details where highway_city in ('chennai', 'villupuram', 'salem', 'trichy', 'madurai', 'virudhunagar', 'tirunelveli') and approval="approved" order by toll_id;
SELECT * from toll_details WHERE highway_city="virudhunagar" AND approval="approved";
SELECT cities_crossing_by from toll_gate_generator WHERE from_place="chennai" AND to_place="tirunelveli" AND approval="approved";
