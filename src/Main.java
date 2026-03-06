import Shapes.Level1.*;

public class Main {
    public static void main(String[] args){

        Rectangle rectangle = new Rectangle(4, 5);
        Circle circle = new Circle(4);
        Triangle triangle = new Triangle(4);

        System.out.println(rectangle.getArea());
        System.out.println(circle.getArea());
        System.out.println(triangle.getArea());

    }
}
