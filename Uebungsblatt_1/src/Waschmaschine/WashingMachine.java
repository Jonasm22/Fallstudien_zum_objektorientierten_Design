
package Waschmaschine;

import java.io.PrintStream;

public class WashingMachine {
    private State currentState;
    private Program selectedProgram;
    private Temperature selectedTemperaturWert;

    public WashingMachine() {
        this.currentState = State.OFF;
        this.selectedProgram = null;
        this.selectedTemperaturWert = null;
    }

    public State getCurrentState() {
        return this.currentState;
    }

    public void powerOn() {
        System.out.println(this.getCurrentState());
        if (this.currentState == State.OFF) {
            this.currentState = State.READY;
        }

        System.out.println("Maschine Status: " + String.valueOf(this.currentState));
    }

    public void selectProgram(Program program) {
        if (this.currentState == State.READY) {
            this.selectedProgram = program;
            switch (program) {
                case DELICATE -> System.out.println("Program: " + String.valueOf(Program.DELICATE));
                case NORMAL -> System.out.println("Program: " + String.valueOf(Program.NORMAL));
                case QUICK_WASH -> System.out.println("Program: " + String.valueOf(Program.QUICK_WASH));
            }
        } else {
            System.out.println(this.currentState = State.OFF);
        }

    }

    public void setTemperature(Temperature temperature) {
        if (this.currentState == State.READY) {
            this.selectedTemperaturWert = temperature;
            switch (temperature) {
                case COLD:
                    PrintStream var3 = System.out;
                    String var5 = String.valueOf(Temperature.COLD);
                    var3.println("Temperature:" + var5 + ": " + Temperature.COLD.getTemperaturWert() + "°C");
                    break;
                case HOT:
                    PrintStream var2 = System.out;
                    String var4 = String.valueOf(Temperature.HOT);
                    var2.println("Temperature: " + var4 + ": " + Temperature.HOT.getTemperaturWert() + "°C");
                    break;
                case WARM:
                    PrintStream var10000 = System.out;
                    String var10001 = String.valueOf(Temperature.WARM);
                    var10000.println("Temperature: " + var10001 + ": " + Temperature.WARM.getTemperaturWert() + "°C");
            }
        }

    }

    public void Start() {
        if (this.currentState == State.READY && this.selectedProgram != null && this.selectedTemperaturWert != null) {
            System.out.println("Wasching");

            for(int count = 7; count >= 1; --count) {
                System.out.println(count);

                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException var3) {
                    System.out.println("Washing interrupted");
                }
            }

            System.out.println("Washing completed!");
            System.out.println(this.currentState = State.OFF);
        } else {
            System.out.println("Error");
        }

    }

    public static void main(String[] args) {
        WashingMachine washingmaschine = new WashingMachine();
        washingmaschine.powerOn();
        washingmaschine.selectProgram(Program.NORMAL);
        washingmaschine.setTemperature(Temperature.WARM);
        washingmaschine.Start();
    }
}
