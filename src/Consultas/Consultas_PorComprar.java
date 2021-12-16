package Consultas;

import Modelo.Mod_Usuario;
import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.Conexion_A;

/**
 *
 * @author
 */
public class Consultas_PorComprar extends Conexion_A {

    public boolean BuscarContratacion(String contratacion) {
        PreparedStatement ps;
        ResultSet rs;

        try {
            ps = getConnection().prepareCall("SELECT cod_contratacion FROM contrataciones WHERE cod_contratacion = ?");
            ps.setString(1, contratacion);

            rs = ps.executeQuery();

            if (!rs.next()) {
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
        try {
            ps = getConnection().prepareStatement("SELECT cod_empleado FROM responsable WHERE cod_contratacion = ?");
            ps.setString(1, contratacion);
            rs = ps.executeQuery();

            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "Esta contratación no tiene ningún responsable. \nAsignese como responsable para adjudicarla.");
                return false;
            }

        } catch (SQLException e) {
            e.getMessage();
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

    public DefaultTableModel CargarTabla() {
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
            cs = getConnection().prepareCall("{call mostrar_porcomprar}");

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

    public String[] CargarProveedores() {
        String[] datos = null;

        PreparedStatement ps;
        ResultSet rs;

        try {
            ps = getConnection().prepareStatement("SELECT cod_proveedor, proveedor_real FROM proveedores");

            rs = ps.executeQuery();

            int filas = 0;

            while (rs.next()) {
                filas++;
            }

            datos = new String[filas];

            rs = ps.executeQuery();

            int i = 0;
            while (rs.next()) {
                datos[i] = "(" + rs.getInt(1) + ") " + rs.getString(2);
                i++;
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

    public List BuscarProveedor(int proveedor) {
        List<String[]> datos = new ArrayList<>();

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;

        try {
            ps = getConnection().prepareStatement("SELECT p.proveedor_real, p.proveedor_fantasia, p.cedula, cuenta, banco "
                    + "FROM proveedores p INNER JOIN bancos_cuentas ON\n"
                    + "bancos_cuentas.cod_proveedor = p.cod_proveedor WHERE p.cod_proveedor = ?");
            ps.setInt(1, proveedor);

            rs = ps.executeQuery();

            rsmd = rs.getMetaData();

            int columnas = rsmd.getColumnCount();

            while (rs.next()) {
                String[] fila = new String[columnas];
                for (int i = 1; i <= columnas; i++) {
                    Object obj = rs.getObject(i);
                    fila[i - 1] = (obj == null) ? null : obj.toString();
                }
                datos.add(fila);
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

    public boolean AñadirCompra(String objeto, double montoOfertado, double costo, String observacion, int codProveedor, String contratacion, Mod_Usuario us) {
        CallableStatement cs;
        PreparedStatement ps;
        ResultSet rs;

        ///
        ///
        ///
        if (!us.getPermisos()[8]) {
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
        }
        ///
        ///
        ///
        try {
            cs = getConnection().prepareCall("{call insertar_por_comprar(?,?,?,?,?,?)}");
            cs.setString(1, objeto);
            cs.setBigDecimal(2, BigDecimal.valueOf(montoOfertado));
            cs.setBigDecimal(3, BigDecimal.valueOf(costo));
            cs.setString(4, observacion);
            cs.setInt(5, codProveedor);
            cs.setString(6, contratacion);

            cs.execute();

        } catch (SQLException e) {
            System.out.println(e.getMessage() + ":Error aqui");
            return false;
        } finally {
            try {
                getConnection().close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage() + ":Error al cerrar");
                return false;
            }
        }

        return true;
    }

    public Object[] CargarCompra(int cod) {
        Object[] datos = null;
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;

        try {
            ps = getConnection().prepareStatement("SELECT cod_contratacion, objeto, monto_ofertado, costo, observacion, cod_proveedor "
                    + "FROM por_comprar WHERE cod_porcomprar = ?");
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
        } finally {
            try {
                getConnection().close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }

        return datos;
    }

    public boolean BorrarCompra(int cod) {
        CallableStatement cs;

        try {
            cs = getConnection().prepareCall("{call borrar_por_comprar(?)}");
            cs.setInt(1, cod);

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
    
    public boolean ModificarCompra(int cod, String objeto, double montoOfertado, double costo, String observacion, String contratacion ,Mod_Usuario us){
        CallableStatement cs;
        PreparedStatement ps;
        ResultSet rs;

        ///
        ///
        ///
        if (!us.getPermisos()[8]) {
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
        }
        ///
        ///
        ///
        try {
            cs = getConnection().prepareCall("{call actualizar_por_comprar(?,?,?,?,?)}");
            cs.setInt(1, cod);
            cs.setString(2, objeto);
            cs.setBigDecimal(3, BigDecimal.valueOf(montoOfertado));
            cs.setBigDecimal(4, BigDecimal.valueOf(costo));
            cs.setString(5, observacion);

            cs.execute();

        } catch (SQLException e) {
            System.out.println(e.getMessage() + ":Error aqui");
            return false;
        } finally {
            try {
                getConnection().close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage() + ":Error al cerrar");
                return false;
            }
        }

        return true;
    }
}
