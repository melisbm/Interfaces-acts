package Level1.Shapes;
import Level1.Resizable.Resizable;

public class Rectangle implements Shape, Resizable {
    double width;
    double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea(){
        return width * height;
    }

    @Override
    public void resizeWidth(int newWidth){
        width = newWidth;
    }

    @Override
    public void resizeHeight(int newHeight){
        height = newHeight;
    }
}
