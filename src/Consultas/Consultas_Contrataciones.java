package Consultas;

import Modelo.Mod_IngresarContr;
import Modelo.Mod_Usuario;
import main.Conexion_A;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Consultas_Contrataciones extends Conexion_A {

    public boolean IngresarContratacion(Mod_IngresarContr ic) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
        String fechaP = sdf.format(new Date(ic.getFechaPublicacion()));
        String fechaA = sdf.format(new Date(ic.getFechaApertura()));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-dd-MM HH:mm:ss");
        LocalDateTime ldtP = LocalDateTime.parse(fechaP);
        LocalDateTime ldtA = LocalDateTime.parse(fechaA);
        Object objetoP = Timestamp.valueOf(ldtP.format(dtf));
        Object objetoA = Timestamp.valueOf(ldtA.format(dtf));

        CallableStatement cs;

        try {
            cs = getConnection().prepareCall("{call insertar_contratacion(?,?,?,?,?)}");
            cs.setString(1, ic.getNumContratacion());
            cs.setString(2, ic.getInstitución());
            cs.setString(3, ic.getDescripcion());
            cs.setObject(4, objetoP);
            cs.setObject(5, objetoA);

            cs.execute();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            if (e.getErrorCode() == 2627) {
                JOptionPane.showMessageDialog(null, "Esta contratación ya fue ingresada");
            }
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

    public boolean IngresarEstado(String contratacion, String estado) {
        PreparedStatement ps;

        try {
            ps = getConnection().prepareStatement("UPDATE estado_contratacion SET estado = ? WHERE cod_contratacion = ?");
            ps.setString(1, estado);
            ps.setString(2, contratacion);
            ps.execute();

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

    public DefaultTableModel CargarContratacionesIncompletas() {
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
            cs = getConnection().prepareCall("{call mostrar_contrataciones}");

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

    public DefaultTableModel CargarContratacionesCompletas() {
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
            cs = getConnection().prepareCall("{call mostrar_contrataciones_completas}");

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

    public Object[] BuscarContratacion(String contratacion) {
        Object[] datos = null;

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;

        try {
            ps = getConnection().prepareStatement("SELECT institucion, descripcion, CONVERT(varchar,fecha_publicacion,100),"
                    + "CONVERT(varchar,fecha_apertura,100), estado FROM contrataciones INNER JOIN estado_contratacion ON "
                    + "estado_contratacion.cod_contratacion = contrataciones.cod_contratacion "
                    + "WHERE contrataciones.cod_contratacion = ?");
            ps.setString(1, contratacion);
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

    public boolean BorrarContratacion(String contratacion) {
        CallableStatement cs;
        PreparedStatement ps;
        ResultSet rs;

        try {
            Mod_Usuario modUs = new Mod_Usuario();
            ps = getConnection().prepareStatement("SELECT cod_empleado FROM responsable WHERE cod_contratacion = ?");
            ps.setString(1, contratacion);
            
            rs = ps.executeQuery();

            if (rs.next()) {
                if (modUs.getCodEmpleado() != rs.getInt(1)) {
                    JOptionPane.showMessageDialog(null, "No puede borrar una contratacion que sea de otra persona");
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
            }
        }

        try {
            cs = getConnection().prepareCall("{call borrar_contratacion(?)}");

            cs.setString(1, contratacion);
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

    public boolean TomarContratacion(int codEmpleado, String contratacion) {
        CallableStatement cs;
        PreparedStatement ps;
        ResultSet rs;

        try {
            ps = getConnection().prepareStatement("SELECT R.cod_contratacion FROM responsable R INNER JOIN contrataciones C ON "
                    + "R.cod_contratacion = C.cod_contratacion WHERE R.cod_contratacion = ?");
            ps.setString(1, contratacion);

            rs = ps.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "La contratación " + contratacion + "\nYa se encuentra con alguien a cargo");
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
            }
        }

        try {
            cs = getConnection().prepareCall("{call insertar_responsable(?,?)}");
            cs.setInt(1, codEmpleado);
            cs.setString(2, contratacion);

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
