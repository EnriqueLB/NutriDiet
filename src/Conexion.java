import java.sql.*;
public class Conexion {
     Connection conectar= null;
     public Connection conexion(){
         try{
             Class.forName("org.gjt.mm.mysql.Driver");  //es el tipo de conexion
             conectar=DriverManager.getConnection("jdbc:mysql://localhost/nutridiet","root","atom1");
         }catch (Exception e){
             System.out.print(e.getMessage());
         }
         return conectar;
     }   
}