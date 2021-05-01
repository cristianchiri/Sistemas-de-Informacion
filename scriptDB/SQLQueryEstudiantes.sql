create database umss_db

use umss_db

create table estudiantes(
	id int primary key identity (1,1) not null,
	nombres varchar(40) not null,
	apellido_paterno varchar(20) not null,
	apellido_materno varchar(20) not null,
	condigo_sis int not null,
	ci int not null,
	fecha_nacimiento date not null,
	carrera varchar(40) not null,
	facultad varchar(40) not null,
	expedido varchar(10) not null
);
create table registro_ventas(
	id int primary key identity (1,1) not null,
	fecha_compra datetime not null,
	gestion varchar(20) not null,
	constraint fk_estudiante foreign key (idEstudiante) references estudiantes (id)
);

/*Datos de prueba para la tabla estudiante*/
insert into estudiantes
(nombres,apellido_paterno,apellido_materno,condigo_sis,ci,fecha_nacimiento,carrera, facultad,expedido)
values('Pepito','Gutierrez','Lopez',201805980,4563285,'1998-05-03','Ing. Sistemas', 'Tecnología','cbba');

insert into estudiantes
(nombres,apellido_paterno,apellido_materno,condigo_sis,ci,fecha_nacimiento,carrera, facultad,expedido)
values('Jerry','Vega','Sanchez',201805980,4563285,'1998-05-03','Ing. Sistemas', 'Tecnología','cbba');

insert into estudiantes
(nombres,apellido_paterno,apellido_materno,condigo_sis,ci,fecha_nacimiento,carrera, facultad,expedido)
values('Sandra','Arrazola','Gomez',201805980,4563285,'1998-05-03','Ing. Sistemas', 'Tecnología','cbba');

/*Datos de prueba de la tabla registro_ventas*/
insert into registro_ventas
	(fecha_compra, gestion, idEstudiante)
	values ('2021-01-02','1-2021',1);

use master
drop database umss_db