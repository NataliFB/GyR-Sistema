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

-- Tabla de Empleado --

CREATE TABLE Empleado(
	cod_Empleado SMALLINT IDENTITY(0,1) PRIMARY KEY,
	nombre_Empleado VARCHAR(50) NOT NULL,
	appelido1_Empleado VARCHAR(50) NOT NULL,
	appelido2_Empleado VARCHAR(50) NOT NULL,
	color_empleado VARCHAR(7) NOT NULL,
	cod_rol SMALLINT,
	FOREIGN KEY (cod_rol) REFERENCES roles(cod_rol)
)

-- Tabla de Contrataciones. Aquí se almacenan las contrataciones ingresadas

CREATE TABLE contrataciones(
	cod_Contratación VARCHAR(50) PRIMARY KEY,
	institucion VARCHAR(100) NOT NULL,
	descripcion VARCHAR(200) NOT NULL,
	fecha_publicacion DATETIME NOT NULL,
	fecha_apertura DATETIME NOT NULL 
)

-- Tabla para guardar el estado de cada contratacion una vez ya se sepa

CREATE TABLE estado_contratacion(
	estado BIT NOT NULL,
	cod_Contratacion VARCHAR(50),
	FOREIGN KEY (cod_Contratacion) REFERENCES contrataciones(cod_Contratación) 
)

