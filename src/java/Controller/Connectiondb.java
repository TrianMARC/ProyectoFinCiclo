/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.*;

/**
 *
 * @author Usuario
 */
public class Connectiondb {
     private static Connectiondb UnicaConexion=null; 
    private Connection Con;
    private Connectiondb() throws ClassNotFoundException, SQLException{
                Class.forName("com.mysql.jdbc.Driver");
                String connectionUrl = "jdbc:mysql://db4free.net:3306/votabeans";
                Con =  DriverManager.getConnection(connectionUrl,"tinytrian","tinytrian");
    }
    public synchronized static Connectiondb GetConexion() throws ClassNotFoundException, SQLException{

       if(UnicaConexion == null){
           UnicaConexion = new Connectiondb();
       }
       return UnicaConexion;
    }
    public Connection GetCon(){
           return Con;
    }
    public void Destroy() throws SQLException{
           Con.close();
    }
}
