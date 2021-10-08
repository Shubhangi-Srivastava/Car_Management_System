/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author shubhangisrivastava
 */
public class CarDetailsHistory {
    
    private ArrayList<CarDetails> history;
    
    public CarDetailsHistory(){
        
        history = new ArrayList<CarDetails>();
    }

    public ArrayList<CarDetails> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<CarDetails> history) {
        this.history = history;
    }
    
    public CarDetails addNewCar() {
        CarDetails newCar = new CarDetails();
        history.add(newCar);
        return newCar;
    }
    
    
    public void deleteCars(CarDetails cd) {
        
        history.remove(cd);
    }
}
