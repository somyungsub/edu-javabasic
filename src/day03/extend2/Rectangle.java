package day03.extend2;


public class Rectangle extends Shape{

    public Rectangle(Point point) {
        super(point);
    }
    public double area() {
        return point.getX() * point.getY();
    }

}
