package Shapes;

public abstract class Quadrilateral extends Shape {
        protected int length;
        protected int width;

        public int getLength() {
            return length;
        }

        public abstract void setLength(int length);

        public int getWidth() {
            return width;
        }

        public abstract void setWidth(int width);
    }

