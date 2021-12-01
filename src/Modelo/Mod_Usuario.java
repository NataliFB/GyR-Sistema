
package Modelo;

public class Mod_Usuario {
    
    private static String usuario;
    private static String contrasena;
    private static String nombreEmpleado;
    private static String nivelAdm;
    private static int codEmpleado;

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getNivelAdm() {
        return nivelAdm;
    }

    public void setNivelAdm(String nivelAdm) {
        this.nivelAdm = nivelAdm;
    }

    public int getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(int codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
}
