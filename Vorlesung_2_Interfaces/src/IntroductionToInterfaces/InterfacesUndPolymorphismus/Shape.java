package IntroductionToInterfaces.InterfacesUndPolymorphismus;

/*Ein Interface ermöglicht es, polymorphe Programme zu schreiben,
da mehrere Klassen ein gemeinsames Interface implementieren können*/

interface Shape {
    void draw();
    double getArea();

}
class Circle implements Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}


class Rectangle implements Shape{

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle Drew");
    }

    @Override
    public double getArea() {
        return length* width;
    }
}