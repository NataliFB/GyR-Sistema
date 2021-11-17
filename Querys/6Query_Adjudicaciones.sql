USE BD_Sistema

CREATE TABLE adjudicaciones(
	cod_adjudicacion INT IDENTITY(0,1) PRIMARY KEY
	dias_entrega TINYINT NOT NULL,
	modalidad_dias BIT NOT NULL,
	empresa BIT NOT NULL,
	modalida_entrega VARCHAR(30) NOT NULL,
	descripcion VARCHAR(100) NOT NULL,
	estado BIT NOT NULL,
	observaciones VARCHAR(100) DEFAULT ('Ninguna observación'),

	cod_empleado SMALLINT NOT NULL,
	cod_Contratacion VARCHAR(50) NOT NULL,

	FOREIGN KEY (cod_Empleado) REFERENCES empleado (cod_Empleado),
	FOREIGN KEY (cod_Contratacion) REFERENCES contrataciones (cod_Contratacion)
)