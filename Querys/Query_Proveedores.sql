USE BD_Sistema

CREATE TABLE proveedores(
	cod_proveedor TINYINT IDENTITY(0,1) PRIMARY KEY,
	proveedor_real VARCHAR(100) NOT NULL,
	proveedor_fantasia VARCHAR(100) NOT NULL,
	correo VARCHAR(50) NOT NULL,
	telefono INT NOT NULL,
	cedula INT NOT NULL,
	articulos VARCHAR(100),
	observaciones VARCHAR(100) DEFAULT ('Ninguna observación')
)

CREATE TABLE bancos_cuentas(
	cod_bancos_cuentas TINYINT IDENTITY(0,1) PRIMARY KEY,
	cuenta VARCHAR(100) NOT NULL,
	banco VARCHAR(100) NOT NULL,
)

CREATE TABLE cuentas_bancos_proveedores(
	cod_proveedor TINYINT NOT NULL,
	cod_bancos_cuentas TINYINT NOT NULL,

	FOREIGN KEY (cod_proveedor) REFERENCES proveedores(cod_proveedor),
	FOREIGN KEY (cod_bancos_cuentas) REFERENCES bancos_cuentas(cod_bancos_cuentas)
)