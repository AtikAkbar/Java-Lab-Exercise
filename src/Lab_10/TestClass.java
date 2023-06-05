package Lab_10;

public class TestClass {
    public static void main(String[] args) {
        Triangle[] triangles = new Triangle[2];
        triangles[0] = new Triangle("Blue", 5, 4, 3);
        triangles[1] = new Triangle("Green", 12, 13, 5);

        System.out.println( triangles[0].toString());
        System.out.println("Area: " + triangles[0].getArea() + "\nPerimeter: " + triangles[0].getPerimeter());
        System.out.println();
        System.out.println(triangles[1].toString());
        System.out.println("Area: " + triangles[1].getArea() + "\nPerimeter: " + triangles[1].getPerimeter());
    }
}
