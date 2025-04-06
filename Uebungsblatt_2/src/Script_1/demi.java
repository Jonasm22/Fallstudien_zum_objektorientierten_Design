package Script_1;

public class demi {

    public static void imprimirAbecedario() {
        for (char letra = 'A'; letra <= 'Z'; letra++) {
            System.out.print(letra + " ");
        }
        System.out.println(); // Salto de línea al final

        for (char letrap = 'a'; letrap <= 'z'; letrap++) {
            System.out.print(letrap + " ");
        }
        System.out.println(); // Salto de línea al final
    }

    public static void main(String[] args) {
        imprimirAbecedario(); // Solo llamamos al método
    }

    
}
