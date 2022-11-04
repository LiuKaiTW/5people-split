/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shoppingall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class dbconnection {
    public static Connection getDB()
    {
        Connection conn=null;
        String url="jdbc:mysql://localhost:3306/account";
        String user="root";
        String password="0000";      
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(url, user, password);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dbconnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(dbconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}
