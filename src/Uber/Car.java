/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uber;

import java.util.Date;

/**
 *
 * @author Samruddhi
 */
public class Car {
    
    private String manufacturer;                                                //Manufacturer of Car
    private int year_manufactured;                                              //Year of Manufacture
    private boolean available;                                                  //Availability check
    private int serialNum;                                                      //Serial Number of Car
    private int modelNum;                                                       //Model Number of Car
    private String city;                                                        //Car available in city
    private int maxSeats;                                                       //Maximum Number of seats in a Car
    private int minSeats;                                                       //Minimum Number of seats in a Car
    private boolean maintenanceCretValid;                                       //Maintenance Cretificate valid or expired
    private Date creationDate;                                                  //Record Creation Date

    //Parameterized contructor
    public Car(String manufacturer, int year_manufactured, boolean available, int serialNum, int modelNum, String city, int maxSeats, int minSeats, boolean maintenanceCretValid) {
        this.manufacturer = manufacturer;
        this.year_manufactured = year_manufactured;
        this.available = available;
        this.serialNum = serialNum;
        this.modelNum = modelNum;
        this.city = city;
        this.maxSeats = maxSeats;
        this.minSeats = minSeats;
        this.maintenanceCretValid = maintenanceCretValid;
        this.creationDate = new Date();
    }

    public Car() {
        this.creationDate = new Date();
    }
    
    //Getters and Setters

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear_manufactured() {
        return year_manufactured;
    }

    public void setYear_manufactured(int year_manufactured) {
        this.year_manufactured = year_manufactured;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public int getModelNum() {
        return modelNum;
    }

    public void setModelNum(int modelNum) {
        this.modelNum = modelNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }

    public int getMinSeats() {
        return minSeats;
    }

    public void setMinSeats(int minSeats) {
        this.minSeats = minSeats;
    }

    public boolean isMaintenanceCretValid() {
        return maintenanceCretValid;
    }

    public void setMaintenanceCretValid(boolean maintenanceCretValid) {
        this.maintenanceCretValid = maintenanceCretValid;
    }

    

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return this.manufacturer;
    }
    
    
    
}
