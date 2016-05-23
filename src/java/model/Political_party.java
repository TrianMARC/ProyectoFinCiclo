/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class Political_party implements Serializable, PropertyChangeListener {

    private String Name;
    private int Nvotes;
    private String Logo;
    
    public Political_party() {
    }

    public Political_party(String Name, int Nvotes, String Logo){
        this.Name=Name;
        this.Nvotes=Nvotes;
        this.Logo=Logo;
        
    }
    
    
    @Override
    public void propertyChange(PropertyChangeEvent pce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getNvotes() {
        return Nvotes;
    }

    public void setNvotes(int Nvotes) {
        this.Nvotes = Nvotes;
    }

    public String getLogo() {
        return Logo;
    }

    public void setLogo(String Logo) {
        this.Logo = Logo;
    }
    
    
    
    
    
}
