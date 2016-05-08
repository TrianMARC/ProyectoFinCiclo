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
public class Voter implements Serializable{

    private String DNI;
    private String Email;
    private String Name;
    private String Surname;
    private String Adress;
    private String ZipCode;
    private String Password;
    private boolean Voted;
    private PropertyChangeSupport PropertySupport;
    
    
    public Voter() {
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener){
        PropertySupport.addPropertyChangeListener(listener);
        
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener){
        PropertySupport.removePropertyChangeListener(listener);
    }
    
    
}
