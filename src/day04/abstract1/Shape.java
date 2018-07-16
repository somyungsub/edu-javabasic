package day04.abstract1;

/*
    추상클래스 (abstract class로 표현)
    - 추상메서드 abstract 키워드의 메서드가 존재할 경우
    - 기본적으로 new연산자를 통해 생성이 불가능...But 생성 방법은 존재하나 방식이 기본방식과 다름
 */
public abstract class Shape {
    protected Point point;

    public Shape(Point point) {
        this.point = point;
    }

    /*
        추상메서드 : abstract 키워드
        틀만 제공하여 구현을 강제하며
        하위에서 구현 : 왜냐면 하위클래스에 따라 구현방식이 다르므로.. 틀만 제공을한다
     */
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
