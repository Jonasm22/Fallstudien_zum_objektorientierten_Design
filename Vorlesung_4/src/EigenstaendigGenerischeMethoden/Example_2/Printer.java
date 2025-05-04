package EigenstaendigGenerischeMethoden.Example_2;

/*
* Eigenständig generische Methoden sind Methoden, die selbst generisch sind,
* auch wenn die Klasse, in der sie stehen, nicht generisch ist.
* Der Typ-Parameter (<T>) steht direkt vor dem Rückgabewert.
* */

public class Printer {
    //Versandetiketten drucken (Print Array)
    public <T> void printArray(T[] array){
        for (T item: array ){
            System.out.println("Etikett: " + item);
        }
    }


    public <T> void printAges(T[] array){
        for (T ages: array ){
            System.out.println("ages: " + ages);
        }
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        Printer ages =  new Printer();
        String[] namen = {"Maria" , "Hand" , "Sven"};
        printer.printArray(namen);

        Integer[] age = { 2 , 4,5};
        ages.printAges(age);



    }
}
