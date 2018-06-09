package day04.abstract1;


public class Rectangle extends Shape {

    public Rectangle(Point point) {
        super(point);
    }

    @Override
    public double area() {
        return point.getX() * point.getY();
    }

}
