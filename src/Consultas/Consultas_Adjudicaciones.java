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
            ps = getConnection().prepareStatement("SELECT responsable.cod_empleado, CONCAT(empleado.nombre_Empleado, ' ', empleado.apellido1_Empleado) "
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

    /**
     * Metodo para buscar los datos de una adjudicación en especifico y
     * mostrarlos en pantalla
     *
     * @param cod Recibe un int que es el código de la adjudicación que se va a
     * buscar
     * @return Retorna un arreglo de tipo Object que son los datos de la
     * adjudicación
     */
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

    /**
     * Metodo para borrar adjudicaciones
     *
     * @param codRegistro Recibe un int que es el código de la adjudicación,
     * orden o entregada por borrar
     * @return Devuelve un booleano que significa si se puedo borrar el registro
     */
    public boolean BorrarRegistro(int codRegistro, String panel) {
        CallableStatement cs;

        try {
            cs = getConnection().prepareCall("{call borrar_" + panel + "(?)}");
            cs.setInt(1, codRegistro);

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
     * Metodo para modificar una adjudicacion
     *
     * @param codAdjudicacion Recibe un int que es el codigo de la adjudicacion
     * que se va a modificar
     * @param diasEntrega diasEntrega Int para definir los dias de entrega
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
     * @return
     */
    public boolean ModificarAjudicacion(int codAdjudicacion, int diasEntrega, boolean modalidadDias, boolean empresa, String modalidadEntrega,
            String descripcion, boolean estado, String observaciones) {
        CallableStatement cs;

        try {
            cs = getConnection().prepareCall("{call modificar_adjudicacion(?,?,?,?,?,?,?,?)}");
            cs.setInt(1, codAdjudicacion);
            cs.setInt(2, diasEntrega);
            cs.setBoolean(3, modalidadDias);
            cs.setBoolean(4, empresa);
            cs.setString(5, modalidadEntrega);
            cs.setString(6, descripcion);
            cs.setBoolean(7, estado);
            cs.setString(8, observaciones);

            cs.execute();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
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
     * Metodo para insertar orden
     *
     * @param diasEntrega Dias de entrega de la orden
     * @param vigenciaContrato Vigencia del contrato de la orden
     * @param fechaLimite Fecha limite de la orden
     * @param descripcion Descripcion
     * @param numOrden Número de la orden
     * @param lugarEntrega El lugar de entrega
     * @param observaciones Observaciones
     * @param modalidad La modalidad de la orden
     * @param contratacion El número de contratacion relacionado a la ordenr
     * @return Devuelve un booleano de si se inserto o no
     */
    public boolean InsertarOrden(int diasEntrega, int vigenciaContrato, String fechaLimite, String descripcion, int numOrden, String lugarEntrega,
            String observaciones, String modalidad, String contratacion) {

        Mod_Usuario us = new Mod_Usuario();

        CallableStatement cs;
        PreparedStatement ps;
        ResultSet rs;
        ///
        ///
        try {
            ps = getConnection().prepareStatement("SELECT cod_orden FROM orden WHERE cod_contratacion = ?");
            ps.setString(1, contratacion);

            rs = ps.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Esta contratación ya se encuentra en orden");
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
            ps = getConnection().prepareStatement("SELECT responsable.cod_empleado, CONCAT(empleado.nombre_Empleado, ' ', empleado.apellido1_Empleado) "
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

        try {
            cs = getConnection().prepareCall("{call insertar_orden(?,?,?,?,?,?,?,?,?)}");

            cs.setInt(1, diasEntrega);
            cs.setInt(2, vigenciaContrato);
            cs.setDate(3, Date.valueOf(fechaLimite));
            cs.setString(4, descripcion);
            cs.setInt(5, numOrden);
            cs.setString(6, lugarEntrega);
            cs.setString(7, observaciones);
            cs.setString(8, modalidad);
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
     * Metodo para buscar registros en la tabla orden
     *
     * @param cod Recibe un int que es el código del registro por buscar
     * @return Devuelve un arreglos con los datos del registro
     */
    public Object[] BuscarOrden(int cod) {
        Object[] datos = null;
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;

        try {
            ps = getConnection().prepareStatement("SELECT cod_contratacion, dias_entrega, vigencia_contrato, fecha_limite, descripcion, "
                    + "num_orden, lugar_entrega, observaciones, modalidad FROM orden WHERE cod_orden = ?");
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

    /**
     *
     * @param codOrden Número de orden del registro que se va a modificar
     * @param diasEntrega Dias de entrega de la orden
     * @param vigenciaContrato Vigencia del contrato de la orden
     * @param fechaLimite Fecha limite de la orden
     * @param descripcion Descripcion
     * @param numOrden Número de la orden
     * @param lugarEntrega El lugar de entrega
     * @param observaciones Observaciones
     * @param modalidad La modalidad de la orden
     * @return Retorna un booleano que significa si se modificó el registro
     */
    public boolean ModificarOrden(int codOrden, int diasEntrega, int vigenciaContrato, String fechaLimite, String descripcion, int numOrden, String lugarEntrega,
            String observaciones, String modalidad) {
        CallableStatement cs;

        try {
            cs = getConnection().prepareCall("{call modificar_orden(?,?,?,?,?,?,?,?,?)}");
            cs.setInt(1, codOrden);
            cs.setInt(2, diasEntrega);
            cs.setInt(3, vigenciaContrato);
            cs.setString(4, fechaLimite);
            cs.setString(5, descripcion);
            cs.setInt(6, numOrden);
            cs.setString(7, lugarEntrega);
            cs.setString(8, observaciones);
            cs.setString(9, modalidad);

            cs.execute();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
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
     * Metodo para insertar registros en Entregdas
     *
     * @param diasEntrega Dias para entregar
     * @param fecha Fecha para entregar
     * @param lugarEntrega Lugar donde se entrega
     * @param descripcion La descripcion del registro
     * @param empresa La empresa (boolean)
     * @param observaciones Observaciones del registro
     * @param medioEntrega El medio de entrega
     * @param contratacion Y la contratacion que va relacionada a la entrega
     * @return Devuelve un booleano que significa si se pudo insertar el
     * registro
     */
    public boolean InsertarEntregada(int diasEntrega, String fecha, String lugarEntrega, String descripcion, boolean empresa, String observaciones,
            String medioEntrega, String contratacion) {

        Mod_Usuario us = new Mod_Usuario();

        CallableStatement cs;
        PreparedStatement ps;
        ResultSet rs;
        ///
        ///
        try {
            ps = getConnection().prepareStatement("SELECT cod_entregadas FROM entregadas WHERE cod_contratacion = ?");
            ps.setString(1, contratacion);

            rs = ps.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Esta contratación ya se encuentra en entregadas");
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
            ps = getConnection().prepareStatement("SELECT responsable.cod_empleado, CONCAT(empleado.nombre_Empleado, ' ', empleado.apellido1_Empleado) "
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
            cs = getConnection().prepareCall("{call insertar_entregadas(?,?,?,?,?,?,?,?)}");

            cs.setInt(1, diasEntrega);
            cs.setDate(2, Date.valueOf(fecha));
            cs.setString(3, lugarEntrega);
            cs.setString(4, descripcion);
            cs.setBoolean(5, empresa);
            cs.setString(6, observaciones);
            cs.setString(7, medioEntrega);
            cs.setString(8, contratacion);

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
     * Metodo para buscar un registro en especifico en entregadas
     *
     * @param cod Código que va con el registro que se quiere buscar
     * @return Devuelve un arreglo con los datos del registro que se queria
     * buscar
     */
    public Object[] BuscarEntregada(int cod) {
        Object[] datos = null;
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;

        try {
            ps = getConnection().prepareStatement("SELECT cod_contratacion, dias_entrega, fecha_entrega, lugar_entrega, descripcion, "
                    + "empresa, observaciones, medio_entrega FROM entregadas WHERE cod_entregadas = ?");
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

    /**
     * Metodo para modificar registros en entregadas
     *
     * @param cod Código que define el registro que se va a modificar
     * @param diasEntrega Dias para entregar
     * @param fecha Fecha para entregar
     * @param lugarEntrega Lugar donde se entrega
     * @param descripcion La descripcion del registro
     * @param empresa La empresa (boolean)
     * @param observaciones Observaciones del registro
     * @param medioEntrega El medio de entrega
     * @return
     */
    public boolean ModificarEntregadas(int codEntregadas, int diasEntrega, String fecha, String lugarEntrega, String descripcion, boolean empresa, String observaciones,
            String medioEntrega) {
        
        CallableStatement cs;

        try {
            cs = getConnection().prepareCall("{call modificar_entregadas(?,?,?,?,?,?,?,?)}");
            cs.setInt(1, codEntregadas);
            cs.setInt(2, diasEntrega);
            cs.setDate(3, Date.valueOf(fecha));
            cs.setString(4, lugarEntrega);
            cs.setString(5, descripcion);
            cs.setBoolean(6, empresa);
            cs.setString(7, observaciones);
            cs.setString(8, medioEntrega);

            cs.execute();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
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
