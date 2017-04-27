
package jdbc.aplication;

import java.sql.*;
/**
 *
 * @author JESUS
 */
public class JDBCAplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //carga del controlador
        try { 
            
        
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("carga EXITOSA");
       String url = "jdbc:mysql://localhost/itse?user=root";
        
        Connection conn = DriverManager.getConnection(url);
        
        System.out.println("Carga realizada");
        Statement st = conn.createStatement();
        st.execute("insert into " + "tbl alumno (nombre, apellido, edad") +
        "values ('ArtAhjh>, Suarez', 25");
        conn.close();
        }catch (ClassNotFoundException ex){ 
               
System.out.println("error:controlador");

                        System .exit(1);
                        
        } catch (SQLException ex) {
            
            System.out.println("Error; conexion");
              ex.printStackTrace();                  
        
    }
    
    }
}