package CaesarCipher;

public class  myMain{
    public static void main(String[] args) {
        IVerschluesselung message = new CaesarChiffre(3);
        message.chiffrieren("Hello World");
        //message.dechiffrieren( "Khoor Zruog");

    }
}


