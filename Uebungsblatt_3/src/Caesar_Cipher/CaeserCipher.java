package Caesar_Cipher;

public class CaeserCipher extends Verschluesselung{

    //Attribute
    public static char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
           'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' , 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
            'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};


    //This attribute will move a number of steps to the right
    private int shiftAmount;

    //Constructor
    public CaeserCipher(int shiftAmount) {
        this.shiftAmount = shiftAmount;
    }

    @Override
    public String chiffrieren(String nachricht) {
        //Algorithmus
        String cypherText = "";
        for(char letter : nachricht.toCharArray()){
            int position = getIndexFromAlphabet(letter);
            if (position == -1) {
                cypherText +=letter;
                if (letter == ' '){
                    continue;
                }else{
                    System.out.println("Error: The word '" + letter + "' does not belong to the English alphabet.");

                }
            }else{
                int schiftedIndex = (position + shiftAmount) % alphabet.length;
                char shiftedLetter = alphabet[schiftedIndex];
                cypherText += shiftedLetter;
            }
        }
        System.out.println("Encode text: "  + cypherText);
        return cypherText;
    }

    @Override
    public String dechiffrieren(String nachricht) {
        //Algorithmus
        String cypherText = "";
        for(char letter : nachricht.toCharArray()){
            int position = getIndexFromAlphabet(letter);
            if (position == -1) {
                cypherText +=letter;
            }else{
                int schiftedIndex = (position - shiftAmount) % alphabet.length;

                if(schiftedIndex <0 ){
                    schiftedIndex+= alphabet.length;
                }
                char shiftedLetter = alphabet[schiftedIndex];
                cypherText += shiftedLetter;

            }
        }
        System.out.println("decode text: "  + cypherText);
        return cypherText;
    }

   // returns the index of a letter within the alphabet array
    public static int getIndexFromAlphabet(char letter){
        for(int index = 0;  index<alphabet.length; index++){
            if(alphabet[index] ==  letter){
                //System.out.println(i);
                return index;
            }
        }
        return -1;
    }
}
