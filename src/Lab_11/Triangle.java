package Lab_11;

public class Triangle implements GeometricShape{
    
    private double base;
    private double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }
    public double getHeight() {
        return height;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * this.base * this.height;
    }
    @Override
    public String toString() {
        return "Base: " + this.base + "\nHeight: " + this.height;
    }
    
}
