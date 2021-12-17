package Consultas;

import java.math.BigDecimal;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.Conexion_A;
import static main.Conexion_A.getConnection;

/**
 *
 * @author DavidAraya
 */
public class Consultas_Facturas extends Conexion_A {
    public DefaultTableModel CargarDatos() {
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
            cs = getConnection().prepareCall("{call mostrar_facturas}");

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
    
    public boolean Borrar_Factura (int cod_factura) {
        CallableStatement cs;

        try {
            cs = getConnection().prepareCall("{call borrar_factura(?)}");
            cs.setInt(1, cod_factura);
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
    
    public boolean actualizar_facturas(int cod_factura, String institucion, String fecha_factura, String fecha_cancelado, int transferencia, String estado,
            boolean efectivo, boolean moneda, double monto, String institucion_cedida, String banco, String observaciones, String cod_contratacion,
            double renta, String descripcion) {

        CallableStatement cs;

        try {
            cs = getConnection().prepareCall("{call actualizar_facturas(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cs.setInt(1, cod_factura);
            cs.setString(2, institucion);
            cs.setDate(3, java.sql.Date.valueOf(fecha_factura));
            cs.setDate(4, java.sql.Date.valueOf(fecha_cancelado));
            cs.setInt(5, transferencia);
            cs.setString(6, estado);
            cs.setBoolean(7, efectivo);
            cs.setBoolean(8, moneda);
            cs.setDouble(9, monto);
            cs.setString(10, institucion_cedida);
            cs.setString(11, banco);
            cs.setString(12, observaciones);
            cs.setString(13, cod_contratacion);
            cs.setBigDecimal(14, BigDecimal.valueOf(renta));
            cs.setString(15, descripcion);

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
    
    public boolean insertar_facturas(String institucion, String fecha_factura, String fecha_cancelado, int transferencia, String estado,
            boolean efectivo, boolean moneda, double monto, String institucion_cedida, String banco, String observaciones, String cod_contratacion, 
            double renta, String descripcion) {

        CallableStatement cs;

        try {
            cs = getConnection().prepareCall("{call insertar_factura(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cs.setString(1, institucion);
            cs.setDate(2, java.sql.Date.valueOf(fecha_factura));
            cs.setDate(3, java.sql.Date.valueOf(fecha_cancelado));
            cs.setInt(4, transferencia);
            cs.setString(5, estado);
            cs.setBoolean(6, efectivo);
            cs.setBoolean(7, moneda);
            cs.setDouble(8, monto);
            cs.setString(9, institucion_cedida);
            cs.setString(10, banco);
            cs.setString(11, observaciones);
            cs.setString(12, cod_contratacion);
            cs.setBigDecimal(13, BigDecimal.valueOf(renta));
            cs.setString(14, descripcion);

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
            return null;
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
    
    public Object[] CargarFactura(int cod) {
        Object[] datos = null;
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;

        try {
            ps = getConnection().prepareStatement("SELECT * FROM facturas WHERE cod_factura = ?");
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
}