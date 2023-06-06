package Lab_11;

public class Circle implements GeometricShape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * this.radius;
    }
    @Override
    public String toString() {
        return "Radius: " + this.radius;
    }
    
}
