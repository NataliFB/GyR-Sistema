USE BD_Sistema

CREATE TABLE muestras(
	cod_muestra INT IDENTITY PRIMARY KEY,
	institucion VARCHAR(100) NOT NULL,
	objeto VARCHAR(100) NOT NULL,
	cantidad TINYINT NOT NULL,
	fecha_entrega DATE NOT NULL,
	fecha_retiro DATE DEFAULT (null),
	estado VARCHAR(30) DEFAULT('Pendiente'),
	observaciones VARCHAR(100) DEFAULT('Ninguna observación'),

	cod_empleado SMALLINT NOT NULL,
	cod_contratacion VARCHAR(50) NOT NULL,

	FOREIGN KEY (cod_empleado) REFERENCES empleado(cod_empleado),
	FOREIGN KEY (cod_contratacion) REFERENCES contrataciones(cod_contratacion)
)