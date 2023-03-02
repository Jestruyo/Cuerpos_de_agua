
package Basededatos;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Clase para administrar las conexiones de la base de datos
 * @author Familia
 */
public class ContextoBD {
    private Connection conexion;
    private String cadenaConexion;
    private String mensajeError;
    
    public ContextoBD(){
        try{
            //Inicializamos la ruta de conexion
            this.cadenaConexion="jdbc:sqlite:"
                    + "C:\\Users\\Familia\\OneDrive\\Documentos\\NetBeansProjects\\reto5\\data\\ObjetoG.db";
            //Luego con Driver Manager establesemos la conexion a la Bd. Y nos debuelve en objeto de tipo conexion.
            this.conexion=DriverManager.getConnection(this.cadenaConexion);
        }catch(SQLException ex){
            this.conexion=null;
            this.mensajeError=ex.getMessage();
        }   
    }
    
    public String getMensajeError(){
        return this.mensajeError;
    }
    
    //Ahora construimos los metodos para CRUD de la base de datos.
    
    
    //Metodo para ejecutar SELECT en la base de datos
    public ResultSet ejecutarSelect (String sql){
        try{
           Statement stmt = this.conexion.createStatement();
           return stmt.executeQuery(sql);
        }catch(SQLException ex){
            this.mensajeError=ex.getMessage();
            return null;
        }
    }
    
    
    
    //Metodo para ejecutar UPDATE en la base de datos
    public int ejecutarUpdate(String sql){
        try{
            Statement stmt = this.conexion.createStatement();
            return stmt.executeUpdate(sql);   
        }catch(SQLException ex){
            this.mensajeError=ex.getMessage();
            return -1;
        }
    }
}
