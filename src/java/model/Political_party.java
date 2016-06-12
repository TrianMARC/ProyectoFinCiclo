/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.beans.*;
import java.io.Serializable;

/**
 * Class Political_Party
 * 
 * Class to define the javabean object
 */
public class Political_party implements Serializable, PropertyChangeListener {

    
    private String Name;
    private int Nvotes;
    private String Logo;
    
    public Political_party() {
    }
    
    /**
     * Full Constructor
     * @param Name political_party name
     * @param Nvotes number of votes adquired
     * @param Logo logo image url
     */
    public Political_party(String Name, int Nvotes, String Logo){
        this.Name=Name;
        this.Nvotes=Nvotes;
        this.Logo=Logo;
        
    }
    
    /**
     * Method to update the number of votes when a voter call it
     * @param pce  caller event
     */
    @Override
    public void propertyChange(PropertyChangeEvent pce) {
       if((Boolean)pce.getNewValue()) setNvotes(getNvotes()+1);
        
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

    @Override
    public String toString() {
        return "Political_party{" + "Name=" + Name + ", Nvotes=" + Nvotes + ", Logo=" + Logo + '}';
    }
    
    
    
    
    
}
