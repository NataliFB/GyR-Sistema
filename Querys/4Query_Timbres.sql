use BD_Sistema
	
CREATE TABLE timbres(
	cod_timbre INT IDENTITY PRIMARY KEY,
	institucion VARCHAR(100) NOT NULL,
	monto MONEY NOT NULL,
	estado VARCHAR(30) DEFAULT('Pendiente'),
	producto VARCHAR(100) NOT NULL,
	observaciones VARCHAR(100) DEFAULT ('Ninguna observación'),
	
	encargado_envio SMALLINT NOT NULL,
	cod_empleado SMALLINT NOT NULL,
	cod_Contratacion VARCHAR(50) NOT NULL,

	FOREIGN KEY (encargado_envio) REFERENCES empleado(cod_Empleado),
	FOREIGN KEY (cod_Empleado) REFERENCES empleado(cod_Empleado),
	FOREIGN KEY (cod_Contratacion) REFERENCES contrataciones (cod_Contratacion)
)