package ra;

public  class Rectangle extends Shape implements Resizeable{
    private double width = 1.0, lenght = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle(String color, boolean filled, double width, double lenght) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getArea() {
        return lenght * width;
    }

    public double getPerimeter() {
        return 2 * (lenght + width);
    }

    @Override
    public String toString() {
        return "A Rectangle with width= "+getWidth()+" and length= "+getLenght()+", which is a subclass of "+super.toString();
    }

    @Override
    public void resize(double percent) {

    }
}