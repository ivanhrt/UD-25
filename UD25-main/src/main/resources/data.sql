--ex1
DROP table IF EXISTS fabricantes;
DROP table IF EXISTS articulos;
create table fabricantes(
id int auto_increment,
nombre varchar(100),
PRIMARY KEY (id)
);
create table articulos(
id int auto_increment,
nombre varchar(100),
precio int,
fabricante_id int,
PRIMARY KEY(id),
FOREIGN KEY(fabricante_id) REFERENCES fabricantes (id)
);
insert into fabricantes(nombre) values('fab1');
insert into fabricantes(nombre) values('fab2');
insert into fabricantes(nombre) values('fab3');
insert into fabricantes(nombre) values('fab4');
insert into fabricantes(nombre) values('fab5');
insert into articulos(nombre, precio, fabricante_id) values('tg1', 111, 1);
insert into articulos(nombre, precio, fabricante_id) values('tg2', 222, 2);
insert into articulos(nombre, precio, fabricante_id) values('tg3', 333, 3);
insert into articulos(nombre, precio, fabricante_id) values('tg4', 444, 4);
insert into articulos(nombre, precio, fabricante_id) values('tg5', 555, 5);

--ex2
DROP TABLE IF EXISTS Departamentos;
DROP TABLE IF EXISTS Empleados;
CREATE TABLE Departamentos(
codigo int PRIMARY KEY,
nombre nvarchar(100),
presupuesto int
);
CREATE TABLE Empleados(
dni varchar(9) PRIMARY KEY,
nombre nvarchar(100),
apellidos nvarchar(255),
cod_dep int,
FOREIGN KEY (cod_dep) REFERENCES Departamentos(codigo)
);
INSERT INTO Departamentos(codigo, nombre, presupuesto) VALUES(1, 'Dp1', 260);
INSERT INTO Departamentos(codigo, nombre, presupuesto) VALUES(2, 'Dp2', 550);
INSERT INTO Departamentos(codigo, nombre, presupuesto) VALUES(3, 'Dp3', 300);
INSERT INTO Empleados(dni, nombre, apellidos, cod_dep) VALUES('399', 'Ivan', 'Herrero', 1);
INSERT INTO Empleados(dni, nombre, apellidos, cod_dep) VALUES('778', 'Juan', 'Marin', 2);

--ex3
DROP table IF EXISTS warehouses;
DROP table IF EXISTS boxes;
create TABLE warehouses(
	id int auto_increment PRIMARY KEY,
	lugar varchar(100),
	capacidad int
);
create table boxes(
	num_ref varchar(5) PRIMARY KEY,
	valor int,
	contenido varchar(100),
	warehouse_id int,
	FOREIGN KEY(warehouse_id) REFERENCES warehouses(id)
);
INSERT INTO warehouses(lugar, capacidad) values('AL1',10);
INSERT INTO warehouses(lugar, capacidad) values('AL2',20);
INSERT INTO warehouses(lugar, capacidad) values('AL3',30);
INSERT INTO warehouses(lugar, capacidad) values('AL4',40);
INSERT INTO warehouses(lugar, capacidad) values('AL5',50);
INSERT INTO boxes(num_ref, valor, contenido, warehouse_id) values('AB122',10,'perfil',1);
INSERT INTO boxes(num_ref, valor, contenido, warehouse_id) values('CD456',20,'kit',1);
INSERT INTO boxes(num_ref, valor, contenido, warehouse_id) values('EF789',30,'brazo',2);
INSERT INTO boxes(num_ref, valor, contenido, warehouse_id) values('GH123',40,'motor',2);
INSERT INTO boxes(num_ref, valor, contenido, warehouse_id) values('IJ456',50,'panel',3);

--ex4
DROP TABLE IF EXISTS peliculas;
DROP TABLE IF EXISTS salas;
CREATE TABLE peliculas(
id int NOT NULL AUTO_INCREMENT,
nombre varchar(20),
clasificacion_edad int,
PRIMARY KEY(id)
);

CREATE TABLE salas(
id int NOT NULL AUTO_INCREMENT,
nombre varchar(20),
pelicula int,
PRIMARY KEY(id),
CONSTRAINT FK_Salas_pelicula FOREIGN KEY(pelicula) REFERENCES peliculas(id)
);

INSERT INTO peliculas (nombre, clasificacion_edad) VALUES ('300', 2);
INSERT INTO peliculas (nombre, clasificacion_edad) VALUES ('Gladiator', 1);
INSERT INTO peliculas (nombre, clasificacion_edad) VALUES ('Sonrisas y lagrimas', 3);
INSERT INTO salas (nombre, pelicula) VALUES ('Sala1', 1);
INSERT INTO salas (nombre, pelicula) VALUES ('Sala2', 1);
INSERT INTO salas (nombre, pelicula) VALUES ('Sala3', 3);