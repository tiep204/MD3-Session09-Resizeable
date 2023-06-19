import ra.Cricle;
import ra.Rectangle;
import ra.Shape;
import ra.Square;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Cricle cricle = new Cricle();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.toString());
        System.out.println(cricle.toString());
        System.out.println(square.toString());
    }
}