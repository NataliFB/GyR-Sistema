USE BD_Sistema

CREATE TABLE renta(
	cod_renta INT IDENTITY PRIMARY KEY,
	num_facura INT NOT NULL,
	descripcion VARCHAR(100) NOT NULL,
	modalidad VARCHAR(100) NOT NULL,
	telefono INT NOT NULL,
	fecha_renta DATE NOT NULL,
	nacionalidad VARCHAR(100) NOT NULL,
	moneda BIT NOT NULL,
	subtotal MONEY NOT NULL,
	impuesto MONEY NOT NULL,
	total MONEY NOT NULL,
	renta MONEY NOT NULL,
	tipo_renta BIT	NOT NULL,
		
	cod_contratacion VARCHAR(50) NOT NULL,
	cod_proveedor INT NOT NULL,

	FOREIGN KEY (cod_contratacion) REFERENCES contrataciones(cod_Contratacion),
	FOREIGN KEY (cod_proveedor) REFERENCES proveedores(cod_proveedor)
)