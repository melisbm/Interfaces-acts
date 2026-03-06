package Shapes.Level1;
import java.lang.Math;

public class Circle implements Shape{
    double PI = Math.PI;
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return PI * radius * radius;
    }
}
