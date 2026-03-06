import Shapes.Level1.*;

public class Main {
    public static void main(String[] args){

        Shape rectangle = new Rectangle(4, 5);
        Shape circle = new Circle(4);
        Shape triangle = new Triangle(4);

        System.out.println(rectangle.getArea());
        System.out.println(circle.getArea());
        System.out.println(triangle.getArea());

    }
}
