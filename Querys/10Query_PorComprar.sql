USE BD_Sistema

CREATE TABLE por_comprar(
	cod_porcomprar INT IDENTITY NOT NULL,
	objeto VARCHAR(100) NOT NULL,
	monto_ofertado MONEY NOT NULL,
	costo MONEY NOT NULL,
	observacion VARCHAR(100) DEFAULT('Ninguna observación'),

	cod_proveedor INT NOT NULL,
	cod_contratacion VARCHAR(50) NOT NULL,

	FOREIGN KEY (cod_proveedor) REFERENCES proveedores(cod_proveedor),
	FOREIGN KEY (cod_contratacion) REFERENCES contrataciones(cod_contratacion)
)