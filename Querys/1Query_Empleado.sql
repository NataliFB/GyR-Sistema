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

-- Tabla de Empleado que guarda los datos necesarios del empleado

CREATE TABLE empleado(
	cod_empleado SMALLINT IDENTITY PRIMARY KEY,
	nombre_empleado VARCHAR(50) NOT NULL,
	apellido1_empleado VARCHAR(50) NOT NULL,
	apellido2_empleado VARCHAR(50) NOT NULL,
	cod_rol SMALLINT NOT NULL,
	cod_color VARCHAR(7) UNIQUE NOT NULL,

	FOREIGN KEY (cod_rol) REFERENCES roles(cod_rol)
)

-- Tabla para guardar los datos para el inicio de sesión del usuario

CREATE TABLE userEmpleado(
	usuario VARCHAR(50) PRIMARY KEY,
	contraseña VARCHAR(MAX) NOT NULL,
	cod_empleado SMALLINT NOT NULL,
	FOREIGN KEY (cod_empleado) REFERENCES empleado(cod_empleado)
)
