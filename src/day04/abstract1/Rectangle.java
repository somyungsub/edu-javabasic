package day04.abstract1;


public class Rectangle extends Shape {

    public Rectangle(Point point) {
        super(point);
    }

    /*
        ** 오버라이딩 복습 **
        상위(Shape 클래스)에 정의된 메서드를 하위에서 재정의하여 구현
        -> 여기에서는 상위클래스 Shape의 추상메서드 public abstract double area();를 오버라이딩함
           추상클래스이므로 area 메서드 구현은 강제입니다.
        -> 실행시점에서 하위클래스의 해당 메서드가 실행됨

     */
    @Override
    public double area() {
        return point.getX() * point.getY();
    }

}
