/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HOMESTAY;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Subbu
 */
public class ConnectionDB {
    static Connection conn=null;
    
    
    public static Connection myconnection()
    {
        
     
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/homestay","root","subramanya");
        }
           catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    return conn;

}
}
