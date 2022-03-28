package TestPackage;

public class Main {

    public static void main(String[] args) {
        FleetOfCars fleet = new FleetOfCars();

        Car f1Ferrari = new GasolineCar(40, "AZ 656 65", "Ferrari", "Formula 1 car", 0);
        Car w13 = new GasolineCar(19, "1234 89", "Mercedes", "Formula 1 car", 1);
        Car tesla = new ElectricCar(100000, 648,"82139 128","Tesla","Sports car",4);
        Car dieselBandit = new DieselCar(50,true,"bt 7277 89", "Ford","Stationcar",5);

        //System.out.println(f1Ferrari.getRegistrationFee());
        //System.out.println(f1Ferrari);
        fleet.addCar(f1Ferrari);
        fleet.addCar(w13);
        fleet.addCar(tesla);
        fleet.addCar(dieselBandit);
        //System.out.println(fleet.getTotalFee());
        //System.out.println(w13);
        System.out.println(fleet);
        System.out.println(fleet.getTotalFee());
        //System.out.println(tesla.getModel());
    }
}
