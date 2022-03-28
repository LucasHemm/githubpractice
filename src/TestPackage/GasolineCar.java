package TestPackage;

public class GasolineCar extends AFuelCar {

    public GasolineCar(int kmPrLitre,String registrationNumber, String make, String model, int numberOfDoors){
        super(kmPrLitre, registrationNumber, make, model, numberOfDoors);
    }

    @Override
    public String getFuelType() {
        return "Gasoline";
    }

    @Override
    public int getRegistrationFee() {
        /*Hvis den kører mellem 20 km/log 50 km/l er prisen 330 kr,
 mellem 15 km/l og 20 km/l er prisen 1050 kr,
  mellem 10 km/log 15 km/l er prisen 2340 kr,
mellem 5 km/l og 10 km/l er prisen 5500kr, og under 5 km/l
er prisen 10470 kr
         */
        int kmPrLitre = getKmPrLitre();
        int cost = 0;
        if(kmPrLitre >=  20 && kmPrLitre <= 50){
            cost = 330;
        } else if(kmPrLitre >= 15 && kmPrLitre < 20){
            cost =  1050;
        } else if(kmPrLitre >=  10 && kmPrLitre < 15){
            cost = 2340;
        } else if(kmPrLitre >= 5 && kmPrLitre < 10){
            cost = 5500;
        } else if(kmPrLitre < 5){
            cost = 10470;
        }
        return cost;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRegistration fee: " + getRegistrationFee() +"\n\n";
    }

}
