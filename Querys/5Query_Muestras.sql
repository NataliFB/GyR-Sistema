USE BD_Sistema

CREATE TABLE muestras(
	cod_muestra INT IDENTITY(0,1),
	objeto VARCHAR(100) NOT NULL,
	cantidad TINYINT NOT NULL,
	fecha_entrega DATE NOT NULL,
	fecha_retiro DATE DEFAULT (null),
	estado VARCHAR(30) DEFAULT('Pendiente'),
	observaciones VARCHAR(100) DEFAULT('Ninguna observación'),

	cod_empleado SMALLINT NOT NULL,
	cod_Contratacion VARCHAR(50) NOT NULL,

	FOREIGN KEY (cod_Empleado) REFERENCES empleado(cod_Empleado),
	FOREIGN KEY (cod_Contratacion) REFERENCES contrataciones(cod_Contratacion)
)