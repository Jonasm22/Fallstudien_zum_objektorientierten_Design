package IntroductionToEnums;

public class myApp {
    public myApp() {
    }

    public static void main(String[] args) {
        for(Tag tg : Tag.values()) {
            System.out.println(tg);
        }

    }
}
