import java.sql.*;
import static javax.swing.JOptionPane.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Enriquee
 */
public class Conexion {
    Connection cn;
    public Connection Conexionn(){
        try {
            Class.forName("com.myqsl.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/nutriex","root","atom1");
            showMessageDialog(null,"Conexion Exitosa");
        } catch (Exception e) {
        }return cn;
    }

    Statement createStatement(){
        throw new UnsupportedOperationException("No soportado");
    }
}
