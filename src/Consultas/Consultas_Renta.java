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
public class Consultas_Renta extends Conexion_A {

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
            cs = getConnection().prepareCall("{call mostrar_proveedores}");

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

    public boolean Borrar_renta(int cod_renta) {
        CallableStatement cs;

        try {
            cs = getConnection().prepareCall("{call borrar_renta(?)}");
            cs.setInt(1, cod_renta);
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

    public boolean actualizar_renta(int cod_renta, int num_factura, String descripcion, String modalidad, int telefono, String fecha_renta,
            String nacionalidad, boolean moneda, double subtotal, double renta, double total, boolean tipo_renta, String cod_contratacion, int cod_proveedor) {

        CallableStatement cs;

        try {
            cs = getConnection().prepareCall("{call actualizar_renta(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cs.setInt(1, cod_renta);
            cs.setInt(2, num_factura);
            cs.setString(3, descripcion);
            cs.setString(4, modalidad);
            cs.setInt(5, telefono);
            cs.setDate(6, java.sql.Date.valueOf(fecha_renta));
            cs.setString(7, nacionalidad);
            cs.setBoolean(8, moneda);
            cs.setDouble(9, subtotal);
            cs.setDouble(10, renta);
            cs.setDouble(11, total);
            cs.setBoolean(12, tipo_renta);
            cs.setString(13, cod_contratacion);
            cs.setInt(14, cod_proveedor);

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

    public boolean insertar_renta(int cod_renta, int num_factura, String descripcion, String modalidad, int telefono, String fecha_renta,
            String nacionalidad, boolean moneda, double subtotal, double renta, double total, boolean tipo_renta, String cod_contratacion, int cod_proveedor) {

        CallableStatement cs;

        try {
            cs = getConnection().prepareCall("{call insertar_renta(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cs.setInt(1, cod_renta);
            cs.setInt(2, num_factura);
            cs.setString(3, descripcion);
            cs.setString(4, modalidad);
            cs.setInt(5, telefono);
            cs.setDate(6, java.sql.Date.valueOf(fecha_renta));
            cs.setString(7, nacionalidad);
            cs.setBoolean(8, moneda);
            cs.setDouble(9, subtotal);
            cs.setDouble(10, renta);
            cs.setDouble(11, total);
            cs.setBoolean(12, tipo_renta);
            cs.setString(13, cod_contratacion);
            cs.setInt(14, cod_proveedor);

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
