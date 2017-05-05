package bester;

public class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double breadth, double length) {
        this.breadth = breadth;
        this.length = length;
    }

    public double area() {
        return length * breadth;
    }

    public boolean areaGreaterThan(Rectangle rectangle) {
        if (this.area() > rectangle.area()) return true;
        else return false;
    }
}
