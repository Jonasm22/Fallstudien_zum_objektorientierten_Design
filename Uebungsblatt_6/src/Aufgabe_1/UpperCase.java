package Aufgabe_1;

@FunctionalInterface
interface UpperCase {

    String uppercase (String text);

    public static void main(String[] args) {

        UpperCase apply = text -> text.toUpperCase();

        String greeting = "hello world";

        System.out.println(apply.uppercase(greeting));
    }

}
