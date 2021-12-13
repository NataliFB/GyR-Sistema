USE BD_Sistema

---------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para guardar registros en la tabla contrataciones
GO
CREATE PROCEDURE insertar_contratacion 
	@cod_contratacion VARCHAR(50), @institucion VARCHAR(100), @descripcion VARCHAR(200), 
	@fecha_publicacion SMALLDATETIME, @fecha_apertura SMALLDATETIME
AS BEGIN
	INSERT INTO contrataciones VALUES (@cod_contratacion, @institucion, @descripcion, @fecha_publicacion, @fecha_apertura)
END

---------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para guardar registros en la tabla de responsables
GO
CREATE PROCEDURE insertar_responsable @cod_empleado SMALLINT, @cod_contratacion VARCHAR(50)
AS BEGIN
	INSERT INTO responsable VALUES (@cod_empleado, @cod_contratacion)
END

---------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento que muestra todo sobre una contratación
GO
CREATE PROCEDURE mostrar_contrataciones_completas
AS BEGIN 
	SELECT contrataciones.cod_Contratacion AS 'Contratación',institucion AS 'Institución',descripcion AS 'Descripcion',CONVERT(varchar,fecha_publicacion,100) AS 'Fecha Publicación', 
	CONVERT(varchar,fecha_apertura,100) AS 'Fecha Apertura', estado AS 'Estado',
	CONCAT(nombre_Empleado, ' ', apellido1_Empleado) AS 'Encargado', empleado.cod_color AS 'Color del empleado'
	FROM (((contrataciones 
	INNER JOIN responsable ON responsable.cod_Contratacion = contrataciones.cod_Contratacion) 
	INNER JOIN estado_contratacion ON estado_contratacion.cod_Contratacion = contrataciones.cod_Contratacion)
	INNER JOIN empleado ON empleado.cod_Empleado = responsable.cod_Empleado) ORDER BY CONVERT(varchar,fecha_apertura,100)
END

---------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para mostrar las contrataciones ingresadas
GO
CREATE PROCEDURE mostrar_contrataciones
AS BEGIN
	SELECT C.cod_contratacion AS 'Contratacion', institucion AS 'Institución', descripcion AS 'Descripción', 
	CONVERT(varchar,fecha_publicacion,100) AS 'Fecha Publicación', 
	CONVERT(varchar,fecha_apertura,100) AS 'Fecha Apertura', estado AS 'Estado' 
	FROM contrataciones C	
	INNER JOIN estado_contratacion EC ON C.cod_contratacion = EC.cod_contratacion
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