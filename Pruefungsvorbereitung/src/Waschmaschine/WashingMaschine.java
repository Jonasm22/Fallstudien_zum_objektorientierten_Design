package Waschmaschine;

import java.security.PublicKey;

public class WashingMaschine {

    private STATE currentState;
    private PROGRAMM currentProgramm;
    private TEMPERATURE currentTemperature;

    public WashingMaschine() {
        this.currentState = STATE.OFF;
        this.currentProgramm = null;
        this.currentTemperature = null;
    }

    public void PowerOn(){
        if(currentState == STATE.OFF){
            currentState = STATE.READY;
            System.out.println("Current Status: " + currentState);
        }

    }

    public void SelectProgram (PROGRAMM programm) {
        if(currentState == STATE.READY){
            currentProgramm = programm;
            System.out.println("Current Programm: " +  currentProgramm);

        }else{
            System.out.println("OFF");
        }


    }


    public void setTemperature(TEMPERATURE temperature){
        if(currentState == STATE.READY) {
            currentTemperature = temperature;
            System.out.println("Current Temperature: " + currentTemperature);

        }else{
            System.out.println("OFF");
        }
    }

    public void Start(){
        if(currentState == STATE.READY && currentTemperature != null) {
            System.out.println("Current State = " +  STATE.RUNNING);

            for (int i = 10; i > 0; --i) {
                System.out.println(i);
            }
            System.out.println(STATE.OFF);
        }



    }

    public static void main(String[] args) {
        WashingMaschine washingMaschine = new WashingMaschine();
        washingMaschine.PowerOn();
        washingMaschine.SelectProgram(PROGRAMM.QUICK_WASH);
        washingMaschine.setTemperature(TEMPERATURE.HOT);
        washingMaschine.Start();
    }
}
