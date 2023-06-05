package Lab_9;

public class Shape {
    private  String color;

    public Shape(String color){
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public double getArea() {
        return 0.0;
    }
    public double getPerimeter() {
        return 0.0;
    }
    @Override
    public String toString() {
        return "Color: " + this.color;
    }
}
