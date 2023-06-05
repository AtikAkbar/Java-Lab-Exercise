package Lab_10;

abstract class GeometricShape {
    private String color;

    public GeometricShape(String color) {
        this.color = color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "color: " + this.color;
    }
}
