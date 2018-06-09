package day04.practice1;

public class Circle extends Shape implements Movable {
    private int radius;

    public Circle() {}

    public Circle(int radius, int x, int y) {
        super(new Point(x, y));
        this.radius = radius;
    }

    public double getArea() {
        double result = 0.0;
        result = radius * radius * Math.PI;
        return result;
    }

    public double getCircumference() {
        double result = 0.0;
        result = 2 * radius * Math.PI;
        return result;
    }

    public void move(int x, int y) {
        point.setX(point.getX() + x + 1);
        point.setY(point.getY() + y + 1);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
