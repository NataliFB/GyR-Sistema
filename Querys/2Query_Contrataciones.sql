USE BD_Sistema

-- Tabla de Contrataciones. Aquí se almacenan las contrataciones ingresadas

CREATE TABLE contrataciones(
	cod_contratacion VARCHAR(50) PRIMARY KEY,
	institucion VARCHAR(100) NOT NULL,
	descripcion VARCHAR(200) NOT NULL,
	fecha_publicacion SMALLDATETIME NOT NULL,
	fecha_apertura SMALLDATETIME NOT NULL,
	observaciones VARCHAR(100)

	cod_empleado SMALLINT NOT NULL,
	FOREIGN KEY (cod_empleado) REFERENCES empleado(cod_empleado)
)

-- Tabla para guardar el estado de cada contratacion una vez ya se sepa

CREATE TABLE estado_contratacion(
	estado VARCHAR(50) NOT NULL,
	cod_contratacion VARCHAR(50),
	FOREIGN KEY (cod_Contratacion) REFERENCES contrataciones(cod_Contratacion) 
)

-- Tabla de responsables. Para guardar el responsable de cada contratación

CREATE TABLE responsable(
	cod_empleado SMALLINT NOT NULL,
	cod_contratacion VARCHAR(50) NOT NULL,
	FOREIGN KEY (cod_contratacion) REFERENCES contrataciones(cod_contratacion),
	FOREIGN KEY (cod_empleado) REFERENCES empleado(cod_empleado)
)		

CREATE TABLE contrataciones_incompletas(
	cod_contratacion VARCHAR(50),
	institucion VARCHAR(100) NOT NULL,
	descripcion VARCHAR(200) NOT NULL,
	fecha_publicacion SMALLDATETIME NOT NULL,
	fecha_apertura SMALLDATETIME NOT NULL,
	observaciones VARCHAR(100),
)