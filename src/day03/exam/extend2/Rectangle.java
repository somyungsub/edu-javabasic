package day03.exam.extend2;


public class Rectangle extends Shape{

    public Rectangle(Point point) {
        super(point);
    }
    public double area() {
        return point.getX() * point.getY();
    }

}
