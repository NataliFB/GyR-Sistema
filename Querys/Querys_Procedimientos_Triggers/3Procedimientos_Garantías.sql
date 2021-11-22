USE BD_Sistema

---------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para guardar las garantias
GO
CREATE PROCEDURE insertar_garantia 
	@institucion VARCHAR(100), @fecha_pago DATE, @fecha_devolucion DATE, @tiempo DATE, @estado VARCHAR(30), 
	@objeto VARCHAR(50), @observaciones VARCHAR(100), @monto MONEY, @tipo_garantia VARCHAR(50), @cod_empleado SMALLINT, 
	@cod_contratacion VARCHAR(50)
AS 
	DECLARE @encargado_contr SMALLINT
	SET @encargado_contr = (SELECT cod_empleado FROM responsable WHERE cod_contratacion = @cod_contratacion)

	IF @estado = '' 
		SET @estado = 'Pendiente'

	IF @observaciones = ''
		SET @observaciones = 'Ninguna observación'
BEGIN
	INSERT INTO garantias VALUES (@institucion, @fecha_pago, @fecha_devolucion, @tiempo, @estado, @objeto, @observaciones, 
	@monto, @tipo_garantia, @cod_empleado, @encargado_contr, @cod_contratacion)
END

---------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para borrar una garantia
GO
CREATE PROCEDURE borrar_garantia 
	@cod_garantia INT
AS BEGIN
	DELETE garantias WHERE cod_garantia = @cod_garantia
END

---------------------------------------------------------------------------------------------------------------------------------

SELECT * FROM garantias

EXEC insertar_garantia 'MUNICIPALIDAD DE SANTA ANA', '2021-11-22', NULL, '2021-12-22', '', 'Decoración de espacios', '', 15000, 'De Cumplimiento', 7, '2021CD-000322-0002400001'
EXEC insertar_garantia 'MUNICIPALIDAD DE SANTA ANA', '2021-11-30', NULL, '2021-12-30', '', 'Decoración de espacios', '', 10000, 'De Participacion', 7, '2021CD-000322-0002400001'
