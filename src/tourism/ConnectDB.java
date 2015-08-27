/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tourism;

/**
 *
 * @author Tauwab Uz Zahir
 */
import java.sql.*;
import javax.swing.*;
public class ConnectDB {
    Connection conn = null;
    public static Connection connectDb(){
        try{
       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
       Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;database=Tourism;integratedSecurity=true;");
      //JOptionPane.showMessageDialog(null, "connected");
       return conn;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
