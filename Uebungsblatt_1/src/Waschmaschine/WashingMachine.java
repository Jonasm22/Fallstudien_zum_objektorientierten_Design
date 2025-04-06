
package Waschmaschine;

public class WashingMachine {
    //attribute
    private State currentState;
    //Attribute Hinzugefügt
    private Program selectedProgram;
    private Temperature selectedTemperaturWert;

    //Empty constructor
    public WashingMachine( ) {
        //Initialisierungswerte
        this.currentState = State.OFF;
        this.selectedProgram = null;
        this.selectedTemperaturWert = null;
    }

    //getter
    public State getCurrentState() {
        return this.currentState;
    }

    public void powerOn() {
       // System.out.println(getCurrentState());
        if (currentState == State.OFF) {
            currentState = State.READY;
        }

        System.out.println("Maschine Status: " + currentState);
    }


    public void selectProgram(Program program) {
            selectedProgram = program;
        if (currentState == State.READY) {
            switch (program) {
                case Program.DELICATE:
                    System.out.println("Program: " + Program.DELICATE);
                    break;
                case Program.NORMAL:
                    System.out.println("Program: " + Program.NORMAL);
                    break;
                case Program.QUICK_WASH:
                    System.out.println("Program: " + Program.QUICK_WASH);
                    break;
            }

        } else {
            System.out.println(currentState = State.OFF);
        }
    }

    public void setTemperature(Temperature temperature) {

        selectedTemperaturWert = temperature;
        if (currentState == State.READY) {
            switch (temperature) {

                case Temperature.COLD:
                    System.out.println("Temperature:" + Temperature.COLD +
                            ": " + Temperature.COLD.getTemperaturWert() + "°C");
                    break;
                case Temperature.HOT:
                    System.out.println("Temperature: " + Temperature.HOT +
                            ": " + Temperature.HOT.getTemperaturWert() + "°C");
                    break;

                case Temperature.WARM:
                    System.out.println("Temperature: " + Temperature.WARM +
                            ": " + Temperature.WARM.getTemperaturWert() + "°C");
                    break;

            }
        }
    }

    public void start() {
          /*Alternative
        if(currentState == State.READY && selectedProgram ==  Program.NORMAL
          && selectedTemperaturWert ==Temperature.WARM){
         ---- etc
             */
        if (currentState == State.READY && selectedProgram != null && selectedTemperaturWert != null) {
            System.out.println("Status: " + State.Running);

            //<Timer>
            for(int timer = 7; timer >= 1; --timer) {
                System.out.println("Timer: " +  timer);

                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    System.out.println("Washing interrupted");
                }
            }
            //</Timer>

            System.out.println("Washing completed!");
            System.out.println(currentState = State.OFF);
        } else {
            System.out.println("Error");


        }

    }

    public static void main(String[] args) {
        WashingMachine washingmaschine = new WashingMachine();
        washingmaschine.powerOn();
        washingmaschine.selectProgram(Program.NORMAL);
        washingmaschine.setTemperature(Temperature.WARM);
        washingmaschine.start();
    }
}
