package day04.abstract1;


public class Triangle extends Shape {

    public Triangle(Point point) {
        super(point);
    }

    @Override
    public double area() {
        return 0.5 * point.getX() * point.getY();
    }
}
