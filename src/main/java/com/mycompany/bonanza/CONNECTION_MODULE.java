package com.mycompany.bonanza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CONNECTION_MODULE {
    
    Connection con;  
    
    public CONNECTION_MODULE(){ 
    
    
     try {
         try {
             Class.forName("com.mysql.jdbc.Driver");
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(CONNECTION_MODULE.class.getName()).log(Level.SEVERE, null, ex);
         }
         con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/dbbonanza","root","");
     } catch (SQLException ex) {
         Logger.getLogger(CONNECTION_MODULE.class.getName()).log(Level.SEVERE, null, ex);
     }
           
    
}/// Constructor
}
