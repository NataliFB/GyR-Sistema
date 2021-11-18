USE BD_Sistema

-- Tabla de Contrataciones. Aquí se almacenan las contrataciones ingresadas

CREATE TABLE contrataciones(
	cod_Contratacion VARCHAR(50) PRIMARY KEY,
	institucion VARCHAR(100) NOT NULL,
	descripcion VARCHAR(200) NOT NULL,
	fecha_publicacion DATETIME NOT NULL,
	fecha_apertura DATETIME NOT NULL 
)

-- Tabla para guardar el estado de cada contratacion una vez ya se sepa

CREATE TABLE estado_contratacion(
	estado BIT NOT NULL,
	cod_Contratacion VARCHAR(50),
	FOREIGN KEY (cod_Contratacion) REFERENCES contrataciones(cod_Contratacion) 
)

-- Tabla de responsables. Para guardar el responsable de cada contratación

CREATE TABLE responsable(
	cod_Empleado SMALLINT NOT NULL,
	cod_Contratacion VARCHAR(50) NOT NULL,
	FOREIGN KEY (cod_Contratacion) REFERENCES contrataciones(cod_Contratacion),
	FOREIGN KEY (cod_Empleado) REFERENCES empleado(cod_Empleado)
)			