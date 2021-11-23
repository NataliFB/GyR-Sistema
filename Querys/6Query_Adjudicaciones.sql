USE BD_Sistema

CREATE TABLE adjudicaciones(
	cod_adjudicacion INT IDENTITY PRIMARY KEY,
	institucion VARCHAR(100) NOT NULL,
	dias_entrega TINYINT NOT NULL,
	modalidad_dias BIT NOT NULL,
	empresa BIT NOT NULL,
	modalida_entrega VARCHAR(30) NOT NULL,
	descripcion VARCHAR(100) NOT NULL,
	estado BIT NOT NULL,
	observaciones VARCHAR(100) DEFAULT ('Ninguna observación'),

	cod_empleado SMALLINT NOT NULL,
	cod_Contratacion VARCHAR(50) NOT NULL,

	FOREIGN KEY (cod_empleado) REFERENCES empleado (cod_empleado),
	FOREIGN KEY (cod_contratacion) REFERENCES contrataciones (cod_contratacion)
)