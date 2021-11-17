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

CREATE TABLE empleado(
	cod_Empleado SMALLINT IDENTITY(0,1) PRIMARY KEY,
	nombre_Empleado VARCHAR(50) NOT NULL,
	appelido1_Empleado VARCHAR(50) NOT NULL,
	appelido2_Empleado VARCHAR(50) NOT NULL,
	color_empleado VARCHAR(7) NOT NULL UNIQUE,
	cod_rol SMALLINT,
	FOREIGN KEY (cod_rol) REFERENCES roles(cod_rol)
)