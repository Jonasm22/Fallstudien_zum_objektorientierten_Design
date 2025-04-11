package CaesarCipher;

import java.util.Scanner;

public class Game implements IVerschluesselung{

    @Override
    public String chiffrieren(String nachricht) {
        return "";
    }

    @Override
    public String dechiffrieren(String nachricht) {
        return "";
    }

    static char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
            's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};


    public static  int getIndexFromAlphabet(char letter){
        for(int i = 0;  i<alphabet.length; i++){
            if(alphabet[i] ==  letter){
                //System.out.println(i);
                return i;
            }
        }
        return -1;
    }


    public String encode(String originalText, int shift_amount){

        String cypherText = "";

        for(char letter : originalText.toCharArray()){
            int position = getIndexFromAlphabet(letter);
            int schiftedIndex = (position + shift_amount) % alphabet.length;
            char shiftedLetter = alphabet[schiftedIndex];
            cypherText += shiftedLetter;
            if (position == -1) {
                 System.out.println("Error: letra '" + letter + "' no encontrada en el alfabeto.");
            }
        }
        System.out.println("encode text: "  + cypherText);

        return cypherText;
    }


   public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert the text to encode: ");
        String originalText= scanner.nextLine();

        System.out.print("Insert the text to amount to shift: ");
       int shiftAmount = Integer.parseInt(scanner.nextLine());

       Game juego = new Game();
       juego.encode(originalText, shiftAmount);

    }



}
