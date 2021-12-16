USE BD_Sistema

-------------------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para añadir a la tabla de facturas
GO
CREATE PROCEDURE insertar_factura 
	@institucion VARCHAR(100), @fecha_factura DATE, @fecha_cancelado DATE, @transferencia INT, @estado VARCHAR(50), 
	@efectivo BIT, @moneda BIT, @monto MONEY, @institucion_cedida VARCHAR(100), @banco VARCHAR(100),
	@observaciones VARCHAR(100), @cod_contratacion VARCHAR(50)
AS
	IF @observaciones = ''
		SET @observaciones = 'Ninguna observación'

BEGIN
	INSERT INTO facturas VALUES (@institucion, @fecha_factura, @fecha_cancelado, @transferencia,@estado, @efectivo,
	@moneda, @monto, @institucion_cedida, @banco, @observaciones, @cod_contratacion)
END

-------------------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para borrar en la tabla de factuas
GO
CREATE PROCEDURE borrar_factura
	@cod_factura INT
AS BEGIN
	DELETE facturas WHERE cod_factura = @cod_factura
END

-------------------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para actualizar la tabla de facturas
GO
CREATE PROCEDURE actualizar_facturas
	@cod_factura INT, @institucion VARCHAR(100), @fecha_factura DATE, @fecha_cancelado DATE, @transferencia INT, @estado VARCHAR(50), 
	@efectivo BIT, @moneda BIT, @monto MONEY, @institucion_cedida VARCHAR(100), @banco VARCHAR(100),
	@observaciones VARCHAR(100), @cod_contratacion VARCHAR(50)
AS BEGIN
	UPDATE facturas SET institucion = @institucion, fecha_factura = @fecha_factura, fecha_cancelado = @fecha_cancelado, 
	transferencia = @transferencia, estado = @estado, efectivo = @efectivo, moneda = @moneda, monto = @monto,
	institucion_cedida = @institucion_cedida, banco = @banco, observaciones = @observaciones, cod_contratacion = @cod_contratacion
	WHERE cod_factura = @cod_factura
END

-------------------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para mostrar las facturas
GO
CREATE PROCEDURE mostrar_facturas
AS BEGIN
	SELECT cod_factura AS 'Código de Factura', cod_contratacion AS 'Contratacion' ,institucion AS 'Institución', fecha_factura AS 'Fecha Factura', fecha_cancelado AS 'Fecha Cancelado',
	transferencia AS 'Transferencia', estado AS 'Estado', efectivo AS 'Efectivo', moneda AS 'Moneda', 
	institucion_cedida AS 'Institucion Cedida', banco AS 'Banco', observaciones AS 'Observaciones'
	FROM facturas
	ORDER BY cod_factura
END

-------------------------------------------------------------------------------------------------------------------------------------------
