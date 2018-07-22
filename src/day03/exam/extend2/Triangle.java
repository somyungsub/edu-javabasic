package day03.exam.extend2;


public class Triangle extends Shape{

    public Triangle(Point point) {
        super(point);
    }

    // 오버라이딩 - 삼각형 넓이구하기  ( 옆에 파란색 o 클릭하면 Shape의 area 메서드로 이동이 됩니다)
    public double area() {
        return 0.5 * point.getX() * point.getY();
    }
}
