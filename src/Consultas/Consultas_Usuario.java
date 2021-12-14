package Consultas;

import Modelo.Mod_Usuario;
import main.Conexion_A;
import java.sql.CallableStatement;
import java.sql.Types;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;

/**
 * Clase para realizar las consultas que tengan relación con el usuario en
 * sesión y los empleados, este último si el usuario es Administrador
 *
 * @author
 */
public class Consultas_Usuario extends Conexion_A {

    /**
     * Metodo para poder hacer la consulta a la base de datos para iniciar
     * sesión
     *
     * @param us Le pasa un objeto de tipo Mod_Usuario para tomar los datos de
     * inico de sesión
     * @return Devueve un booleano que significa el estado de inicio de
     * seisón<br>
     * True: Los datos son validos y coinciden en la base de datos<br>
     * False: Los datos son invalidos o no coinciden
     */
    public boolean InicioSesion(Mod_Usuario us) {

        boolean inicioS = false;

        CallableStatement cs;

        try {
            cs = getConnection().prepareCall("{call loguear_user(?, ?, ?)}");
            cs.setString(1, us.getUsuario());
            cs.setString(2, us.getContrasena());
            cs.registerOutParameter(3, Types.BOOLEAN);

            cs.execute();

            inicioS = cs.getBoolean(3);

        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            try {
                getConnection().close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }

        return inicioS;
    }

    /**
     * Metodo para buscar los datos de un usuario en específico
     *
     * @param cod Recibe un String que luego se convierte a int para poder hacer
     * la consulta a la base de datos en base a ese dato
     * @return Devuelve un arreglo de tipo Object con los datos de ese empleado
     */
    public Object[] BuscarEmpleado(String cod) {
        Object[] datos = null;

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;

        try {
            ps = getConnection().prepareStatement("SELECT nombre_empleado, apellido1_empleado, apellido2_empleado, cod_rol, cod_color "
                    + "FROM empleado WHERE cod_empleado = ?");
            ps.setInt(1, Integer.parseInt(cod));
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();

            int columnas = rsmd.getColumnCount();

            while (rs.next()) {
                datos = new Object[columnas];
                for (int i = 0; i < columnas; i++) {
                    datos[i] = rs.getObject(i + 1);
                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                getConnection().close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }

        return datos;
    }

    /**
     * Metodo para obtener los datos del usuario que inicia sesión para
     * guardarlos en memoria
     *
     * @param us Recibe un objeto de tipo Mod_Usuario para poder guardar los
     * datos ahí
     * @return Devuelve un booleano que significa si se pudo insertar los datos
     * en la base de datos<br>
     * true: Se recibieron<br>
     * false: Hubo un error
     */
    public boolean DatosUsuario(Mod_Usuario us) {

        CallableStatement cs;
        ResultSet rs;

        try {
            cs = getConnection().prepareCall("{call buscar_empleado(?)}");
            cs.setString(1, us.getUsuario());
            rs = cs.executeQuery();

            while (rs.next()) {
                us.setCodEmpleado(rs.getInt(1));
                us.setColor(rs.getString(2));
                us.setNombreEmpleado(rs.getString(3));
                us.setNivelAdm(rs.getString(4));
            }

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                getConnection().close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
        return true;
    }

    /**
     * Metodo para poder hacer el cambio de contraseña del usuario en sesión
     *
     * @param us Recibe un objeto de tipo Mod_Usuario para hacer el cambio de
     * contraseña
     * @return Devuelve un booleano que significa si se pudo insertar los datos
     * en la base de datos<br>
     * true: se insertó<br>
     * false: no se insertó
     */
    public boolean ActualizarContrasena(Mod_Usuario us) {
        CallableStatement cs;

        try {
            cs = getConnection().prepareCall("{call actualizar_contraseña(?,?)}");
            cs.setString(1, us.getContrasena());
            cs.setString(2, us.getUsuario());

            cs.execute();

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                getConnection().close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
        return true;
    }

    /**
     * Metodo para agregar empleados en la base de datos
     *
     * @param nombre Recibe un String con el nombre del empleado
     * @param app1 Recibe un String con el primer apellido del empleado
     * @param app2 Recibe un String con el segundo apellido del empleado
     * @param rol Recibe int para definir el rol que va a tener el empleado
     * @param color Recibe un String con el color en formato hexadecimal del
     * empleado
     * @return Devuelve un booleano que significa si se pudo insertar los datos
     * en la base de datos<br>
     * true: se insertó<br>
     * false: no se insertó
     */
    public boolean AgregarEmpleado(String nombre, String app1, String app2, int rol, String color) {

        if (!ComprobarColor(color)) {
            JOptionPane.showMessageDialog(null, "Ya se encuentra en uso ese color");
            return false;
        }

        CallableStatement cs;

        try {
            cs = getConnection().prepareCall("{call insertar_empleados (?,?,?,?,?)}");
            cs.setString(1, nombre);
            cs.setString(2, app1);
            cs.setString(3, app2);
            cs.setInt(4, rol);
            cs.setString(5, color);

            cs.execute();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            try {
                getConnection().close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
        return true;
    }

    /**
     * Metodo para cargar todos los empleados que hayan dentro de la base de
     * datos
     *
     * @return Devuelve un model para la tabla que contiene ya todos los datos
     * que hay de la base de datos
     */
    public DefaultTableModel CargarEmpleados() {
        DefaultTableModel modelo = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };

        Object Datos[] = null;
        String Columnas[] = null;
        CallableStatement cs;
        ResultSet rs;
        ResultSetMetaData rsmd;

        try {
            cs = getConnection().prepareCall("{call mostrar_empleados}");

            rs = cs.executeQuery();
            rsmd = rs.getMetaData();

            int CuentaColumnas = rsmd.getColumnCount();

            Columnas = new String[CuentaColumnas];
            for (int i = 0; i < CuentaColumnas; i++) {
                Columnas[i] = rsmd.getColumnName(i + 1);
                modelo.addColumn(Columnas[i]);
            }

            while (rs.next()) {
                Datos = new Object[CuentaColumnas];

                for (int i = 0; i < CuentaColumnas; i++) {
                    Datos[i] = rs.getObject(i + 1);
                }
                modelo.addRow(Datos);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                getConnection().close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }

        return modelo;
    }

    /**
     * Metodo para comprobar el color a ver si ya está en uso
     *
     * @param color Recibe un color en forma hexadecimal para comprobar
     * @return Devuelve un booleano que significa el estado de lo obtgenido<br>
     * True: El color no se encuentra en uso<br>
     * False: El color se encuentra en uso
     */
    private boolean ComprobarColor(String color) {
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;

        try {
            ps = getConnection().prepareCall("SELECT cod_color FROM empleado");

            rs = ps.executeQuery();

            rsmd = rs.getMetaData();

            int columnas = rsmd.getColumnCount();

            while (rs.next()) {
                for (int i = 0; i < columnas; i++) {
                    String colorobt = rs.getString(i + 1);
                    if (colorobt.equals(color)) {
                        return false;
                    }
                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            try {
                getConnection().close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }

        return true;
    }

    /**
     * Metodo para borrar empleados de la base de datos
     *
     * @param cod_empleado Recibe el código del empleado por borrar
     * @return Devuelve un booleano que significa si se pudo borrar los datos en
     * la base de datos<br>
     * true: se borró<br>
     * false: no se borró
     */
    public boolean BorrarEmpleado(int cod_empleado) {
        CallableStatement cs;

        try {
            cs = getConnection().prepareCall("{call borrar_empleado(?)}");
            cs.setInt(1, cod_empleado);

            cs.execute();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            try {
                getConnection().close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return true;
    }

    /**
     * Metodo para modificar los datos de un empleado en base de su código
     *
     * @param nombre Recibe un String con el nombre del empleado
     * @param app1 Recibe un String con el primer apellido del empleado
     * @param app2 Recibe un String con el segundo apellido del empleado
     * @param rol Recibe int para definir el rol que va a tener el empleado
     * @param color Recibe un String con el color en formato hexadecimal del
     * @param cod_empleado Recibe el código del empleado que va a ser modificado
     * @return Devuelve un booleano que significa si se pudo modificar los datos
     * en la base de datos<br>
     * true: se modificó<br>
     * false: no se modificó
     */
    public boolean ModificarEmpleado(String nombre, String app1, String app2, int rol, String color, int cod_empleado) {
        
        if (!ComprobarColor(color)) {
            JOptionPane.showMessageDialog(null, "Ya se encuentra en uso ese color");
            return false;
        }
        
        CallableStatement cs;

        try {
            cs = getConnection().prepareCall("{call actualizar_empleado(?,?,?,?,?,?)}");

            cs.setInt(1, cod_empleado);
            cs.setString(2, nombre);
            cs.setString(3, app1);
            cs.setString(4, app2);
            cs.setInt(5, rol);
            cs.setString(6, color);

            cs.execute();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            try {
                getConnection().close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return true;
    }
}
