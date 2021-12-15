package Consultas;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import main.Conexion_A;
import static main.Conexion_A.getConnection;

/**
 *
 * @author DavidAraya
 */
public class Consultas_Facturas extends Conexion_A {
    public DefaultTableModel CargarDatos(String panel) {
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
            boolean efectivo, boolean moneda, double monto, String institucion_cedida, String banco, String observaciones, String cod_contratacion) {

        CallableStatement cs;

        try {
            cs = getConnection().prepareCall("{call actualizar_facturas(?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cs.setInt(1, cod_factura);
            cs.setString(2, institucion);
            cs.setDate(2, java.sql.Date.valueOf(fecha_factura));
            cs.setDate(3, java.sql.Date.valueOf(fecha_cancelado));
            cs.setInt(5, transferencia);
            cs.setString(6, estado);
            cs.setBoolean(7, efectivo);
            cs.setBoolean(8, moneda);
            cs.setDouble(9, monto);
            cs.setString(10, institucion_cedida);
            cs.setString(11, banco);
            cs.setString(12, observaciones);
            cs.setString(13, cod_contratacion);

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
    
    public boolean insertar_facturas(int cod_factura, String institucion, String fecha_factura, String fecha_cancelado, int transferencia, String estado,
            boolean efectivo, boolean moneda, double monto, String institucion_cedida, String banco, String observaciones, String cod_contratacion) {

        CallableStatement cs;

        try {
            cs = getConnection().prepareCall("{call insertar_facturas(?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cs.setInt(1, cod_factura);
            cs.setString(2, institucion);
            cs.setDate(2, java.sql.Date.valueOf(fecha_factura));
            cs.setDate(3, java.sql.Date.valueOf(fecha_cancelado));
            cs.setInt(5, transferencia);
            cs.setString(6, estado);
            cs.setBoolean(7, efectivo);
            cs.setBoolean(8, moneda);
            cs.setDouble(9, monto);
            cs.setString(10, institucion_cedida);
            cs.setString(11, banco);
            cs.setString(12, observaciones);
            cs.setString(13, cod_contratacion);

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
