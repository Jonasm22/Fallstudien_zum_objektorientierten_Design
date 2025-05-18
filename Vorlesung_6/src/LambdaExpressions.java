public class LambdaExpressions {

    private String greeting = "Hello from Germany";

    public  void printWithLambda() {
        Runnable r = () -> System.out.println("Greeting: " + greeting);

        r.run();
    }

    public static void main(String[] args) {

        LambdaExpressions lambdaExpressions = new LambdaExpressions();
        lambdaExpressions.printWithLambda();
    }
}

