USE BD_Sistema

CREATE TABLE por_comprar(
	objeto VARCHAR(100) NOT NULL,
	monto_ofertado MONEY NOT NULL,
	costo MONEY NOT NULL,
	observacion VARCHAR(100) DEFAULT(''),

	cod_proveedor TINYINT NOT NULL,
	cod_Contratacion VARCHAR(50) NOT NULL,

	FOREIGN KEY (cod_proveedor) REFERENCES proveedores(cod_proveedor),
	FOREIGN KEY (cod_Contratacion) REFERENCES contrataciones(cod_Contratacion)
)