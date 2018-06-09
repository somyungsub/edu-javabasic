package day04.abstract1;

public abstract class Shape {
    protected Point point;

    public Shape(Point point) {
        this.point = point;
    }

    public abstract double area();
    /*
        공통 유틸성 메서드 x, y 합구하기
     */
    public int calculateXYSum() {
        return point.getX() + point.getY();
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
}
