USE BD_Sistema

CREATE TABLE entregadas(
	cod_entregadas INT IDENTITY PRIMARY KEY,
	dias_entrega INT NOT NULL,
	fecha_entrega DATE NOT NULL,
	lugar_entrega VARCHAR(100) NOT NULL,
	descripcion VARCHAR(100) NOT NULL,
	empresa BIT NOT NULL,
	observaciones VARCHAR(100) DEFAULT('Ninguna observación'),
	medio_entrega VARCHAR(100) NOT NULL,

	cod_empleado SMALLINT NOT NULL,
	cod_Contratacion VARCHAR(50) NOT NULL,

	FOREIGN KEY (cod_Empleado) REFERENCES empleado (cod_Empleado),
	FOREIGN KEY (cod_Contratacion) REFERENCES contrataciones (cod_Contratacion)
)