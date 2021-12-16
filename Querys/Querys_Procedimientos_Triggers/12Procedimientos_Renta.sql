USE BD_Sistema

-------------------------------------------------------------------------------------------------------------------------------------------
-- Insertar Renta
GO
CREATE PROCEDURE insertar_renta
	@num_factura INT, @descripcion VARCHAR(100), @modalidad VARCHAR(100), @telefono INT, @fecha_renta DATE, @nacionalidad VARCHAR(100),
	@moneda BIT, @subtotal MONEY, @impuesto MONEY, @renta MONEY, @total MONEY, @tipo_renta BIT, @cod_contratacion VARCHAR(100), 
	@cod_proveedor INT
AS BEGIN
	INSERT INTO renta VALUES (@num_factura, @descripcion, @modalidad, @telefono, @fecha_renta, @nacionalidad, @moneda, @subtotal, @impuesto,
	@total, @renta, @tipo_renta, @cod_contratacion, @cod_proveedor)
END

-------------------------------------------------------------------------------------------------------------------------------------------
-- Borrar Renta
GO
CREATE PROC borrar_renta
	@cod_renta INT
AS BEGIN
	DELETE rente WHERE cod_renta = @cod_renta
END

-------------------------------------------------------------------------------------------------------------------------------------------
-- Actualizar Renta
GO
CREATE PROC actualizar_renta
	@cod_renta INT, @num_factura INT, @descripcion VARCHAR(100), @modalidad VARCHAR(100), @telefono INT, @fecha_renta DATE, @nacionalidad VARCHAR(100),
	@moneda BIT, @subtotal MONEY, @impuesto MONEY, @renta MONEY, @total MONEY, @tipo_renta BIT, @cod_contratacion VARCHAR(100), @cod_proveedor INT
AS BEGIN
	UPDATE renta SET num_facura = @num_factura, descripcion = @descripcion, modalidad = @modalidad, telefono = @telefono, fecha_renta = @fecha_renta,
	nacionalidad = @nacionalidad, moneda = @moneda, subtotal = @subtotal, tipo_renta = @tipo_renta, cod_contratacion = @cod_contratacion,
	cod_proveedor = @cod_proveedor, renta = @renta, impuesto = @impuesto, total = @total WHERE cod_renta = @cod_renta
END
-------------------------------------------------------------------------------------------------------------------------------------------
-- Mostrar renta
GO
CREATE PROC mostrar_renta
AS BEGIN
	SELECT cod_renta AS 'Código de Renta', cod_contratacion AS 'Contratación', num_facura AS 'Número de Factura', 
	descripcion AS 'Descripción', modalidad AS 'Modalidad', p.telefono AS 'Teléfono', CONVERT(VARCHAR, fecha_renta, 100) AS 'Fecha de Renta',
	nacionalidad AS 'Nacionalidad', 
	CAST(
		CASE  
			WHEN moneda = 0 THEN 'Colón' 
			ELSE 'Dolar' 
		END AS VARCHAR) AS 'Moneda',
	subtotal AS 'Subtotal', impuesto AS 'Impuesto', total AS 'Total', Renta AS 'Renta',
	CAST(
		CASE
			WHEN tipo_renta = 0 THEN 'Gasto'
			ELSE 'Venta'
		END AS VARCHAR) AS 'Tipo de Renta',
	p.proveedor_real AS 'Proveedor Real', p.cedula AS 'Cédula Jurídica'
	FROM renta INNER JOIN proveedores p ON p.cod_proveedor = renta.cod_proveedor
	ORDER BY cod_renta
END
-------------------------------------------------------------------------------------------------------------------------------------------
