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
-- Procedimiento para guardar registros en la tabla estado_contratacion
GO
CREATE PROCEDURE insertar_estado_contratacion @estado BIT, @cod_contratacion VARCHAR(50)
AS BEGIN
	INSERT INTO estado_contratacion VALUES (@estado, @cod_contratacion)
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
CREATE PROCEDURE mostrar_contratacion_completas
AS BEGIN 
	SELECT contrataciones.cod_Contratacion AS 'Contratación',institucion AS 'Institución',descripcion AS 'Descripcion',CONVERT(varchar,fecha_publicacion,100) AS 'Fecha Publicación', 
	CONVERT(varchar,fecha_apertura,100) AS 'Fecha Apertura', CONCAT(nombre_Empleado, ' ', appelido1_Empleado) AS 'Encargado', empleado.cod_color AS 'Color del empleado', 
	CAST(CASE WHEN estado = 1 THEN 'Enviada' ELSE 'Descartada' END AS VARCHAR(50)) AS 'Estado' 
	FROM (((contrataciones 
	INNER JOIN responsable ON responsable.cod_Contratacion = contrataciones.cod_Contratacion) 
	INNER JOIN estado_contratacion ON estado_contratacion.cod_Contratacion = contrataciones.cod_Contratacion)
	INNER JOIN empleado ON empleado.cod_Empleado = responsable.cod_Empleado) ORDER BY fecha_apertura
END 

---------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para mostrar las contrataciones ingresadas
GO
CREATE PROCEDURE mostrar_contratacion 
	@orden VARCHAR(100)
AS BEGIN
	SELECT cod_contratacion AS 'Contratacion', institucion AS 'Institución', descripcion AS 'Descripción', 
	CONVERT(varchar,fecha_publicacion,100) AS 'Fecha Publicación', 
	CONVERT(varchar,fecha_apertura,100) AS 'Fecha Apertura' FROM contrataciones
	ORDER BY 
		CASE @orden
			WHEN 'fecha_apertura'
				THEN CONVERT(varchar,fecha_apertura,100)
			WHEN 'fecha_publicacion' 
				THEN CONVERT(varchar,fecha_publicacion,100)
			WHEN 'cod_contratacion'
				THEN cod_contratacion
			WHEN 'institucion'
				THEN institucion
			WHEN 'descripcion'
				THEN descripcion
		END
END

---------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para borrar todo lo relacionado a una contratación
GO
CREATE PROCEDURE borrar_contratacion 
	@cod_contratacion VARCHAR(50)
AS BEGIN
	DELETE estado_contratacion WHERE cod_contratacion = @cod_contratacion
	DELETE responsable WHERE cod_contratacion = @cod_contratacion
	DELETE contrataciones WHERE cod_contratacion = @cod_contratacion
END 
----------------------------------------------------------------------------------------------------------------------------------