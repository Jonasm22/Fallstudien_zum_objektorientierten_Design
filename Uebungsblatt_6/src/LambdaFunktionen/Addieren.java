package LambdaFunktionen;

@FunctionalInterface
interface Addieren {

    int add (int a, int b);

    public static void main(String[] args) {
        Addieren value = (a, b) -> a+b;

        int result = value.add(5, 6);
        System.out.println("result: " + result);
    }


}
