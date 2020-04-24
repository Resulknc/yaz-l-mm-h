/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tersane1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class database {
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    
    
    static Connection connection=null;
    
    public static Connection baglan() throws SQLException{
    
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/yazılımmüh", "root", "5759");           
            return connection;
        }catch(ClassNotFoundException ex) {
            System.out.println("MySql connector yok");
            ex.printStackTrace();
            return null;
        }
        
    }
    
}