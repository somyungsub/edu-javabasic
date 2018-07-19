package day03.exam.extend2;


public class Triangle extends Shape{

    public Triangle(Point point) {
        super(point);
    }

    public double area() {
        return 0.5 * point.getX() * point.getY();
    }
}
