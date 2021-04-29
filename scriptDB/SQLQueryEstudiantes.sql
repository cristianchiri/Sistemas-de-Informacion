create database umss_db

use umss_db

create table Estudiantes(
	id int primary key identity (1,1) not null,
	nombres varchar(40) not null,
	apellido_paterno varchar(20) not null,
	apellido_materno varchar(20) not null,
	condigo_sis int not null,
	ci int not null,
	fecha_nacimiento datetime not null
);

insert into Estudiantes
(nombres,apellido_paterno,apellido_materno,condigo_sis,ci,fecha_nacimiento)
values('Pepito','Gutierrez','Lopez',201805980,4563285,'1998-05-03');

insert into Estudiantes
(nombres,apellido_paterno,apellido_materno,condigo_sis,ci,fecha_nacimiento)
values('Jerry','Vega','Sanchez',201805980,4563285,'1998-05-03');

insert into Estudiantes
(nombres,apellido_paterno,apellido_materno,condigo_sis,ci,fecha_nacimiento)
values('Sandra','Arrazola','Gomez',201805980,4563285,'1998-05-03');

use master
drop database umss_db