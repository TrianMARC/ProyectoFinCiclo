/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Political_party;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    public ArrayList <Political_party> GetPoliticalParty(){
        ArrayList <Political_party> partys= new ArrayList();
        
        Political_party auxparty;
        
        try {
            
            PreparedStatement stmt = Con.prepareStatement("SELECT * FROM political_party");
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                auxparty=new Political_party(rs.getString("NAME"),rs.getInt("NVOTES"), rs.getString("LOGO"));
                partys.add(auxparty);
                
            }

            
        } catch (SQLException ex) {
            
        }
        
        return partys;
    }
    
    
}
