package Consultas;

import Modelo.Mod_Usuario;
import main.Conexion_A;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Clase para realizar las consultas que tengan relación con la ventana de
 * Adjudicaciones, Orden y Entregada
 *
 * @author
 */
public class Consultas_Adjudicaciones extends Conexion_A {

    /**
     * Metodo para buscar una contratación para saber si es valida y obtener
     * datos relacionados a la contratación
     *
     * @param contratacion Recibe un String con la contratación para comprobarla
     * @return Devuelve el dato de la institución relacionada a la contratación
     * si devuelve es porque 'vacio' no se encuentra la contratación
     */
    public String BuscarContratacion(String contratacion) {
        String institucion = "";
        PreparedStatement ps;
        ResultSet rs;

        try {
            ps = getConnection().prepareCall("SELECT institucion FROM contrataciones WHERE cod_contratacion = ?");
            ps.setString(1, contratacion);

            rs = ps.executeQuery();

            if (rs.next()) {
                institucion = rs.getString(1);
            } else {
                return "Vacio";
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return "Vacio";
        } finally {
            try {
                getConnection().close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                return "Vacio";
            }
        }
        ///
        try {
            ps = getConnection().prepareStatement("SELECT cod_empleado FROM responsable WHERE cod_contratacion = ?");
            ps.setString(1, contratacion);
            rs = ps.executeQuery();

            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "Esta contratación no tiene ningún responsable. \nAsignese como responsable para adjudicarla.");
                return "Vacio";
            }

        } catch (SQLException e) {
            e.getMessage();
        } finally {
            try {
                getConnection().close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return institucion;
    }

    /**
     * Metodo para insertar adjudicaciones en la base de datos.<br>
     *
     * Primero comprueba si la contratación ya fue adjudicada y si la
     * contratación le pertenece a quien la está insertando.
     *
     * @param institucion Recibe un string que es la institución de la
     * contratación
     * @param diasEntrega Int para definir los dias de entrega
     * @param modalidadDias Booleano para la moladidad de los días (True:
     * Naturales, False: Hábiles)
     * @param empresa Booleano para definir la empresa (True: GyR, False: PB)
     * @param modalidadEntrega String para la modalidad de la entrega
     * @param descripcion String para añadirle una descripción, se puede recibir
     * vacio
     * @param estado Booleano para definir el estado de la adjudicación (True:
     * En Firme, False: En Duda)
     * @param observaciones String para las observaciones, se puede recibir
     * vacio
     * @param contratacion Recibe un String para definir la contratación a la
     * que se le añade la adjudicación
     * @return Devuelve un booleano que significa si se puedo insertar los datos
     * en la base de datos
     */
    public boolean InsertarAdjudicacion(String institucion, int diasEntrega, boolean modalidadDias, boolean empresa, String modalidadEntrega,
            String descripcion, boolean estado, String observaciones, String contratacion) {

        Mod_Usuario us = new Mod_Usuario();

        CallableStatement cs;
        PreparedStatement ps;
        ResultSet rs;
        ///
        ///
        try {
            ps = getConnection().prepareStatement("SELECT cod_adjudicacion FROM adjudicaciones WHERE cod_contratacion = ?");
            ps.setString(1, contratacion);

            rs = ps.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Esta contratación ya se encuentra adjudicada");
                return false;
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            try {
                getConnection().close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                return false;
            }
        }
        ///
        ///
        ///
        try {
            ps = getConnection().prepareStatement("SELECT responsable.cod_empleado, CONCAT(empleado.nombre_Empleado, ' ', empleado.appelido1_Empleado) "
                    + "FROM responsable INNER JOIN empleado ON responsable.cod_empleado = empleado.cod_empleado WHERE cod_contratacion = ?");
            ps.setString(1, contratacion);

            rs = ps.executeQuery();

            while (rs.next()) {
                if (rs.getInt(1) != us.getCodEmpleado()) {
                    JOptionPane.showMessageDialog(null, "Esta contratacion le pertenece al empleado:\n"
                            + rs.getString(2));
                    return false;
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
                return false;
            }
        }
        ///
        ///
        ///
        try {
            cs = getConnection().prepareCall("{call insertar_adjudicada(?,?,?,?,?,?,?,?,?)}");
            cs.setString(1, institucion);
            cs.setInt(2, diasEntrega);
            cs.setBoolean(3, modalidadDias);
            cs.setBoolean(4, empresa);
            cs.setString(5, modalidadEntrega);
            cs.setString(6, descripcion);
            cs.setBoolean(7, estado);
            cs.setString(8, observaciones);
            cs.setString(9, contratacion);

            cs.execute();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            try {
                getConnection().close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                return false;
            }
        }

        return true;
    }

    /**
     * Metodo para cargar los datos en las tablas
     *
     * @param panel Recibe el nombre del panel que va a cargar las tablas
     * @return Devuelve el modelo de las tablas con todos los datos
     */
    public DefaultTableModel CargarTabla(String panel) {
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int Row, int Column) {
                return false;
            }
        };

        Object[] datos = null;
        String[] columnas = null;

        CallableStatement cs;
        ResultSet rs;
        ResultSetMetaData rsmd;

        try {
            cs = getConnection().prepareCall("{call mostrar_" + panel + "}");

            rs = cs.executeQuery();

            rsmd = rs.getMetaData();

            int CuentaColumnas = rsmd.getColumnCount();

            columnas = new String[CuentaColumnas];
            for (int i = 0; i < CuentaColumnas; i++) {
                columnas[i] = rsmd.getColumnName(i + 1);
                modelo.addColumn(columnas[i]);
            }

            while (rs.next()) {
                datos = new Object[CuentaColumnas];

                for (int i = 0; i < CuentaColumnas; i++) {
                    datos[i] = rs.getObject(i + 1);
                }
                modelo.addRow(datos);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            try {
                getConnection().close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                return null;
            }
        }

        return modelo;
    }

    public Object[] BuscarAdjudicacion(int cod) {
        Object[] datos = null;
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;

        try {
            ps = getConnection().prepareStatement("SELECT cod_contratacion, institucion, dias_entrega, modalidad_dias, modalidad_entrega, empresa, "
                    + "descripcion, estado, observaciones FROM adjudicaciones WHERE cod_adjudicacion = ?");
            ps.setInt(1, cod);

            rs = ps.executeQuery();
            rsmd = rs.getMetaData();

            int columnas = rsmd.getColumnCount();
            datos = new Object[columnas];

            while (rs.next()) {
                for (int i = 0; i < columnas; i++) {
                    datos[i] = rs.getObject(i + 1);
                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            try {
                getConnection().close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                return null;
            }
        }

        return datos;
    }
}
