package bester;

public class Rectangle implements Bester {
    private double length;
    private double breadth;

    public Rectangle(double breadth, double length) {
        this.breadth = breadth;
        this.length = length;
    }

    public double area() {
        return length * breadth;
    }

    public boolean betterThan(Bester rectangle) {
        return area() > ((Rectangle) rectangle).area();
    }
}
