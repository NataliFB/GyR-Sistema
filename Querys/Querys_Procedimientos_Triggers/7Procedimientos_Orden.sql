USE BD_Sistema

-------------------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para insertar registros en la tabla orden
GO
CREATE PROCEDURE insertar_orden 
	@dias_entrega TINYINT, @vigencia_contrato TINYINT, @fecha_limite DATE, @descripcion VARCHAR(100), 
	@num_orden INT, @lugar_entrega VARCHAR(100), @observaciones VARCHAR(100), @modalidad VARCHAR(100),
	@cod_contratacion VARCHAR(100)
AS
	DECLARE @encargado SMALLINT
	SET @encargado = (SELECT cod_empleado FROM responsable WHERE cod_contratacion = @cod_contratacion)

	IF @descripcion = ''
		SET @descripcion = 'Sin descripción'

	IF @observaciones = ''
		SET @observaciones = 'Ninguna observación'
BEGIN
	INSERT INTO orden VALUES (@dias_entrega, @vigencia_contrato, @fecha_limite, @descripcion, @num_orden, 
	@lugar_entrega, @observaciones, @modalidad, @encargado, @cod_contratacion)
END

-------------------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para borrar registros en la tabla orden
GO
CREATE PROCEDURE borrar_orden
	@cod_orden INT
AS BEGIN
	DELETE orden WHERE cod_orden = @cod_orden
END

-------------------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para actualizar registros en la tabla orden
GO
CREATE PROCEDURE modificar_orden
	@cod_orden INT, @dias_entrega TINYINT, @vigencia_contrato TINYINT, @fecha_limite DATE, @descripcion VARCHAR(100), 
	@num_orden INT, @lugar_entrega VARCHAR(100), @observaciones VARCHAR(100), @modalidad VARCHAR(100)
AS BEGIN
	UPDATE orden SET dias_entrega = @dias_entrega, vigencia_contrato = @vigencia_contrato, fecha_limite = @fecha_limite,
	descripcion = @descripcion, num_orden = @num_orden, lugar_entrega = @lugar_entrega, observaciones = @observaciones,
	modalidad = @modalidad
	WHERE cod_orden = @cod_orden
END

-------------------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para mostrar la tabla orden
GO
CREATE PROCEDURE mostrar_orden
AS BEGIN
	SELECT cod_orden AS 'Código de orden', cod_contratacion AS 'Contratación', CONCAT(dias_entrega, ' Días') AS 'Dias de Entrega',
	vigencia_contrato AS 'Vigencia del Contrato',CONVERT(VARCHAR, fecha_limite, 100) AS 'Fecha Límite', 
	descripcion AS 'Descripción', num_orden AS 'Número de Orden', lugar_entrega AS 'Lugar de Entrega', observaciones AS 'Observaciones', 
	modalidad AS 'Modalidad', CONCAT(empleado.nombre_Empleado, ' ', empleado.apellido1_Empleado) AS 'Encargado de Contratacion',
	empleado.cod_color AS 'Color del Empleado'
	FROM orden INNER JOIN empleado ON empleado.cod_empleado = orden.cod_empleado 
	ORDER BY cod_orden
END

-------------------------------------------------------------------------------------------------------------------------------------------