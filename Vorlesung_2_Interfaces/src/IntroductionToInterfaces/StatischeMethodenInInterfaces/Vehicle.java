package IntroductionToInterfaces.StatischeMethodenInInterfaces;
//Interfaces können auch statische Methoden enthalten. Diese Methoden gehören
// direkt zum Interface und können ohne ein Objekt aufgerufen werden.
interface Vehicle {
    void startEngine();
    void stopEngine();

    static String getVehicleType(String vehicle) {
        switch (vehicle) {
            case "PKW":
                return "Personenkraftwagen";
            case "LKW", "Truck":
                return "Lastkraftwagen";
            case "Bike":
                return "Motorrad";
            case "Bus":
                return "Autobus";
            default:
                return "Fahrzeug";
        }
       // return "Fahrzeug";
    }
}
