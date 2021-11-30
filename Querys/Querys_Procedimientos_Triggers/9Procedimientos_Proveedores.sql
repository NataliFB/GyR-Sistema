USE BD_Sistema

-------------------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para insertar un proveedor
GO
CREATE PROCEDURE insertar_proveedor
	@proveedor_real VARCHAR(100), @proveedor_fantasia VARCHAR(100), @correo VARCHAR(50), @telefono INT, @celular INT, @cedula INT,
	@contacto VARCHAR(50), @ubicacion VARCHAR(100), @observaciones VARCHAR(100)
AS 
	IF @observaciones = ''
		SET @observaciones = 'Ninguna observación'
BEGIN
	INSERT INTO proveedores VALUES (@proveedor_real, @proveedor_fantasia, @correo, @telefono, @celular, @cedula, @contacto,
	@ubicacion, @observaciones)
END

-------------------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para insertar bancos y cuentas
GO
CREATE PROCEDURE insertar_bancos_cuentas
	@cuenta VARCHAR(100), @banco VARCHAR(100), @cod_proveedor INT
AS BEGIN
	INSERT INTO bancos_cuentas VALUES (@cuenta, @banco, @cod_proveedor)
END

-------------------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para insertar artículos
GO
CREATE PROCEDURE insertar_articulos
	@articulo VARCHAR(50)
AS BEGIN
	INSERT INTO articulos VALUES (@articulo)
END
-------------------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para rellenar la tabla intermedia de articulos-proveedores
GO
CREATE PROCEDURE insertar_proveedor_articulos
	@cod_articulo INT, @cod_proveedor INT
AS BEGIN
	INSERT INTO articulos_proveedores VALUES (@cod_proveedor, @cod_articulo)
END
-------------------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para borrar un proveedor
GO
CREATE PROCEDURE borrar_proveedor
	@cod_proveedor INT
AS 
BEGIN
	DELETE proveedores WHERE cod_proveedor = @cod_proveedor
	DELETE bancos_cuentas WHERE cod_proveedor = @cod_proveedor
END
-------------------------------------------------------------------------------------------------------------------------------------------
-- Actualizar proveedor
GO
CREATE PROCEDURE actualizar_proveedor
	@cod_proveedor INT, @proveedor_real VARCHAR(100), @proveedor_fantasia VARCHAR(100), @correo VARCHAR(50), @telefono INT, @celular INT, 
	@cedula INT, @contacto VARCHAR(50), @ubicacion VARCHAR(100), @observaciones VARCHAR(100)
AS BEGIN
	UPDATE proveedores SET proveedor_real = @proveedor_real, cod_proveedor = @cod_proveedor, correo = @correo, telefono = @telefono, celular = @celular,
	cedula = @cedula, contacto = @contacto, ubicacion = @ubicacion, observaciones = @observaciones WHERE cod_proveedor = @cod_proveedor
END

-------------------------------------------------------------------------------------------------------------------------------------------
-- Mostrar artículos relacionados al proveedor
GO
CREATE PROCEDURE articulos_proveedor
	@cod_proveedor INT
AS BEGIN
	SELECT nombre_articulo, proveedor_real FROM
	((articulos A INNER JOIN articulos_proveedores AP ON AP.cod_articulo = A.cod_articulo) 
	INNER JOIN proveedores P ON P.cod_proveedor = AP.cod_proveedor) WHERE P.cod_proveedor = @cod_proveedor
END
-------------------------------------------------------------------------------------------------------------------------------------------
-- Mostrar proveedores
GO
CREATE PROCEDURE mostrar_proveedores
	@filtro VARCHAR(100)
AS BEGIN
	SELECT cod_proveedor AS 'Código de proveedor', proveedor_real AS 'Proveedor Real', proveedor_fantasia AS 'Proveedor Fantasia',
	correo AS 'Correo', telefono AS 'Teléfono', celular AS 'Celular', cedula AS 'Cédula Jurídica', contacto AS 'Contacto', ubicacion AS 'Ubicación',
	observaciones AS 'Observaciónes',
	STUFF(
		(SELECT ', ' + AR.nombre_articulo 
		FROM articulos AR 
		INNER JOIN articulos_proveedores AP ON AR.cod_articulo = AP.cod_articulo
		WHERE proveedores.cod_proveedor = AP.cod_proveedor
		FOR XML PATH('')),
		1, 2, '') AS 'Artículos',
	STUFF(
		(SELECT ', ' + bancos_cuentas.banco FROM bancos_cuentas 
		INNER JOIN proveedores ON bancos_cuentas.cod_proveedor = proveedores.cod_proveedor
		FOR XML PATH('')),
		1, 2, '') AS 'Bancos',
	STUFF(
		(SELECT ', ' + bancos_cuentas.cuenta FROM bancos_cuentas 
		INNER JOIN proveedores ON bancos_cuentas.cod_proveedor = proveedores.cod_proveedor
		FOR XML PATH('')),
		1, 2, '') AS 'Cuentas'
	FROM proveedores
	ORDER BY
		CASE @filtro
			WHEN 'cod_proveedor' THEN cod_proveedor
			WHEN 'telefono' THEN telefono
			WHEN 'celular' THEN celular
			WHEN 'cedula' THEN cedula
		END,

		CASE @filtro
			WHEN 'proveedor_real' THEN proveedor_real
			WHEN 'proveedor_fantasia' THEN proveedor_fantasia
			WHEN 'correo' THEN correo
			WHEN 'contacto' THEN contacto
			WHEN 'ubicacion' THEN ubicacion
		END
END
-------------------------------------------------------------------------------------------------------------------------------------------
