USE BD_Sistema

-- Tabla para guardar los roles --

CREATE TABLE roles(
	cod_rol SMALLINT PRIMARY KEY,	
	nombre_rol VARCHAR(50) not null
)

-- Se a�ade los roles o niveles para administrar los empleados

INSERT INTO roles VALUES (1,'Administrador')
INSERT INTO roles VALUES (2,'Nivel B�sico')
INSERT INTO roles VALUES (3,'Contador')
INSERT INTO roles VALUES (4,'Personalizado')

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

-- Tabla para guardar los datos para el inicio de sesi�n del usuario

CREATE TABLE userEmpleado(
	usuario VARCHAR(50) PRIMARY KEY,
	contrase�a VARCHAR(MAX) NOT NULL,
	cod_empleado SMALLINT NOT NULL,
	FOREIGN KEY (cod_empleado) REFERENCES empleado(cod_empleado)
)

CREATE TABLE permisos(
	ingresar_contrataciones BIT NOT NULL,
	adjudicaciones BIT NOT NULL,
	timbres BIT NOT NULL,
	por_comprar BIT NOT NULL,
	facturas BIT NOT NULL,
	renta BIT NOT NULL,
	proveedores BIT NOT NULL,
	acceso_empleados BIT NOT NULL,
	acceso_contrataciones BIT NOT NULL,

	cod_empleado  SMALLINT NOT NULL,

	FOREIGN KEY (cod_empleado) REFERENCES empleado(cod_empleado)
)