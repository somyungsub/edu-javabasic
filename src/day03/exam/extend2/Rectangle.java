package day03.exam.extend2;


public class Rectangle extends Shape{

    public Rectangle(Point point) {
        super(point);
    }

    // 오버라이딩 - 사각형 넓이구하기
    public double area() {
        return point.getX() * point.getY();
    }

}
