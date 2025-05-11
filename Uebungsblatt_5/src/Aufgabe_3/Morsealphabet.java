package Aufgabe_3;

import java.util.HashMap;

public class Morsealphabet implements IVerschluesselung{
    HashMap<String, String> morsealphabet = new HashMap<>();

    public void Morsealphabet(){
        morsealphabet.put("A", ".-");
        morsealphabet.put("B", "-...");
        morsealphabet.put("C", "-.-.");
        morsealphabet.put("D", "-..");
        morsealphabet.put("E", ".");
        morsealphabet.put("F", "..-.");
        morsealphabet.put("G", "--.");
        morsealphabet.put("H", "....");
        morsealphabet.put("I", "..");
        morsealphabet.put("J", ".---");
        morsealphabet.put("K", "-.-");
        morsealphabet.put("L", ".-..");
        morsealphabet.put("M", "--");
        morsealphabet.put("N", "-.");
        morsealphabet.put("O", "---");
        morsealphabet.put("P", ".--.");
        morsealphabet.put("Q", "--.-");
        morsealphabet.put("R", ".-.");
        morsealphabet.put("S", "...");
        morsealphabet.put("T", "-");
        morsealphabet.put("U", "..-");
        morsealphabet.put("V", "...-");
        morsealphabet.put("W", ".--");
        morsealphabet.put("X", "-..-");
        morsealphabet.put("Y", "-.--");
        morsealphabet.put("Z", "--..");
        morsealphabet.put("0", "-----");
        morsealphabet.put("1", ".----");
        morsealphabet.put("2", "..---");
        morsealphabet.put("3", "...--");
        morsealphabet.put("4", "....-");
        morsealphabet.put("5", ".....");
        morsealphabet.put("6", "-....");
        morsealphabet.put("7", "--...");
        morsealphabet.put("8", "---..");
        morsealphabet.put("9", "----.");

    }


    @Override
    public String chiffrieren(String nachricht) {
        return "";
    }

    @Override
    public String dechiffrieren(String nachricht) {
        return "";
    }






}
