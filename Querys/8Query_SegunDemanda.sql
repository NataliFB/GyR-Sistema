USE BD_Sistema

CREATE TABLE segun_demanda(
	cod_segunDemanda INT IDENTITY(0,1) PRIMARY KEY,


	cod_empleado TINYINT NOT NULL,
	cod_Contratacion VARCHAR(50) NOT NULL,

	FOREIGN KEY (cod_Empleado) REFERENCES empleado (cod_Empleado),
	FOREIGN KEY (cod_Contratacion) REFERENCES contrataciones (cod_Contratacion)
)