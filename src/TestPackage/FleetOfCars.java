package TestPackage;

import java.util.ArrayList;

public class FleetOfCars {

    ArrayList<Car> fleet;
    public FleetOfCars(){
        fleet = new ArrayList<>();

    }

    //ArrayList<Car> fleet = new ArrayList<>();


    public void addCar(Car car){
        fleet.add(car);
    }

    public String getTotalFee(){
        int totalFee = 0;
        for(Car c: fleet){
            totalFee += c.getRegistrationFee();
        }
        return "Total fee: " + totalFee;
    }

    @Override
    public String toString(){

        return "Cars: " + fleet;
    }




}
