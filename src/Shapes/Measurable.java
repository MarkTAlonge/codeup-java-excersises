package Shapes;

public class Measurable {
    public double getPerimeter() {
        int length = 4;
        int width = 5;
        return (2 * length) + (2 * width);
    }

    public double getArea() {
        int length = 2;
        int width = 3;
        return length * width;
    }
}
