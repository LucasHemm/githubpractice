package TestPackage;

abstract public class AFuelCar extends ACar{

    private int kmPrLitre;


    public AFuelCar(int kmPrLitre, String registrationNumber, String make, String model, int numberOfDoors){
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    abstract public String getFuelType();

    public int getKmPrLitre(){
        return kmPrLitre;
    }


    @Override
    public int getRegistrationFee() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "\nKilometer pr. litre: " + kmPrLitre;
    }
}
