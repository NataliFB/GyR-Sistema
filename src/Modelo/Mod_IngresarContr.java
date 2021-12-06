
package Modelo;

public class Mod_IngresarContr {
    
    private String numContratacion = "";
    private String descripcion = "";
    private String fechaPublicacion = "";
    private String fechaApertura = "";
    private String Institución = "";

    public String getInstitución() {
        return Institución;
    }

    public void setInstitución(String Institución) {
        this.Institución = Institución;
    }

    public String getNumContratacion() {
        return numContratacion;
    }

    public void setNumContratacion(String NumContratacion) {
        this.numContratacion = NumContratacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.descripcion = Descripcion;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String FechaPublicacion) {
        this.fechaPublicacion = FechaPublicacion;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String FechaApertura) {
        this.fechaApertura = FechaApertura;
    }
    
}
