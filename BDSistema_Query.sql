CREATE DATABASE BD_Sistema

USE BD_Sistema

-- Tabla para guardar los roles --

CREATE TABLE roles(
	cod_rol SMALLINT PRIMARY KEY,
	nombre_rol VARCHAR(50) not null
)

-- Se añade los roles o niveles para administrar los empleados

INSERT INTO roles values (1,'Administrador')
INSERT INTO roles values (2,'Nivel Básico')
INSERT INTO roles values (3,'Contador')

SELECT * FROM roles

-- Tabla de Empleado --

CREATE TABLE Empleado(
	cod_Empleado SMALLINT IDENTITY(0,1) PRIMARY KEY,
	nombre_Empleado VARCHAR(50) NOT NULL,
	appelido1_Empleado VARCHAR(50) NOT NULL,
	appelido2_Empleado VARCHAR(50) NOT NULL,
	cod_rol int,
	FOREIGN KEY (cod_rol) REFERENCES roles(cod_rol)
)

CREATE TABLE marca_Entradas(
	cod_Entrada INT IDENTITY(0,1) PRIMARY KEY,
	hora_entrada 
)

-- Tabla de Contrataciones. Aquí se almacenan las contrataciones ingresadas

CREATE TABLE contrataciones(
	cod_Contratación VARCHAR(50) PRIMARY KEY,
	institucion VARCHAR(100) NOT NULL,
	descripcion VARCHAR(200) NOT NULL,
	fecha_publicacion DATETIME NOT NULL,
	fecha_apertura DATETIME NOT NULL 
)

CREATE TABLE proveedor(
	cod_Proveedor SMALLINT IDENTITY(0,1) PRIMARY KEY,
	nombre_prov VARCHAR(100) not null,
	cedula_juridica SMALLINT not null,
	telefono 
)