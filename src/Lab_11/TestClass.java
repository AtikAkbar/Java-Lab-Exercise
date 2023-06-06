package Lab_11;

// import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        Triangle triangle = new Triangle(6, 10);

        System.out.println(triangle.toString());
        System.out.println("Arae: " + triangle.getArea());

        Circle circle = new Circle(5);
        
        System.out.println(circle.toString());
        System.out.println("Area: " + circle.getArea());
    }
}

