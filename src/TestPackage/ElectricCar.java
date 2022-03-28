package TestPackage;

public class ElectricCar extends ACar {

    private int batterCapacity;
    private int maxRange;

    public ElectricCar(int batterCapacity,int maxRange, String registrationNumber, String make, String model, int numberOfDoors){

        super(registrationNumber, make, model, numberOfDoors);
        this.batterCapacity = batterCapacity;
        this.maxRange = maxRange;
    }

    public int getBatteryCapacityKWh(){
        return this.batterCapacity;
    }

    public int getMaxRangeKm(){
        return this.maxRange;
    }

    public int getWhPrKm(){
        return getBatteryCapacityKWh() / getMaxRangeKm(); // km/l
    }



    @Override
    public int getRegistrationFee() {
        double kmL = (getWhPrKm() / 91.25);
        kmL = 100 / kmL;
        if(kmL >=  20 && kmL <= 50){
            return 330;
        } else if(kmL >= 15 && kmL < 20){
            return 1050;
        } else if(kmL >=  10 && kmL < 15){
            return 2340;
        } else if(kmL >= 5 && kmL < 10){
            return 5500;
        } else
            return  10470;
    }



    @Override
    public String toString() {
        return super.toString() + "\nRegistration fee: " + getRegistrationFee() + "\nWatt hours per kilometer: " + getWhPrKm() +"\n\n";
    }
}
