USE BD_Sistema

-- Tabla de garantias

CREATE TABLE garantias(
	cod_garantia INT IDENTITY PRIMARY KEY,
	institucion VARCHAR(100) NOT NULL,
	fecha_pago DATE NOT NULL,
	fecha_devolucion DATE default(null),
	tiempo DATE NOT NULL,
	estado VARCHAR(30) DEFAULT('Pendiente'),
	objeto VARCHAR(50) NOT NULL,
	observaciones VARCHAR(100) DEFAULT('Ninguna observación'),
	monto MONEY NOT NULL,
	tipo_garantia VARCHAR(15) NOT NULL,

	encargado_envio SMALLINT NOT NULL,
	cod_empleado SMALLINT NOT NULL,
	cod_Contratacion VARCHAR(50) NOT NULL,

	FOREIGN KEY (encargado_envio) REFERENCES empleado (cod_Empleado),
	FOREIGN KEY (cod_Empleado) REFERENCES empleado (cod_Empleado),
	FOREIGN KEY (cod_Contratacion) REFERENCES contrataciones (cod_Contratacion)
)


CREATE TABLE tipo_garantia(
	cod_tipogarantia TINYINT IDENTITY PRIMARY KEY,
	tipo_garantia VARCHAR(50) NOT NULL	
)

CREATE TABLE tipogarantias_garantias(
	cod_tipogarantia INT NOT NULL,
	cod_garantia INT NOT NULL
)