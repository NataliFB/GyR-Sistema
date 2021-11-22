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
	tipo_garantia VARCHAR(50) NOT NULL,

	encargado_envio SMALLINT NOT NULL,
	cod_empleado SMALLINT NOT NULL,
	cod_contratacion VARCHAR(50) NOT NULL,

	FOREIGN KEY (encargado_envio) REFERENCES empleado (cod_empleado),
	FOREIGN KEY (cod_empleado) REFERENCES empleado (cod_empleado),
	FOREIGN KEY (cod_contratacion) REFERENCES contrataciones (cod_contratacion)
)