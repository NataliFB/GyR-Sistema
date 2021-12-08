package Modelo;

/**
 * Mod_IngresarContr es una clase que se usa guardar las variables de las
 * contrataciones.
 *
 * @author
 *
 */
public class Mod_IngresarContr {

    private String numContratacion = "";
    private String descripcion = "";
    private String fechaPublicacion = "";
    private String fechaApertura = "";
    private String Institución = "";

    /**
     * Metodo que devuelve la variable institución
     *
     * @return Devuelve la variable institución
     */
    public String getInstitución() {
        return Institución;
    }

    /**
     * Metodo para guardar el valor a la variable insitución
     *
     * @param Institución recibe un string para guardar en institución
     */
    public void setInstitución(String Institución) {
        this.Institución = Institución;
    }

    /**
     * Metodo que devuelve la variable numContratación
     *
     * @return Devuelve la variable numContratación
     */
    public String getNumContratacion() {
        return numContratacion;
    }

    /**
     * Metodo para guardar el valor a la variable numContratación
     *
     * @param NumContratacion recibe un string para guardar en numContratación
     */
    public void setNumContratacion(String NumContratacion) {
        this.numContratacion = NumContratacion;
    }

    /**
     * Metodo que devuelve la variable descripción
     *
     * @return Devuelve la variable descripción
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Metodo para guardar el valor a la variable descripcion
     *
     * @param Descripcion recibe un string para guardar en descripcion
     */
    public void setDescripcion(String Descripcion) {
        this.descripcion = Descripcion;
    }

    /**
     * Metodo que devuelve la variable fechaPublicación
     *
     * @return Devuelve la variable fechaPublicacion
     */
    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    /**
     * Metodo para guardar el valor a la variable fechaPublicacion
     *
     * @param FechaPublicacion recibe un string para guardar en fechaPublicacion
     */
    public void setFechaPublicacion(String FechaPublicacion) {
        this.fechaPublicacion = FechaPublicacion;
    }

    /**
     * Metodo que devuelve la variable fechaApertura
     *
     * @return Devuelve la variable fechaApertura
     */
    public String getFechaApertura() {
        return fechaApertura;
    }

    /**
     * Metodo para guardar el valor a la variable fechaApertura
     *
     * @param FechaApertura recibe un string para guardar en fechaApertura
     */
    public void setFechaApertura(String FechaApertura) {
        this.fechaApertura = FechaApertura;
    }

}
