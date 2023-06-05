package Lab_9;

public class Rectangle extends Shape{
    private double length;
    private double width;
    
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }
    @Override
    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }
    @Override
    public String toString() {
        return super.toString() + "\nLength: " + this.length + "\nWidth: " + this.width;
    }
}
