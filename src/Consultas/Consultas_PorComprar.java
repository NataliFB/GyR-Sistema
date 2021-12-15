package Consultas;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import main.Conexion_A;

/**
 *
 * @author
 */
public class Consultas_PorComprar extends Conexion_A {

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
    
    public String[] CargarProveedores(){
        String[] datos = null;
        
        PreparedStatement ps;
        ResultSet rs;
        
        try{
            ps = getConnection().prepareStatement("SELECT cod_proveedor, proveedor_real FROM proveedores");
            
            rs = ps.executeQuery();
            
            int filas = 0;
            
            while(rs.next()){
                filas++;
            }
            
            datos = new String[filas];
            
            rs = ps.executeQuery();
            
            int i = 0;
            while(rs.next()){
                datos[i] = "(" + rs.getInt(1) + ") " + rs.getString(2);
                i++;
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

    public static void main(String[] args) {
        Consultas_PorComprar cpc = new Consultas_PorComprar();
        List<String[]> d = cpc.BuscarProveedor(2);

        for (String[] fila : d) {
            for (String s : fila) {
                System.out.print(" " + s);
            }
            System.out.println();
        }

//        for(String d : cpc.CargarProveedores()){
//            System.out.println(d);
//        }
    }

}
