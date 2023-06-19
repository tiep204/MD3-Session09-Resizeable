package ra;

public class Cricle extends Shape implements Resizeable{
    private double radius = 1.0;

    public Cricle() {
    }

    public Cricle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius= " + radius + ", which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {

    }
}