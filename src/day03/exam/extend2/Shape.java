package day03.exam.extend2;

public class Shape {
    protected Point point;

    public Shape(Point point) {
        this.point = point;
    }

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
