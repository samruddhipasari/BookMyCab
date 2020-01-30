/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uber;

import java.util.ArrayList;

/**
 *
 * @author Samruddhi
 */
public class Search {
    
    private String city;
    private boolean firstAvail;
    private boolean avail;
    private boolean unavail;
    private boolean validManCert;
    private boolean expManCert;
    private int year;
    private int serial;
    private int model;
    private int minSeats;
    private int maxSeats;
    private int availCount;
    private int unavailCount;

    private ArrayList<String> manufactList;

    public ArrayList<String> getManufactList() {
        return manufactList;
    }

    public void setManufactList(ArrayList<String> manufactList) {
        this.manufactList = manufactList;
    }

    public boolean isFirstAvail() {
        return firstAvail;
    }

    public void setFirstAvail(boolean firstAvail) {
        this.firstAvail = firstAvail;
    }

    public int getAvailCount() {
        return availCount;
    }

    public void setAvailCount(int availCount) {
        this.availCount = availCount;
    }

    public int getUnavailCount() {
        return unavailCount;
    }

    public void setUnavailCount(int unavailCount) {
        this.unavailCount = unavailCount;
    }
    
    private ArrayList<Car> searchCarList;
    private ArrayList<Car> tempList;

    public ArrayList<Car> getTempList() {
        return tempList;
    }

    public void setTempList(ArrayList<Car> tempList) {
        this.tempList = new ArrayList<>(tempList);
    }
    
    public Search() {
        this.searchCarList = new ArrayList<>();
        this.manufactList = new ArrayList<>();
        this.tempList = new ArrayList();
        this.firstAvail = false;
        this.avail = false;
        this.unavail = false;
        this.city = "";
        this.availCount = 0;
        this.validManCert = false;
        this.expManCert = false;
        this.minSeats = 0;
        this.maxSeats = 0;
        this.serial = 0;
        this.model = 0;
        this.year = 0;
    }

    public ArrayList<Car> getSearchCarList() {
        return searchCarList;
    }

    public void setSearchCarList(ArrayList<Car> searchCarList) {
        this.searchCarList = searchCarList;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isAvail() {
        return avail;
    }

    public void setAvail(boolean avail) {
        this.avail = avail;
    }

    public boolean isUnavail() {
        return unavail;
    }

    public void setUnavail(boolean unavail) {
        this.unavail = unavail;
    }

    public boolean isValidManCert() {
        return validManCert;
    }

    public void setValidManCert(boolean validManCert) {
        this.validManCert = validManCert;
    }

    public boolean isExpManCert() {
        return expManCert;
    }

    public void setExpManCert(boolean expManCert) {
        this.expManCert = expManCert;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getMinSeats() {
        return minSeats;
    }

    public void setMinSeats(int minSeats) {
        this.minSeats = minSeats;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }
    
    public ArrayList<Car> searchCarInfo(Search searchCar, CarInfo carInfo){
        
        setTempList(carInfo.getCarInfo());
        
        if(!getCity().equals("")){
            searchCarList.clear();
            for(Car car : getTempList()){
                if(car.getCity().equalsIgnoreCase(searchCar.getCity())){
                   searchCarList.add(car);
                }
            }
            setTempList(getSearchCarList());
        }

        if(!(getManufactList().isEmpty())){
            searchCarList.clear();
            for(String manu: getManufactList()){
                for(Car car : getTempList()){
                    if(car.getManufacturer().equalsIgnoreCase(manu)){
                        searchCarList.add(car);
                    }
                }
            }
            setTempList(getSearchCarList());
        }

        if(isValidManCert() && !(isExpManCert())){
            searchCarList.clear();
            for(Car car: getTempList()){
                if(car.isMaintenanceCretValid()){
                    searchCarList.add(car);
                }
            }
            setTempList(getSearchCarList());
        }
        else if(isExpManCert() && !(isValidManCert())){
            searchCarList.clear();
            for(Car car: getTempList()){
                if(!(car.isMaintenanceCretValid())){
                    searchCarList.add(car);
                }
            }
            setTempList(getSearchCarList());
        }
        if(getYear()!= 0){
            searchCarList.clear();
            for(Car car: getTempList()){
                if(car.getYear_manufactured() == getYear()){
                    searchCarList.add(car);
                }
            }
            setTempList(getSearchCarList());
        }
        if(getMinSeats()!= 0){
            searchCarList.clear();
            for(Car car: getTempList()){
                if(car.getMinSeats() >= getMinSeats()){
                    searchCarList.add(car);
                }
            }
            setTempList(getSearchCarList());
        }
        if(getMaxSeats()!= 0){
            searchCarList.clear();
            for(Car car: getTempList()){
                if(car.getMaxSeats() <= getMaxSeats()){
                    searchCarList.add(car);
                }
            }
            setTempList(getSearchCarList());
        }
        if(getSerial()!= 0){
            searchCarList.clear();
            for(Car car: getTempList()){
                if(car.getSerialNum()== getSerial()){
                    searchCarList.add(car);
                }
            }
            setTempList(getSearchCarList());
        }
        if(getModel()!= 0){
            searchCarList.clear();
            for(Car car: getTempList()){
                if(car.getModelNum()== getModel()){
                    searchCarList.add(car);
                }
            }
            setTempList(getSearchCarList());
        }
                
        if((isAvail() || isFirstAvail()) && !(isUnavail())){
            searchCarList.clear();
            for(Car car: getTempList()){
                if(car.isAvailable()){
                    searchCarList.add(car);
                    if(isFirstAvail())
                        break;
                }
            }
            setAvailCount(searchCarList.size());
        }
        else if(isUnavail() && (!(isAvail() || isFirstAvail()))){
            searchCarList.clear();
            for(Car car: getTempList()){
                if(!(car.isAvailable())){
                    searchCarList.add(car);
                }
            }
            setUnavailCount(searchCarList.size());
        }
        else if((isAvail() || isFirstAvail())&& isUnavail() ){
            int i =0;
            for(Car car: getTempList()){
                if((car.isAvailable()))
                i++;
            }
            
            setAvailCount(i);
            setUnavailCount(getTempList().size() - i);
        }
        return getSearchCarList();
    }
    
}
