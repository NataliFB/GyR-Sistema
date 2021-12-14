package Modelo;

/**
 * Mod_Usuario es una clase que se usa guardar las variables del usuario activo
 *
 * @author Aaron
 */
public class Mod_Usuario {

    private static String usuario;
    private static String contrasena;
    private static String nombreEmpleado;
    private static String nivelAdm;
    private static String color;
    private static int codEmpleado;
    private static boolean[] permisos;

    public static boolean[] getPermisos() {
        return permisos;
    }

    public static void setPermisos(boolean[] permisos) {
        Mod_Usuario.permisos = permisos;
    }

    /**
     * Metodo que devuelve la variable color
     *
     * @return Devuelve la variable color
     */
    public String getColor() {
        return color;
    }

    /**
     * Metodo para guardar el valor a la variable color
     *
     * @param color recibe un string para guardar en color
     */
    public void setColor(String color) {
        Mod_Usuario.color = color;
    }

    /**
     * Metodo que devuelve la variable nombreEmpleado
     *
     * @return Devuelve la variable nombreEmpleado
     */
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    /**
     * Metodo para guardar el valor a la variable nombreEmpleado
     *
     * @param nombreEmpleado recibe un string para guardar en nombreEmpleado
     */
    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    /**
     * Metodo que devuelve la variable NivelAdm
     *
     * @return Devuelve la variable NivelAdm
     */
    public String getNivelAdm() {
        return nivelAdm;
    }

    /**
     * Metodo para guardar el valor a la variable nivelAdm
     *
     * @param nivelAdm recibe un string para guardar en nivelAdm
     */
    public void setNivelAdm(String nivelAdm) {
        this.nivelAdm = nivelAdm;
    }

    /**
     * Metodo que devuelve la variable codEmpleado
     *
     * @return Devielve la variable codEmpleado
     */
    public int getCodEmpleado() {
        return codEmpleado;
    }

    /**
     * Metodo para guardar el valor a la variable codEmpleado
     *
     * @param codEmpleado recibe un int para guardar en codEmpleado
     */
    public void setCodEmpleado(int codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    /**
     * Metodo que devuelve la variable usuario
     *
     * @return Devuelve la variable usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Metodo para guardar el valor a la variable usuario
     *
     * @param usuario recibe un string para guardar en usuario
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Metodo que devuelve la variable Contrasena
     *
     * @return Devuelve la variable Contrasena
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Metodo para guardar el valor a la variable contrasena
     *
     * @param contrasena recibe un String para guardar en contrasena
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}
