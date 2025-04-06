package IntroductionToInterfaces.StatischeMethodenInInterfaces;

    class Main {
        public static void main(String[] args) {
            String vehicleType = Vehicle.getVehicleType("PKW");
            System.out.println("Fahrzeugtyp: " + vehicleType);
        }
    }

