package CaesarCipher;

public class  myMain{
    public static void main(String[] args) {
        IVerschluesselung message = new CaesarChiffre(3);
        message.chiffrieren("Hola Mundo");
        message.dechiffrieren( "Krod Pxqgr");

    }
}
