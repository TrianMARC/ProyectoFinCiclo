/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Political_party;
import Model.Voter;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Connectiondb {
     private static Connectiondb UnicaConexion=null; 
    private Connection con;
    private Connectiondb() throws ClassNotFoundException, SQLException{
                Class.forName("com.mysql.jdbc.Driver");
                String connectionUrl = "jdbc:mysql://db4free.net:3306/votabeans";
                con =  DriverManager.getConnection(connectionUrl,"tinytrian","tinytrian");
    }
    public synchronized static Connectiondb GetConexion() throws ClassNotFoundException, SQLException{

       if(UnicaConexion == null){
           UnicaConexion = new Connectiondb();
       }
       return UnicaConexion;
    }
    public Connection GetCon(){
           return con;
    }
    public void Destroy() throws SQLException{
           con.close();
    }
    
    public ArrayList <Political_party> GetPoliticalParty(){
        ArrayList <Political_party> partys= new ArrayList();
        
        Political_party auxparty;
        
        try {
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM political_party");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                auxparty=new Political_party(rs.getString("NAME"),rs.getInt("NVOTES"), rs.getString("LOGO"));
                partys.add(auxparty);
                
            }   
        } catch (SQLException ex) { 
        }
        
        return partys;
    }
    /**
     * Function that return a logged in user if the password matchs with the hash associated. 
     * @param v Voter who wants to log-in
     * @return boolean
     */
    public boolean logIn(Voter v){
        try {
            String hash;
            boolean ret = false;
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM voter WHERE NIF='"+v.getDNI()+"' ");
            while(rs.next()){
                hash = rs.getString("PASSWORD");
                if(BCrypt.checkpw(v.getPassword(), hash)) {
                    v.setAddress(rs.getString("ADDRESS"));
                    v.setEmail(rs.getString("EMAIL"));
                    v.setName(rs.getString("NAME"));
                    v.setSurname(rs.getString("SURNAME"));
                    v.setZipCode(rs.getString("ZIP CODE"));
                    ret = true;
                }  
            }
            return ret;
                
            
        } catch (SQLException ex) {
            return false;
        }
        
    }
    
    public boolean checkDNI(Voter v){
         boolean ret = false;

         try{            
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM voter WHERE NIF='"+v.getDNI()+"' ");
            while(rs.next()){
             ret = true;
            }
         } catch (SQLException ex) {
            ret = false;
        }
         return ret;
    }

    public boolean addVoter(Voter v) {
       try{            
            PreparedStatement stmt = con.prepareStatement("INSERT INTO voter VALUES(null,?,?,?,?,?,?,?,?)");
            stmt.setString(1, v.getDNI());
            stmt.setString(2, v.getEmail());
            stmt.setString(3, v.getName());
            stmt.setString(4, v.getSurname());
            stmt.setString(5, v.getAddress());
            stmt.setString(6, v.getZipCode());
            stmt.setString(7, v.getPassword());
            stmt.setBoolean(8, v.isVoted());
            int rs = stmt.executeUpdate();
            return true;
         } catch (SQLException ex) {
            return false;
        }
    }
    
}
