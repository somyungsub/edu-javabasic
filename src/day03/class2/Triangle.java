package day03.class2;

public class Triangle {
    private Point point;

    public Triangle(Point point) {
        this.point = point;
    }

    public double area() {
        return 0.5 * point.getX() * point.getY();
    }
}
