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
-- Procedimiento para actualizar una garantia
GO
CREATE PROCEDURE actualizar_garantia 
	@cod_garantia INT,@institucion VARCHAR(100), @fecha_pago DATE, @fecha_devolucion DATE, @tiempo DATE, @estado VARCHAR(30), 
	@objeto VARCHAR(50), @observaciones VARCHAR(100), @monto MONEY, @tipo_garantia VARCHAR(50), @encargado_envio SMALLINT
AS BEGIN
	UPDATE garantias SET institucion = @institucion, fecha_pago = @fecha_pago, fecha_devolucion = @fecha_devolucion, tiempo = @tiempo,
	estado = @estado, objeto = @objeto, observaciones = @observaciones, monto = @monto, tipo_garantia = @tipo_garantia, encargado_envio = @encargado_envio
	WHERE cod_garantia = @cod_garantia
END

---------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para mostrar las garantias
GO
CREATE PROCEDURE mostrar_garantia
AS BEGIN
	SELECT cod_garantia AS 'Código de garantia', cod_contratacion AS 'Contratacion',institucion AS 'Institución', 
	CONVERT(VARCHAR,fecha_pago,100) AS 'Fecha de pago', CONVERT(VARCHAR,fecha_devolucion,100) AS 'Fecha de devolución',
	CONVERT(VARCHAR,tiempo,100) AS 'Tiempo de devolucion', estado AS 'Estado', objeto AS 'Objeto', observaciones AS 'Observaciones', monto AS 'Monto',
	tipo_garantia AS 'Tipo de Garantia',
	CONCAT(EMP1.nombre_Empleado, ' ', EMP1.appelido1_Empleado) AS 'Encargado de Envio',
	CONCAT(EMP2.nombre_Empleado, ' ', EMP2.appelido1_Empleado) AS 'Encargado de Contratacion',
	EMP2.cod_color AS 'Color del Empleado'
	FROM (garantias INNER JOIN empleado EMP1 ON garantias.encargado_envio = EMP1.cod_empleado)
	INNER JOIN empleado EMP2 ON EMP2.cod_empleado = garantias.cod_empleado
	ORDER BY cod_garantia
END

---------------------------------------------------------------------------------------------------------------------------------