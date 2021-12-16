package Consultas;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import main.Conexion_A;
import static main.Conexion_A.getConnection;

/**
 *
 * @author DavidAraya
 */
public class Consultas_Proveedores extends Conexion_A {

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

    public boolean BorrarProveedor(int cod_proveedor) {
        CallableStatement cs;

        try {
            cs = getConnection().prepareCall("{call borrar_proveedor(?)}");
            cs.setInt(1, cod_proveedor);
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
            cs = getConnection().prepareCall("{call modificar_proveedor(?,?,?,?,?,?,?,?,?,?)}");
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

    public boolean Añadir_Proveedor(String proveedor_real, String proveedor_fantasia, String correo, int telefono, int celular,
            int cedula, String contacto, String ubicacion, String observaciones) {
        CallableStatement cs;

        try {
            cs = getConnection().prepareCall("{call insertar_proveedor(?,?,?,?,?,?,?,?,?)}");
            cs.setString(1, proveedor_real);
            cs.setString(2, proveedor_fantasia);
            cs.setString(3, correo);
            cs.setInt(4, telefono);
            cs.setInt(5, celular);
            cs.setInt(6, cedula);
            cs.setString(7, contacto);
            cs.setString(8, ubicacion);
            cs.setString(9, observaciones);

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
            cs = getConnection().prepareCall("{call insertar_bancos_cuentas(?,?,?)}");
            cs.setString(1, cuenta);
            cs.setString(2, banco);
            cs.setInt(3, cod_proveedor);

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

    public boolean Insertar_articulos(int cod, String articulo) {
        CallableStatement cs;

        try {
            cs = getConnection().prepareCall("{call insertar_articulos(?,?)}");
            cs.setString(1, articulo);
            cs.setInt(2, cod);

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

    public Object[] CargarProveedor(int codProveedor) {
        Object[] datos = null;

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;

        try {
            ps = getConnection().prepareStatement("SELECT * FROM proveedores WHERE cod_proveedor = ?");
            ps.setInt(1, codProveedor);

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

    public List CargarBancosCuentas(int proveedor) {
        List<String[]> datos = new ArrayList<>();

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;

        try {
            ps = getConnection().prepareStatement("SELECT p.proveedor_real, cuenta, banco "
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

    public List CargarArticulos(int proveedor) {
        List<String[]> datos = new ArrayList<>();

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;

        try {
            ps = getConnection().prepareStatement("SELECT proveedor_real, nombre_articulo FROM proveedores INNER JOIN articulos ON "
                    + "articulos.cod_proveedor = proveedores.cod_proveedor WHERE proveedores.cod_proveedor = ?");
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

    public boolean BorrarCuentaBanco(int codProovedor, String cuenta, String banco) {
        PreparedStatement ps;

        try {
            ps = getConnection().prepareStatement("DELETE FROM bancos_cuentas WHERE cod_proveedor = ? AND cuenta = ? AND banco = ?");
            ps.setInt(1, codProovedor);
            ps.setString(2, cuenta);
            ps.setString(3, banco);

            ps.execute();

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

    public boolean BorrarArticulo(int codProovedor, String articulo) {
        PreparedStatement ps;

        try {
            ps = getConnection().prepareStatement("DELETE FROM articulos WHERE cod_proveedor = ? AND nombre_articulo = ?");
            ps.setInt(1, codProovedor);
            ps.setString(2, articulo);

            ps.execute();

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
}
