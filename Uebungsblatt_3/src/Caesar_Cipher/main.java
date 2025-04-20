package Caesar_Cipher;

public class main {

    public static void main(String[] args) {
        Verschluesselung message = new CaeserCipher(3);
        message.chiffrieren("Hallo Welt");
        //message.dechiffrieren("Kdoor Zhow");



    }
}
