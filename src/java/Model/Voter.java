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
    private String Address;
    private String ZipCode;
    private String Password;
    private boolean Voted;
    private PropertyChangeSupport PropertySupport;

    public Voter(String DNI, String Email, String Name, String Surname, String Address, String ZipCode, String Password, boolean Voted) {
        this.DNI = DNI;
        this.Email = Email;
        this.Name = Name;
        this.Surname = Surname;
        this.Address = Address;
        this.ZipCode = ZipCode;
        this.Password = Password;
        this.Voted = Voted;
    }
    
    public Voter(String DNI, String password){
        this.DNI = DNI;
        this.Password = password;
    }
     public Voter(String DNI){
        this.DNI = DNI;
    }
    
    public Voter() {
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener){
        PropertySupport.addPropertyChangeListener(listener);
        
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener){
        PropertySupport.removePropertyChangeListener(listener);
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String ZipCode) {
        this.ZipCode = ZipCode;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public boolean isVoted() {
        return Voted;
    }

    public void setVoted(boolean Voted) {
        boolean oldvote= this.Voted;
        this.Voted = Voted;
        PropertySupport.firePropertyChange("Voted", oldvote, Voted);
        
    }

    public PropertyChangeSupport getPropertySupport() {
        return PropertySupport;
    }

    public void setPropertySupport(PropertyChangeSupport PropertySupport) {
        this.PropertySupport = PropertySupport;
    }
    
    
    
}
