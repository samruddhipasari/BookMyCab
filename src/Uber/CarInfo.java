/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uber;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Samruddhi
 */
public class CarInfo {
    
    private ArrayList<Car> carList;                                             //ArrayList to store infomation of Cars
    private LocalDateTime lastUpdate;

    public CarInfo() {
        carList = new ArrayList<>();
        
        Car car1 = new Car("Toyota", 2019, true, 1234, 5678, "Boston", 6, 2, true);
        Car car2 = new Car("GM", 2017, true, 1235, 5679, "Boston", 5, 2, true);
        Car car3 = new Car("Toyota", 2018, true, 1236, 5680, "New York", 2, 2, true);
        Car car4 = new Car("Bugatti", 2019, false, 1237, 5681, "California", 6, 4, true);
        Car car5 = new Car("GM", 2010, false, 1238, 5682, "Seattle", 2, 2, false);
        Car car6 = new Car("Mercedes", 2017, true, 1239, 5683, "New York", 2, 1, false);
        Car car7 = new Car("Ferrari", 2013, true, 12350, 5684, "Seattle", 6, 5, true);
        Car car8 = new Car("Bugatti", 2015, true, 1251, 5685, "California", 6, 3, true);
        Car car9 = new Car("Toyota", 2019, true, 1252, 5686, "Boston", 4, 2, true);
        Car car10 = new Car("Ferrari", 2018, false, 1253, 5687, "Seattle", 2, 2, false);
        
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);
        setLastUpdate();
    }    
    
    //Getter and Setter
    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate() {    
        this.lastUpdate = LocalDateTime.now();
    }

    public ArrayList<Car> getCarInfo() {
        return carList;
    }

    public void setCarInfo(ArrayList<Car> carInfo) {
        this.carList = carInfo;
    }
    
    public Car addCar(){
        Car car = new Car();
        carList.add(car);
        return car;
    }
    
    public void deleteCar(Car car){
    carList.remove(car);
    }
}
