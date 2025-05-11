package Caesar_Cipher;

public class main {

    public static void main(String[] args) {
        Verschluesselung message = new CaeserCipher(3);
        message.chiffrieren("Hello World");
        message.dechiffrieren("Khoor Zruog");


    }
}
