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
    private Date manufacture_year;
    private int min_max_seats;
    private long serial_number;
    private String model_num;
    private String city;
    private Date maint_cert_expiration_dt;

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        try{
        this.availability = availability;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please check valid checkbox");
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

    public Date getManufacture_year() {
        return manufacture_year;
    }

    public void setManufacture_year(Date manufacture_year) {
        this.manufacture_year = manufacture_year;
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

    public Date getMaint_cert_expiration_dt() {
        return maint_cert_expiration_dt;
    }

    public void setMaint_cert_expiration_dt(Date maint_cert_expiration_dt) {
        this.maint_cert_expiration_dt = maint_cert_expiration_dt;
    }
    
    
    @Override
    public String toString() {
        return car_name;
       
    }   

    public void setManufacture_year(int manufacture_year) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
