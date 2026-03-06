package Shapes.Level1;

public class Triangle implements Shape{

    double a;
    double b;
    double c;

    public Triangle(double sideLength){

        if(sideLength < 0){
            throw new IllegalArgumentException("A side of a Triangle cannot be negative.");
        }

        this.a = sideLength;
        this.b = sideLength;
        this.c= sideLength;
    }

    public Triangle(double a, double b, double c){

        if(a < 0 || b < 0 || c < 0){
            throw new IllegalArgumentException("A side of a Triangle cannot be negative.");
        }

        if(a + b <= c || a + c <= b || b + c <= a){
            throw new IllegalArgumentException("All Triangle sides must be valid.");
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea(){

        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

}
