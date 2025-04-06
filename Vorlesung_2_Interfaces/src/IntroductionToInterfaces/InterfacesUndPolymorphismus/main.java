package IntroductionToInterfaces.InterfacesUndPolymorphismus;

public class main {
    public static void main(String[] args) {

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(10,52);

        System.out.println("Circle: " + circle.getArea());
        System.out.println("Rectangle: " + rectangle.getArea());

    }
}
