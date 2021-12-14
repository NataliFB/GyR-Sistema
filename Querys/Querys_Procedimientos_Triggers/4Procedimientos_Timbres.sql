USE BD_Sistema

-------------------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para insertar en la tabla timbres
GO
CREATE PROCEDURE insertar_timbre
	@institucion VARCHAR(100), @descripcion VARCHAR(100), @monto MONEY, @estado VARCHAR(30), @observaciones VARCHAR(100),
	@encargado_envio SMALLINT, @cod_contratacion VARCHAR(50)
AS 
	DECLARE @encargado_contr SMALLINT
	SET @encargado_contr = (SELECT cod_empleado FROM responsable WHERE cod_contratacion = @cod_contratacion)

	IF @estado = '' 
		SET @estado = 'Pendiente'

	IF @observaciones = ''
		SET @observaciones = 'Ninguna observación'

BEGIN
	INSERT INTO timbres VALUES (@institucion, @descripcion, @monto, @estado, @observaciones, @encargado_envio, @encargado_contr, @cod_contratacion)
END

-------------------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para borrar un registro en timbres
GO
CREATE PROCEDURE borrar_timbre 
	@cod_timbre INT
AS BEGIN
	DELETE timbres WHERE cod_timbre = @cod_timbre
END

-------------------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para actualizar registros en un timbre
GO
CREATE PROCEDURE modificar_timbre
	@cod_timbre INT, @descripcion VARCHAR(100), @institucion VARCHAR(100), @monto MONEY, @estado VARCHAR(30), @observaciones VARCHAR(100),
	@encargado_envio SMALLINT
AS BEGIN
	UPDATE timbres SET institucion = @institucion, descripcion = @descripcion, monto = @monto, estado = @estado, observaciones = @observaciones,
	encargado_envio = @encargado_envio
	WHERE cod_timbre = @cod_timbre
END

-------------------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para mostrar todos los timbres guardados
GO
CREATE PROCEDURE mostrar_timbres
AS BEGIN
	SELECT cod_timbre AS 'Código de timbre', cod_contratacion AS 'Contratación', institucion AS 'Institución', descripcion AS 'Descripción', 
	monto AS 'Monto', estado AS 'Estado',
	observaciones AS 'Observaciones',
	CONCAT(EMP1.nombre_Empleado, ' ', EMP1.apellido1_Empleado) AS 'Encargado de Envio',
	CONCAT(EMP2.nombre_Empleado, ' ', EMP2.apellido1_Empleado) AS 'Encargado de Contratacion',
	EMP2.cod_color AS 'Color del Empleado'
	FROM (timbres INNER JOIN empleado EMP1 ON timbres.encargado_envio = EMP1.cod_empleado)
	INNER JOIN empleado EMP2 ON EMP2.cod_empleado = timbres.cod_empleado
	ORDER BY cod_timbre
END

-------------------------------------------------------------------------------------------------------------------------------------------