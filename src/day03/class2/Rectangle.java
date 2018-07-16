package day03.class2;

/*
    사각형을 표현하는 객체
 */
public class Rectangle {
    private Point point;    // x, y길이

    // point 초기화
    public Rectangle(Point point) {
        this.point = point;
    }

    // 넓이구하기
    public double area() {
        return point.getX() * point.getY();
    }

}
