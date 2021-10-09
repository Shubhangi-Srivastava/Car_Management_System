/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author shubhangisrivastava
 */
public class CarDetails {
    
    private String car_name;
    private String availability;
    private String brand;
    private String manufacture_year;
    private int min_max_seats;
    private long serial_number;
    private String model_num;
    private String city;
    private String maint_cert_expiration_dt;

    public String getMaint_cert_expiration_dt() {
        return maint_cert_expiration_dt;
    }

    public void setMaint_cert_expiration_dt(String maint_cert_expiration_dt) {
        this.maint_cert_expiration_dt = maint_cert_expiration_dt;
    }
    

    public String getManufacture_year() {
        return manufacture_year;
    }

    public void setManufacture_year(String manufacture_year) {
        this.manufacture_year = manufacture_year;
    }
    

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        
        if(!availability.contains("") && !availability.isBlank()) {
        this.availability = availability;
        } else {
            JOptionPane.showMessageDialog(null, "Please check atleast one checkbox for availability.");
        }
    } 

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        
        if(car_name.matches("[A-Za-z]+")) {
            this.car_name = car_name;
        } else {
            JOptionPane.showMessageDialog(null, "Please enter a valid car name.");
        }
    }       

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        
        if(brand.matches("[A-Za-z]+")) {
          this.brand = brand;  
        } else {
            JOptionPane.showMessageDialog(null, "Please enter a valid car name.");
        }    
    }

    

    public int getMin_max_seats() {
        return min_max_seats;
    }

    public void setMin_max_seats(int min_max_seats) { 
       // try {
         //   if(min_max_seats != ' ' && min_max_seats >0 && min_max_seats < 9) {               
        this.min_max_seats = min_max_seats;
       
       // JOptionPane.showMessageDialog(null, "gaya andar");
        //}
       // }catch (Exception e) {
        //    JOptionPane.showMessageDialog(null, "Please enter valid number of seats."
    }

    public long getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(long serial_number) {
        this.serial_number = serial_number;
    }

    public String getModel_num() {
        return model_num;
    }

    public void setModel_num(String model_num) {
        this.model_num = model_num;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

  
    
    
    @Override
    public String toString() {
        return car_name;
       
    }   

    public void setManufacture_year(int manufacture_year) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
