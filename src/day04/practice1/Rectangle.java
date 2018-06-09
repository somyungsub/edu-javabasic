package day04.practice1;

public class Rectangle extends Shape implements Movable {
    private int width;

    public Rectangle() {}

    public Rectangle(int width, int x, int y) {
        super(new Point(x, y));
        this.width = width;
    }

    public double getArea() {
        double result = 0.0;
        result = width * width;
        return result;
    }

    public double getCircumference() {
        double result = 0.0;
        result = (2 * width) + (2 * width);
        return result;
    }

    public void move(int x, int y) {
        point.setX(point.getX() + x + 2);
        point.setY(point.getY() + y + 2);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
