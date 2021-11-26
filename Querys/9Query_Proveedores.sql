USE BD_Sistema

CREATE TABLE proveedores(
	cod_proveedor INT IDENTITY PRIMARY KEY,
	proveedor_real VARCHAR(100) NOT NULL,
	proveedor_fantasia VARCHAR(100) NOT NULL,
	correo VARCHAR(50) NOT NULL,
	telefono INT NOT NULL,
	celular INT NOT NULL,
	cedula INT NOT NULL,
	contacto VARCHAR(50) NOT NULL,
	ubicacion VARCHAR(100) NOT NULL,
	observaciones VARCHAR(100) DEFAULT ('Ninguna observación')
)

CREATE TABLE bancos_cuentas(
	cuenta VARCHAR(100) NOT NULL,
	banco VARCHAR(100) NOT NULL,

	cod_proveedor INT NOT NULL,

	FOREIGN KEY (cod_proveedor) REFERENCES proveedores(cod_proveedor)
)

CREATE TABLE articulos(
	cod_articulo INT IDENTITY PRIMARY KEY,
	nombre_articulo VARCHAR(50) NOT NULL
)

CREATE TABLE articulos_proveedores(
	cod_proveedor INT NOT NULL,
	cod_articulo INT NOT NULL,

	FOREIGN KEY (cod_proveedor) REFERENCES proveedores(cod_proveedor),
	FOREIGN KEY (cod_articulo) REFERENCES articulos(cod_articulo)
)