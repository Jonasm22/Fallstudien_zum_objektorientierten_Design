package IntroductionToInterfaces.EinEinfachesInterface;

public interface Vehicle {
        void startEngine();
        void stopEngine();
    }

    class Car implements Vehicle{

        @Override
        public void startEngine() {
            System.out.println("Car is running");
        }

        @Override
        public void stopEngine() {
            System.out.println("car stop");
        }

    }

