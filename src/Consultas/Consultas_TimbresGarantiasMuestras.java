package Consultas;

import java.math.BigDecimal;
import main.Conexion_A;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static main.Conexion_A.getConnection;

/**
 * Clase para realizar las consultas que tengan relación con la ventana de
 * Timbres, Garantias y Muestras
 *
 * @author
 */
public class Consultas_TimbresGarantiasMuestras extends Conexion_A {

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

    public String[] BuscarContratacion(String contratacion) {
        String datos[] = new String[2];
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;

        try {
            ps = getConnection().prepareCall("SELECT institucion, CONCAT(empleado.nombre_Empleado, ' ', empleado.apellido1_Empleado) FROM (contrataciones \n"
                    + "INNER JOIN responsable ON responsable.cod_contratacion = contrataciones.cod_contratacion) "
                    + "INNER JOIN empleado ON empleado.cod_empleado = responsable.cod_empleado "
                    + "WHERE contrataciones.cod_contratacion = ?");
            ps.setString(1, contratacion);

            rs = ps.executeQuery();

            if (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
            } else {
                return null;
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
        ///
        try {
            ps = getConnection().prepareStatement("SELECT cod_empleado FROM responsable WHERE cod_contratacion = ?");
            ps.setString(1, contratacion);
            rs = ps.executeQuery();

            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "Esta contratación no tiene ningún responsable. \nAsignese como responsable para adjudicarla.");
                return null;
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
        return datos;
    }

    public boolean BorrarRegistro(int cod, String panel) {
        CallableStatement cs;

        try {
            cs = getConnection().prepareCall("{call borrar_" + panel + "(?)}");
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

    public boolean AñadirGarantia(String institucion, String fechaPago, String fechaDevolucion, String tiempo, String estado,
            String objeto, String observaciones, double monto, String tipoGarantia, int codigoEmpleado, String codContratacion) {
        CallableStatement cs;

        try {
            cs = getConnection().prepareCall("{call insertar_garantia(?,?,?,?,?,?,?,?,?,?,?)}");
            cs.setString(1, institucion);
            cs.setDate(2, Date.valueOf(fechaPago));
            cs.setDate(3, Date.valueOf(fechaDevolucion));
            cs.setString(4, tiempo);
            cs.setString(5, estado);
            cs.setString(6, objeto);
            cs.setString(7, observaciones);
            cs.setBigDecimal(8, BigDecimal.valueOf(monto));
            cs.setString(9, tipoGarantia);
            cs.setInt(10, codigoEmpleado);
            cs.setString(11, codContratacion);

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

    public boolean ModificarGarantia(int codGarantia, String institucion, String fechaPago, String fechaDevolucion, String tiempo, String estado,
            String objeto, String observaciones, double monto, String tipoGarantia, int codigoEmpleado) {

        CallableStatement cs;

        try {
            cs = getConnection().prepareCall("{call modificar_garantia(?,?,?,?,?,?,?,?,?,?,?)}");
            cs.setInt(1, codGarantia);
            cs.setString(2, institucion);
            cs.setDate(3, Date.valueOf(fechaPago));
            cs.setDate(4, Date.valueOf(fechaDevolucion));
            cs.setString(5, tiempo);
            cs.setString(6, estado);
            cs.setString(7, objeto);
            cs.setString(8, observaciones);
            cs.setBigDecimal(9, BigDecimal.valueOf(monto));
            cs.setString(10, tipoGarantia);
            cs.setInt(11, codigoEmpleado);

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

    public boolean AñadirTimbre(String institucion, String descripcion, double monto, String estado, String observaciones,
            int codigoEmpleado, String codContratacion) {
        CallableStatement cs;

        try {
            cs = getConnection().prepareCall("{call insertar_timbre(?,?,?,?,?,?,?)}");
            cs.setString(1, institucion);
            cs.setString(2, descripcion);
            cs.setBigDecimal(3, BigDecimal.valueOf(monto));
            cs.setString(4, estado);
            cs.setString(5, observaciones);
            cs.setInt(6, codigoEmpleado);
            cs.setString(7, codContratacion);

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

    public boolean ModificarTimbre(int codTimbre, String descripcion, String institucion, double monto, String estado, String observaciones,
            int codigoEmpleado) {
        CallableStatement cs;

        try {
            cs = getConnection().prepareCall("{call modificar_timbre(?,?,?,?,?,?,?)}");
            cs.setInt(1, codTimbre);
            cs.setString(2, descripcion);
            cs.setString(3, institucion);
            cs.setBigDecimal(4, BigDecimal.valueOf(monto));
            cs.setString(5, estado);
            cs.setString(6, observaciones);
            cs.setInt(7, codigoEmpleado);

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

    public boolean AñadirMuestra(String institucion, String objeto, int cantidad, String fechaEntrega, String fechaRetiro,
            String estado, String observaciones, String codContratacion) {
        CallableStatement cs;

        try {
            cs = getConnection().prepareCall("{call insertar_muestra(?,?,?,?,?,?,?,?)}");
            cs.setString(1, institucion);
            cs.setString(2, objeto);
            cs.setInt(3, cantidad);
            cs.setDate(4, Date.valueOf(fechaEntrega));
            cs.setDate(5, Date.valueOf(fechaRetiro));
            cs.setString(6, estado);
            cs.setString(7, observaciones);
            cs.setString(8, codContratacion);

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

    public boolean ModificarMuestra(int codMuestra, String institucion, String objeto, int cantidad, String fechaEntrega, String fechaRetiro,
            String estado, String observaciones) {
        CallableStatement cs;

        try {
            cs = getConnection().prepareCall("{call modificar_muestra(?,?,?,?,?,?,?,?)}");
            cs.setInt(1, codMuestra);
            cs.setString(2, institucion);
            cs.setString(3, objeto);
            cs.setInt(4, cantidad);
            cs.setDate(5, Date.valueOf(fechaEntrega));
            cs.setDate(6, Date.valueOf(fechaRetiro));
            cs.setString(7, estado);
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

    public Object[] BuscarRegistro(int cod, int opcion) {
        Object[] datos = null;

        String consulta = "";

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;

        switch (opcion) {

            case 1:
                consulta = "SELECT cod_contratacion, institucion, objeto, monto, estado, tiempo, fecha_pago, fecha_devolucion, CONCAT(EMP.nombre_Empleado, ' ', "
                        + "EMP.apellido1_Empleado), tipo_garantia, observaciones FROM \n"
                        + "garantias INNER JOIN empleado EMP ON garantias.encargado_envio = EMP.cod_empleado WHERE cod_garantia = ?";
                break;

            case 2:
                consulta = "SELECT cod_contratacion, institucion, descripcion, monto, estado, CONCAT(EMP.nombre_Empleado, ' ', EMP.apellido1_Empleado), "
                        + "observaciones FROM \n"
                        + "timbres INNER JOIN empleado EMP ON timbres.encargado_envio = EMP.cod_empleado WHERE cod_timbre = ?";
                break;

            case 3:
                consulta = "SELECT cod_contratacion, institucion, objeto, cantidad, estado, fecha_entrega, fecha_retiro, observaciones FROM \n"
                        + "muestras WHERE cod_muestra = ?";
                break;
        }

        try {
            ps = getConnection().prepareStatement(consulta);
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
