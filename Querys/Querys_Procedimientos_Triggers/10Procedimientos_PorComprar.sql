USE BD_Sistema

-------------------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para insertar registros en la tabla de por comprar
GO
CREATE PROCEDURE insertar_por_comprar 
	@objeto VARCHAR(100), @monto_ofertado MONEY, @costo MONEY, @observacion VARCHAR(100), @cod_proveedor INT, @cod_contratacion VARCHAR(50)
AS 

	IF @observacion = ''
		SET @observacion = 'Ninguna observación'
BEGIN
	INSERT INTO por_comprar VALUES (@objeto, @monto_ofertado, @costo, @observacion, @cod_proveedor, @cod_contratacion)
END

-------------------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para borrar registros en la tabla por comprar
GO
CREATE PROCEDURE borrar_por_comprar
	@cod_porcomprar INT
AS BEGIN
	DELETE por_comprar WHERE cod_porcomprar = @cod_porcomprar
END

-------------------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para actualizar registros en por comprar
GO
CREATE PROCEDURE actualizar_por_comprar
	@cod_porcomprar INT, @objeto VARCHAR(100), @monto_ofertado MONEY, @costo MONEY, @observacion VARCHAR(100)
AS BEGIN
	UPDATE por_comprar SET objeto = @objeto, monto_ofertado = @monto_ofertado, costo = @costo, observacion = @observacion 
	WHERE cod_porcomprar = @cod_porcomprar
END
-------------------------------------------------------------------------------------------------------------------------------------------
GO
CREATE PROCEDURE mostrar_porcomprar
AS BEGIN
	SELECT cod_porcomprar AS 'Código de compra', por_comprar.cod_contratacion AS 'Contratación', objeto AS 'Objeto', monto_ofertado AS 'Monto ofertado', 
	costo AS 'Costo', observacion AS 'Observaciones', P.proveedor_real AS 'Proveedor Real', P.proveedor_fantasia AS 'Proveedor Fantasía', P.cedula AS 'Cédula Jurídica',
	STUFF(
		(SELECT ', ' + bancos_cuentas.banco FROM (bancos_cuentas 
		INNER JOIN proveedores ON bancos_cuentas.cod_proveedor = proveedores.cod_proveedor) INNER JOIN por_comprar ON por_comprar.cod_proveedor = proveedores.cod_proveedor  
		WHERE bancos_cuentas.cod_proveedor = por_comprar.cod_proveedor
		FOR XML PATH('')),
		1, 2, '') AS 'Bancos',
	STUFF(
		(SELECT ', ' + bancos_cuentas.cuenta FROM (bancos_cuentas 
		INNER JOIN por_comprar ON bancos_cuentas.cod_proveedor = por_comprar.cod_proveedor) INNER JOIN proveedores ON proveedores.cod_proveedor = bancos_cuentas.cod_proveedor WHERE por_comprar.cod_proveedor = bancos_cuentas.cod_proveedor
		FOR XML PATH('')),
		1, 2, '') AS 'Cuentas',CONCAT(nombre_Empleado, ' ', apellido1_Empleado) AS 'Encargado', 
		empleado.cod_color AS 'Color del empleado'
	FROM (((por_comprar INNER JOIN proveedores P ON por_comprar.cod_proveedor = P.cod_proveedor)
	INNER JOIN responsable ON responsable.cod_contratacion = por_comprar.cod_contratacion)
	INNER JOIN empleado ON empleado.cod_empleado = responsable.cod_empleado)
	ORDER BY cod_porcomprar
END

-------------------------------------------------------------------------------------------------------------------------------------------