
package Consultas;
import Modelo.Mod_Usuario;
import main.Conexion_A;
import java.sql.CallableStatement;
import java.sql.Types;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author Aaron
 */
public class Consultas_Usuario extends Conexion_A{
    
    public boolean InicioSesion(Mod_Usuario us){
        
        boolean inicioS = false;
        
        CallableStatement cs;
        
        try{
            cs = getConnection().prepareCall("{call loguear_user(?, ?, ?)}");
            cs.setString(1, us.getUsuario());
            cs.setString(2, us.getContrasena());
            cs.registerOutParameter(3, Types.BOOLEAN);
            
            cs.execute();
            
            inicioS = cs.getBoolean(3);
            
        }catch(SQLException e){
            System.err.println(e);
        }finally{
            try{
                getConnection().close();
            }catch(SQLException ex){
                System.err.println(ex);
            }
        }
        
        return inicioS;
    }
    
    public void DatosEmpleado(Mod_Usuario us){
        
        CallableStatement cs;
        ResultSet rs;
        
        try{
            cs = getConnection().prepareCall("{call mostrar_empleado_inicio(?)}");
            cs.setString(1, us.getUsuario());
            rs = cs.executeQuery();
            
            while(rs.next()){
                us.setCodEmpleado(rs.getInt(1));
                us.setNombreEmpleado(rs.getString(2));
                us.setNivelAdm(rs.getString(3));
            }
            
        }catch(SQLException e){
            System.err.println(e);
        }finally{
            try{
                getConnection().close();
            }catch(SQLException ex){
                System.err.println(ex);
            }
        }
    }
}
