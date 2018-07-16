package day04.abstract1;


public class Rectangle extends Shape {

    public Rectangle(Point point) {
        super(point);
    }

    /*
        ** 오버라이딩 **
        상위 정의된 메서드를 하위에서 재정의하여 구현
        -> 실행시점에서 하위클래스의 해당 메서드가 실행됨
     */
    @Override
    public double area() {
        return point.getX() * point.getY();
    }

}
