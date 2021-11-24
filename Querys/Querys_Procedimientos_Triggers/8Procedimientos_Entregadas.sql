USE BD_Sistema

-------------------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para insertar en entregadas
GO
CREATE PROCEDURE insertar_entregadas
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
-- Procedimiento para borrar registros en entregadas
GO
CREATE PROCEDURE borrar_entregadas
	@cod_entregadas INT
AS BEGIN
	DELETE entregadas WHERE cod_entregadas = @cod_entregadas
END

-------------------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para actualizar registros en entregadas
GO
CREATE PROCEDURE actualizar_entregadas
	@cod_entregadas INT, @dias_entrega TINYINT, @fecha_entrega DATE, @lugar_entrega VARCHAR(100), 
	@descripcion VARCHAR(100), @empresa BIT, @observaciones VARCHAR(100), @medio_entrega VARCHAR(100)
AS BEGIN
	UPDATE entregadas SET dias_entrega = @dias_entrega, fecha_entrega = @fecha_entrega, lugar_entrega = @lugar_entrega,
	descripcion = @descripcion, empresa = @empresa, observaciones = @observaciones, medio_entrega = @medio_entrega
	WHERE cod_entregadas = @cod_entregadas
END

-------------------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para mostrar la tabla entregadas
GO
CREATE PROCEDURE mostrar_entregadas
	@filtro VARCHAR(100)
AS BEGIN
	SELECT cod_entregadas AS 'Código de Entregada', cod_contratacion AS 'Contratación', CONVERT(varchar,fecha_entrega,100) AS 'Fecha de Entrega',
	lugar_entrega AS 'Lugar de Entrega', descripcion AS 'Descipción', 
	CAST(CASE WHEN empresa = 1 THEN 'GyR Grupo Asesor' ELSE 'Principal Brands' END AS VARCHAR(50)) AS 'Empresa',
	observaciones AS 'Observaciones', medio_entrega AS 'Medio de Entrega',
	CONCAT(empleado.nombre_Empleado, ' ', empleado.appelido1_Empleado) AS 'Encargado'
	FROM entregadas INNER JOIN empleado ON empleado.cod_empleado = entregadas.cod_empleado
	ORDER BY
		CASE @filtro
			WHEN 'cod_entregadas' THEN cod_entregadas
		END,

		CASE @filtro
			WHEN 'cod_contratacion' THEN cod_contratacion 
			WHEN 'lugar_entrega' THEN lugar_entrega
			WHEN 'descripcion' THEN descripcion
			WHEN 'observaciones' THEN observaciones
			WHEN 'medio_entrega' THEN medio_entrega
		END,

		CASE @filtro
			WHEN 'fecha_entrega' THEN CONVERT(varchar,fecha_entrega,100)
		END,

		CASE @filtro
			WHEN 'empresa' THEN CAST(CASE WHEN empresa = 1 THEN 'GyR Grupo Asesor' ELSE 'Principal Brands' END AS VARCHAR(50))
		END,

		CASE @filtro
			WHEN 'cod_empleado' THEN CONCAT(empleado.nombre_Empleado, ' ', empleado.appelido1_Empleado)
		END
END
-------------------------------------------------------------------------------------------------------------------------------------------