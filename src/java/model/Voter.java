/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.beans.*;
import java.io.Serializable;

/**
 *Class Voter
 * Class to define the bean object
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

    /**
     * Main Constructor
     * The propertychangesupport is initialited 
     * @param DNI String ID number
     * @param Email 
     * @param Name
     * @param Surname
     * @param Address
     * @param ZipCode
     * @param Password
     * @param Voted 
     */
    public Voter(String DNI, String Email, String Name, String Surname, String Address, String ZipCode, String Password, boolean Voted) {
        this.DNI = DNI;
        this.Email = Email;
        this.Name = Name;
        this.Surname = Surname;
        this.Address = Address;
        this.ZipCode = ZipCode;
        this.Password = Password;
        PropertySupport = new PropertyChangeSupport(this);
    }
    
    public Voter(String DNI, String Email, String Name, String Surname, String Address, String ZipCode, boolean Voted) {
        this.DNI = DNI;
        this.Email = Email;
        this.Name = Name;
        this.Surname = Surname;
        this.Address = Address;
        this.ZipCode = ZipCode;
        this.Voted = Voted;
        PropertySupport = new PropertyChangeSupport(this);
    }
    
    public Voter(String DNI, String password){
        this.DNI = DNI;
        this.Password = password;
        PropertySupport = new PropertyChangeSupport(this);
    }
     public Voter(String DNI){
        this.DNI = DNI;
        PropertySupport = new PropertyChangeSupport(this);
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
    
    /**
     * Method that launch the firePropertyChange method to call the listener
     * @param Voted boolean, indicates if the user has voted or not.
     */
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

    @Override
    public String toString() {
        return "Voter{" + "DNI=" + DNI + ", Email=" + Email + ", Name=" + Name + ", Surname=" + Surname + ", Address=" + Address + ", ZipCode=" + ZipCode + ", Password=" + Password + ", Voted=" + Voted + ", PropertySupport=" + PropertySupport + '}';
    }
    
    
    
}