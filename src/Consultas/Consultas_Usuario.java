package Consultas;

import Modelo.Mod_Usuario;
import main.Conexion_A;
import java.sql.CallableStatement;
import java.sql.Types;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;

public class Consultas_Usuario extends Conexion_A {

    public boolean InicioSesion(Mod_Usuario us) {

        boolean inicioS = false;

        CallableStatement cs;

        try {
            cs = getConnection().prepareCall("{call loguear_user(?, ?, ?)}");
            cs.setString(1, us.getUsuario());
            cs.setString(2, us.getContrasena());
            cs.registerOutParameter(3, Types.BOOLEAN);

            cs.execute();

            inicioS = cs.getBoolean(3);

        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            try {
                getConnection().close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }

        return inicioS;
    }

    public Object[] BuscarEmpleado(String cod){
        Object[] datos = null;
        
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        
        try{
            ps = getConnection().prepareCall("SELECT nombre_empleado, appelido1_empleado, appelido2_empleado, cod_rol, cod_color "
                    + "FROM empleado WHERE cod_empleado = ?");
            ps.setInt(1, Integer.parseInt(cod));
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            
            int columnas = rsmd.getColumnCount();
            
            while(rs.next()){
                datos = new Object[columnas];
                for(int i = 0; i < columnas; i++){
                    datos[i] = rs.getObject(i + 1);
                }
            }
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }finally{
            try{
                getConnection().close();
            }catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
        
        return datos;
    }
    
    public boolean DatosUsuario(Mod_Usuario us) {

        CallableStatement cs;
        ResultSet rs;

        try {
            cs = getConnection().prepareCall("{call buscar_empleado(?)}");
            cs.setString(1, us.getUsuario());
            rs = cs.executeQuery();

            while (rs.next()) {
                us.setCodEmpleado(rs.getInt(1));
                us.setColor(rs.getString(2));
                us.setNombreEmpleado(rs.getString(3));
                us.setNivelAdm(rs.getString(4));
            }
            
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                getConnection().close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
        return true;
    }

    public boolean ActualizarContrasena(Mod_Usuario us) {
        CallableStatement cs;

        try {
            cs = getConnection().prepareCall("{call actualizar_contraseña(?,?)}");
            cs.setString(1, us.getContrasena());
            cs.setString(2, us.getUsuario());

            cs.execute();
            
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                getConnection().close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
        return true;
    }

    public boolean AgregarEmpleado(String nombre, String app1, String app2, int rol, String color) {

        if(!ComprobarColor(color)){
            JOptionPane.showMessageDialog(null, "Ya se encuentra en uso ese color");
            return false;
        }
        
        CallableStatement cs;

        try {
            cs = getConnection().prepareCall("{call insertar_empleados (?,?,?,?,?)}");
            cs.setString(1, nombre);
            cs.setString(2, app1);
            cs.setString(3, app2);
            cs.setInt(4, rol);
            cs.setString(5, color);

            cs.execute();
    
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            try {
                getConnection().close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
        return true;
    }

    public DefaultTableModel CargarEmpleados() {
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
            cs = getConnection().prepareCall("{call mostrar_empleados}");

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
    
    private boolean ComprobarColor(String color){
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        
        try{
            ps = getConnection().prepareCall("SELECT cod_color FROM empleado");
            
            rs = ps.executeQuery();
            
            rsmd = rs.getMetaData();
            
            int columnas = rsmd.getColumnCount();
            
            while(rs.next()){
                for(int i = 0; i < columnas; i++){
                    String colorobt = rs.getString(i + 1);
                    if(colorobt.equals(color)){
                        return false;
                    }
                }
            }
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }finally{
            try{
                getConnection().close();
            }catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
        
        return true;
    }
    
    public boolean BorrarEmpleado(int cod_empleado){
        CallableStatement cs;
        
        try{
            cs = getConnection().prepareCall("{call borrar_empleado(?)}");
            cs.setInt(1, cod_empleado);
            
            cs.execute();
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }finally{
            try{
                getConnection().close();
            }catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
        return true;
    }
    
    public boolean ModificarEmpleado(String nombre, String app1, String app2, int rol, String color, int cod_empleado){
        
        CallableStatement cs;
        
        try{
            cs = getConnection().prepareCall("{call actualizar_empleado(?,?,?,?,?,?)}");
            
            cs.setInt(1, cod_empleado);
            cs.setString(2, nombre);
            cs.setString(3, app1);
            cs.setString(4, app2);
            cs.setInt(5, rol);
            cs.setString(6, color);
            
            cs.execute();
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }finally{
            try{
                getConnection().close();
            }catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
        return true;
    }
}
