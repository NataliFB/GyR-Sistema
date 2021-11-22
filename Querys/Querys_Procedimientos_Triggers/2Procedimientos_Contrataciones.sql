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
CREATE PROCEDURE mostrar_contratacion
AS BEGIN 
	SELECT contrataciones.cod_Contratacion,institucion,descripcion,CONVERT(varchar,fecha_publicacion,100) as 'Fecha Publicación' , CONVERT(varchar,fecha_apertura,100) as 'Fecha Apertura',
	CONCAT(nombre_Empleado, ' ', appelido1_Empleado) AS 'Encargado', empleado.cod_color, 
	CAST(CASE WHEN estado = 1 THEN 'Enviada' ELSE 'Descartada' END AS VARCHAR(50)) AS 'Estado' 
	FROM (((contrataciones 
	INNER JOIN responsable ON responsable.cod_Contratacion = contrataciones.cod_Contratacion) 
	INNER JOIN estado_contratacion ON estado_contratacion.cod_Contratacion = contrataciones.cod_Contratacion)
	INNER JOIN empleado ON empleado.cod_Empleado = responsable.cod_Empleado) ORDER BY fecha_apertura
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

EXEC insertar_contratacion '2021CD-000322-0002400001', 'MUNICIPALIDAD DE SANTA ANA', '[CD] Compra de luces para decoración de espacios
Encargado de publicación, gestión de objeciones y apertura : Maricruz Traña Castro', '2021-11-19 11:26', '2021-11-22 11:35'
EXEC insertar_estado_contratacion 1, '2021CD-000322-0002400001'
EXEC insertar_responsable 4, '2021CD-000322-0002400001'
EXEC mostrar_contratacion