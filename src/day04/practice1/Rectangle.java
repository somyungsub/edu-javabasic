package day04.practice1;

public class Rectangle extends Shape implements Movable {
    private int width;

    public Rectangle() {}

    public Rectangle(int width, int x, int y) {
        super(new Point(x, y));
        this.width = width;
    }

    public double getArea() {
        return width * width;
    }

    public double getCircumference() {
        return (2 * width) + (2 * width);
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
