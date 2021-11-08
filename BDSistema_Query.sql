CREATE DATABASE BD_Sistema

USE BD_Sistema

-- Tabla para guardar los roles --

CREATE TABLE roles(
	cod_rol INT PRIMARY KEY,
	nombre_rol VARCHAR(50) not null
)

INSERT INTO roles values (1,'Administrador')
INSERT INTO roles values (2,'Nivel Básico')
INSERT INTO roles values (3,'Contador')

SELECT * FROM roles

-- Tabla de Empleado --

CREATE TABLE Empleado(
	cod_Empleado INT IDENTITY(0,1) PRIMARY KEY,
	nombre_Empleado VARCHAR(50) NOT NULL,
	appelido1_Empleado VARCHAR(50) NOT NULL,
	appelido2_Empleado VARCHAR(50) NOT NULL,
	cod_rol int,
	FOREIGN KEY (cod_rol) REFERENCES roles(cod_rol)
)

