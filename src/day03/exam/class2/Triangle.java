package day03.exam.class2;

public class Triangle {
    private Point point;    // x, y길이

    // point 초기화
    public Triangle(Point point) {
        this.point = point;
    }

    // 넓이구하기
    public double area() {
        return 0.5 * point.getX() * point.getY();
    }
}
