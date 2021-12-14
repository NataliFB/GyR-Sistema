USE BD_Sistema

---------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para guardar registros en la tabla contrataciones
GO
CREATE PROCEDURE insertar_contratacion 
	@cod_contratacion VARCHAR(50), @institucion VARCHAR(100), @descripcion VARCHAR(200), 
	@fecha_publicacion SMALLDATETIME, @fecha_apertura SMALLDATETIME
AS 
	DECLARE @observaciones VARCHAR(100)
	SET @observaciones = 'Ninguna observación'
BEGIN
	INSERT INTO contrataciones_incompletas VALUES (@cod_contratacion, @institucion, @descripcion, @fecha_publicacion, @fecha_apertura, @observaciones)
END

---------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para guardar registros en la tabla de responsables
GO
CREATE PROCEDURE insertar_responsable @cod_empleado SMALLINT, @contratacion VARCHAR(50)
AS 
	DECLARE @institucion VARCHAR(100)
	SET @institucion = (SELECT institucion FROM contrataciones_incompletas WHERE cod_contratacion = @contratacion)

	DECLARE @descripcion VARCHAR(200)
	SET @descripcion = (SELECT descripcion FROM contrataciones_incompletas WHERE cod_contratacion = @contratacion)

	DECLARE @fecha_publicacion SMALLDATETIME
	SET @fecha_publicacion = (SELECT fecha_publicacion FROM contrataciones_incompletas WHERE cod_contratacion = @contratacion)

	DECLARE @fecha_apertura SMALLDATETIME 
	SET @fecha_apertura = (SELECT fecha_apertura FROM contrataciones_incompletas WHERE cod_contratacion = @contratacion)

	DECLARE @observaciones VARCHAR(100)
	SET @observaciones = (SELECT observaciones FROM contrataciones_incompletas WHERE cod_contratacion = @contratacion)
BEGIN
	INSERT INTO contrataciones VALUES (@contratacion, @institucion, @descripcion, @fecha_publicacion, @fecha_apertura, @observaciones, @cod_empleado)

	INSERT INTO responsable VALUES (@cod_empleado, @contratacion)

	DELETE FROM contrataciones_incompletas WHERE cod_contratacion = @contratacion
END

---------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento que muestra todo sobre una contratación
GO
CREATE PROCEDURE mostrar_contrataciones_completas
AS BEGIN 
	SELECT c.cod_Contratacion AS 'Contratación',institucion AS 'Institución',descripcion AS 'Descripcion',CONVERT(varchar,fecha_publicacion,100) AS 'Fecha Publicación', 
	CONVERT(varchar,fecha_apertura,100) AS 'Fecha Apertura', estado AS 'Estado',
	CONCAT(nombre_Empleado, ' ', apellido1_Empleado) AS 'Encargado', observaciones AS 'Observaciones', empleado.cod_color AS 'Color del empleado'
	FROM (((contrataciones c 
	INNER JOIN responsable ON responsable.cod_contratacion = c.cod_contratacion) 
	INNER JOIN estado_contratacion ON estado_contratacion.cod_Contratacion = c.cod_Contratacion)
	INNER JOIN empleado ON empleado.cod_Empleado = responsable.cod_Empleado) ORDER BY CONVERT(varchar,fecha_apertura,100)
END 

---------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para mostrar las contrataciones ingresadas
GO
CREATE PROCEDURE mostrar_contrataciones
AS BEGIN
	SELECT C.cod_contratacion AS 'Contratacion', institucion AS 'Institución', descripcion AS 'Descripción', 
	CONVERT(varchar,fecha_publicacion,100) AS 'Fecha Publicación', 
	CONVERT(varchar,fecha_apertura,100) AS 'Fecha Apertura', C.observaciones AS 'Observaciones'
	FROM contrataciones_incompletas C	
	ORDER BY CONVERT(varchar,fecha_apertura,100)
END

---------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para borrar todo lo relacionado a una contratación
GO
CREATE PROCEDURE borrar_contratacion 
	@cod_contratacion VARCHAR(50)
AS BEGIN
	DELETE estado_contratacion WHERE cod_contratacion = @cod_contratacion
END 
BEGIN
	DELETE responsable WHERE cod_contratacion = @cod_contratacion
END
BEGIN
	DELETE contrataciones WHERE cod_contratacion = @cod_contratacion
END
----------------------------------------------------------------------------------------------------------------------------------
-- Trigger para guardar estado en contratación una vez se agregue
GO
CREATE TRIGGER TR_CONTRATACIONES_AFTER ON contrataciones
AFTER INSERT
AS 
	DECLARE @contratacion VARCHAR(50)
	SET @contratacion = (SELECT cod_contratacion FROM INSERTED)
BEGIN
	INSERT INTO estado_contratacion VALUES ('Desconocido', @contratacion)
END
----------------------------------------------------------------------------------------------------------------------------------