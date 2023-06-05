package Lab_9;

public class TestClass {
    public static void main(String[] args) {
        Shape shape = new Shape("Blue");
        Rectangle rectangle = new Rectangle("White",4,6);
        Circle circle = new Circle("Yellow",5);
        
        System.out.println("Shape => \n" + shape.toString());
        System.out.println();

        System.out.println("Rectangle => \n" + rectangle.toString());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println();

        System.out.println("Circle => \n" + circle.toString());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
    }
}
