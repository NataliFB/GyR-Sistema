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
public class Consultas_Proveedores extends Conexion_A {

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

    public boolean BorrarProveedor(String cod_proveedor) {
        CallableStatement cs;

        try {
            cs = getConnection().prepareCall("{call borrar_proveedor(?)}");
            cs.setString(1, cod_proveedor);
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

    public boolean actualizar_proveedor(int cod_proveedor, String proveedor_real, String proveedor_fantasia, String correo, int telefono, int celular,
            int cedula, String contacto, String ubicacion, String observaciones) {

        CallableStatement cs;

        try {
            cs = getConnection().prepareCall("{call modificar_garantia(?,?,?,?,?,?,?,?,?,?)}");
            cs.setInt(1, cod_proveedor);
            cs.setString(2, proveedor_real);
            cs.setString(3, proveedor_fantasia);
            cs.setString(4, correo);
            cs.setInt(5, telefono);
            cs.setInt(6, celular);
            cs.setInt(7, cedula);
            cs.setString(8, contacto);
            cs.setString(9, ubicacion);
            cs.setString(10, observaciones);

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

    public boolean Añadir_Proveedor(int cod_proveedor, String proveedor_real, String proveedor_fantasia, String correo, int telefono, int celular,
            int cedula, String contacto, String ubicacion, String observaciones) {
        CallableStatement cs;

        try {
            cs = getConnection().prepareCall("{call insertar_proveedor(?,?,?,?,?,?,?,?,?,?)}");
            cs.setInt(1, cod_proveedor);
            cs.setString(2, proveedor_real);
            cs.setString(3, proveedor_fantasia);
            cs.setString(4, correo);
            cs.setInt(5, telefono);
            cs.setInt(6, celular);
            cs.setInt(7, cedula);
            cs.setString(8, contacto);
            cs.setString(9, ubicacion);
            cs.setString(10, observaciones);

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

    public boolean Insertar_bancos_cuentas(String cuenta, String banco, int cod_proveedor) {
        CallableStatement cs;

        try {
            cs = getConnection().prepareCall("{call insertar_proveedor(?,?,?)}");
            cs.setInt(1, cod_proveedor);
            cs.setString(2, cuenta);
            cs.setString(3, banco);
            cs.setInt(4, cod_proveedor);

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

    public boolean Insertar_articulos(String articulo) {
        CallableStatement cs;

        try {
            cs = getConnection().prepareCall("{call insertar_articulos(?)}");
            cs.setString(1, articulo);

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

    public boolean Insertar_proveedor_articulos(int cod_articulo, int cod_proveedor) {
        CallableStatement cs;

        try {
            cs = getConnection().prepareCall("{call insertar_proveedor_articulos (?,?)}");
            cs.setInt(1, cod_articulo);
            cs.setInt(2, cod_proveedor);

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
