USE BD_Sistema

CREATE TABLE por_comprar(
	cod_porcomprar INT IDENTITY NOT NULL,
	objeto VARCHAR(100) NOT NULL,
	monto_ofertado MONEY NOT NULL,
	costo MONEY NOT NULL,
	observacion VARCHAR(100) DEFAULT('Ninguna observación'),

	cod_proveedor TINYINT NOT NULL,
	cod_Contratacion VARCHAR(50) NOT NULL,

	FOREIGN KEY (cod_proveedor) REFERENCES proveedores(cod_proveedor),
	FOREIGN KEY (cod_Contratacion) REFERENCES contrataciones(cod_Contratacion)
)

CREATE TABLE por_comprar_bancos_cuentas_proveedores(
	cod_porcomprar INT NOT NULL,
	cod_bancos_cuentas INT NOT NULL,

	FOREIGN KEY (cod_porcomprar) REFERENCES por_comprar(cod_porcomprar),
	FOREIGN KEY (cod_bancos_cuentas) REFERENCES bancos_cuentas(cod_bancos_cuentas)
)