USE BD_Sistema

CREATE TABLE facturas(
	cod_factura INT IDENTITY PRIMARY KEY,
	institucion VARCHAR(100) NOT NULL,
	fecha_factura DATE NOT NULL,
	fecha_cancelado DATE NOT NULL,	
	transferencia INT NOT NULL,
	estado VARCHAR(50) NOT NULL,
	efectivo BIT NOT NULL,
	moneda BIT NOT NULL,
	monto MONEY NOT NULL,
	renta MONEY NOT NULL,
	institucion_cedida VARCHAR(100) NOT NULL,
	banco VARCHAR(100) NOT NULL,
	observaciones VARCHAR(100) DEFAULT ('Ninguna observación'),

	cod_Contratacion VARCHAR(50) NOT NULL,

	FOREIGN KEY (cod_Contratacion) REFERENCES contrataciones(cod_Contratacion)
)