package Shapes;

public class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return 4 * width;
    }

    @Override
    public double getArea() {
        return Math.pow(width, 2);
    }
}

