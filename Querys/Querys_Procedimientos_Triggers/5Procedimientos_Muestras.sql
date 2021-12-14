USE BD_Sistema

-------------------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para ingrsar registros a la tabla de muestras
GO
CREATE PROCEDURE insertar_muestra
	@institucion VARCHAR(100), @objeto VARCHAR(100), @cantidad TINYINT, @fecha_entrega DATE,
	@fecha_retiro DATE, @estado VARCHAR(30), @observaciones VARCHAR(100), @cod_contratacion VARCHAR(50)
AS 
	DECLARE @encargado_contr SMALLINT
	SET @encargado_contr = (SELECT cod_empleado FROM responsable WHERE cod_contratacion = @cod_contratacion)

	IF @estado = '' 
		SET @estado = 'Pendiente'

	IF @observaciones = ''
		SET @observaciones = 'Ninguna observación'

	IF @fecha_retiro = ''
		SET @fecha_retiro = NULL

BEGIN
	INSERT INTO muestras VALUES (@institucion, @objeto, @cantidad, @fecha_entrega, @fecha_retiro, 
	@estado, @observaciones, @encargado_contr, @cod_contratacion)
END

-------------------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para borrar registros en la tabla de muestras
GO
CREATE PROCEDURE borrar_muestra 
	@cod_muestra INT
AS BEGIN
	DELETE muestras WHERE cod_muestra = @cod_muestra
END

-------------------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para actualizar los registros en muestras
GO
CREATE PROCEDURE modificar_muestra
	@cod_muestra INT, @institucion VARCHAR(100), @objeto VARCHAR(100),@cantidad TINYINT, @fecha_entrega DATE, @fecha_retiro DATE, 
	@estado VARCHAR(30), @observaciones VARCHAR(100)
AS BEGIN
	UPDATE muestras SET institucion = @institucion, objeto = @objeto, cantidad = @cantidad, fecha_entrega = @fecha_entrega,
	fecha_retiro = @fecha_retiro, estado = @estado, observaciones = @observaciones WHERE cod_muestra = @cod_muestra
END

-------------------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para mostrar la tabla de muestras
GO
CREATE PROCEDURE mostrar_muestras
AS BEGIN
	SELECT cod_muestra AS 'Código de muestras', cod_contratacion AS 'Contratacion', institucion AS 'Institución', objeto AS 'Objeto', 
	cantidad AS 'Cantidad', CONVERT(VARCHAR, fecha_entrega, 100) AS 'Fecha de Entrega', CONVERT(VARCHAR, fecha_retiro, 100) AS 'Fecha de Retiro',
	estado AS 'Estado', observaciones AS 'Observaciones',
	CONCAT(empleado.nombre_Empleado, ' ', empleado.apellido1_Empleado) AS 'Encargado',
	empleado.cod_color AS 'Color del Empleado'
	FROM (muestras INNER JOIN empleado ON empleado.cod_empleado = muestras.cod_empleado)
	ORDER BY cod_muestra
END

-------------------------------------------------------------------------------------------------------------------------------------------