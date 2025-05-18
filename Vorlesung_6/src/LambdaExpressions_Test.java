public class LambdaExpressions_Test {
    public void run(){

        Runnable runnable = ()->{
            System.out.println(this);
        };
        runnable.run();

    }

    @Override
    public String toString() {
        return "I am a test Object";
    }

    public static void main(String[] args) {
        LambdaExpressions_Test lambdaExpressions = new LambdaExpressions_Test();
        lambdaExpressions.run();
    }
}


