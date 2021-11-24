USE BD_Sistema

-------------------------------------------------------------------------------------------------------------------------------------------
--
GO
CREATE PROCEDURE insertar_entregada
	@dias_entrega TINYINT, @fecha_entrega DATE, @lugar_entrega VARCHAR(100), @descripcion VARCHAR(100),
	@empresa BIT, @observaciones VARCHAR(100), @medio_entrega VARCHAR(100), @cod_contratacion VARCHAR(50)
AS 
	DECLARE @encargado SMALLINT
	SET @encargado = (SELECT cod_empleado FROM responsable WHERE cod_contratacion = @cod_contratacion)

	IF @descripcion = ''
		SET @descripcion = 'Sin descripción'

	IF @observaciones = ''
		SET @observaciones = 'Ninguna observación'

BEGIN
	INSERT INTO entregadas VALUES (@dias_entrega, @fecha_entrega, @lugar_entrega, @descripcion, @empresa, @observaciones, @medio_entrega,
	@encargado, @cod_contratacion)
END

-------------------------------------------------------------------------------------------------------------------------------------------
