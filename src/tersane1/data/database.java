/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tersane1.data;

import java.sql.Connection;
import java.sql.DriverManager;

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
    
    
    public static Connection connection;
    
    public static void baglan(){
    
        try{
            Class.forName("org.hsqldb.jdbcDriver");
            connection= DriverManager.getConnection("jdbc:hsqldb:file:C:\\Users\\HP\\Desktop\\TERSANE\\;hsqldb.lock_file=false;shutdown=true", "resul", "5759");           
            
        }catch(Exception ex) {
            ex.printStackTrace();
            return;
        }
        
    }
    
}