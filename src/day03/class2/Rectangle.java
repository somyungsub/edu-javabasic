package day03.class2;

public class Rectangle {
    private Point point;

    public Rectangle(Point point) {
        this.point = point;
    }
    public double area() {
        return point.getX() * point.getY();
    }

}
