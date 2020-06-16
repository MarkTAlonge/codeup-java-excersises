package Shapes;

public class Rectangle {
    protected int length;
    protected int width;
    public int perimeter;
    public int area;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;

    }
    public double getArea(){
        return length * width;

    }
    public double getPerimeter(){
        return (2 * length) + (2 * width);
    }
}
