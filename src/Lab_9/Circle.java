package Lab_9;

public class Circle extends Shape {
    private double radious;

    public Circle(String color, double radious) {
        super(color);
        this.radious = radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }
    public double getRadious() {
        return radious;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radious * this.radious;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radious;
    }
    @Override
    public String toString() {
        return super.toString() + "\nRadious: " + this.radious;
    }
}
