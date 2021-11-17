USE BD_Sistema

CREATE TABLE orden(
	cod_orden INT IDENTITY(0,1) PRIMARY KEY,
	dias_entrega TINYINT NOT NULL,
	vigencia_contrato TINYINT NOT NULL,
	fecha_limite DATE NOT NULL,
	descripcion VARCHAR(100) NOT NULL,
	num_orden INT NOT NULL,
	lugar_entrega VARCHAR(100) NOT NULL,
	observaciones VARCHAR(100) DEFAULT ('Ninguna observación'),

	cod_empleado SMALLINT NOT NULL,
	cod_Contratacion VARCHAR(50) NOT NULL,

	FOREIGN KEY (cod_Empleado) REFERENCES empleado (cod_Empleado),
	FOREIGN KEY (cod_Contratacion) REFERENCES contrataciones (cod_Contratacion)
)
