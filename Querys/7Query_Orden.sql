USE BD_Sistema

CREATE TABLE orden(
	cod_orden INT IDENTITY PRIMARY KEY,
	dias_entrega TINYINT NOT NULL,
	vigencia_contrato TINYINT NOT NULL,
	fecha_limite DATE NOT NULL,
	descripcion VARCHAR(100) NOT NULL,
	num_orden INT NOT NULL,
	lugar_entrega VARCHAR(100) NOT NULL,
	observaciones VARCHAR(100) DEFAULT ('Ninguna observación'),
	modalidad VARCHAR(100) NOT NULL,

	cod_empleado SMALLINT NOT NULL,
	cod_contratacion VARCHAR(50) NOT NULL,

	FOREIGN KEY (cod_empleado) REFERENCES empleado (cod_empleado),
	FOREIGN KEY (cod_contratacion) REFERENCES contrataciones (cod_contratacion)
)