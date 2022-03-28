package TestPackage;

public class DieselCar extends AFuelCar {

    boolean particleFilter;


    public DieselCar(int kmPrLitre, boolean particleFilter, String registrationNumber, String make, String model, int numberOfDoors){
        super(kmPrLitre, registrationNumber, make, model, numberOfDoors);
        this.particleFilter = particleFilter;
    }

    public boolean hasParticleFilter() {
        return particleFilter;
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    @Override
    public int getRegistrationFee() {
        /*
        For en Dieselbil er der samme afgift som for benzinbilen, plus en udligningsafgift, som også
er afhængig af km/l. Hvis bilen kører mellem 20 km/l og 50 km/l er udligningsafgiften 130
kr, kører den mellem 15 km/l og 20 km/l er den 1390 kr, kører den mellem 10 km/l og 15
km/l er den 1850 kr, kører den mellem 5 km/l og 10 km/l er den 2770 kr, og kører den
under 5 km/l er den 15260 kr. Der er desuden en partikeludledningsafgift på 1000 kr hvis
bilen ikke har et partikelfilter monteret
         */
        int cost = 0;
        boolean filter = hasParticleFilter();
        int kmPrLitre = getKmPrLitre();
        if (kmPrLitre >= 20 && kmPrLitre <= 50) {
            cost =  330 + 130;
        } else if (kmPrLitre >= 15 && kmPrLitre < 20) {
            cost = 1050 + 1390;
        } else if (kmPrLitre >= 10 && kmPrLitre < 15) {
            cost = 2340 + 1850;
        } else if (kmPrLitre >= 5 && kmPrLitre < 10) {
            cost = 5500 + 2770;
        } else
            cost = 10470 + 15260;

        if(!filter) {
            cost -= 1000;
        }
        return cost;

}
    @Override
    public String toString() {
        return super.toString() + "\nRegistration fee: " + getRegistrationFee() + "\nHas particle filter: " + hasParticleFilter()+ "\n\n";
    }

}
