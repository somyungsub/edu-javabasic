package day04.abstract1;

/*
    추상클래스 (abstract class로 표현)
    - 추상메서드 일반지정자 abstract 키워드의 메서드가 존재할 경우 무조건 그 클래스는 추상클래스 입니다.
    - 기본적으로 현재 클래스인 Shape 클래스는 new연산자를 통해 생성이 불가능...
      But 생성 방법은 존재하나 방식이 기본방식과 달라집니다.
 */
public abstract class Shape {
    protected Point point;

    public Shape() {

    }
    public Shape(Point point) {
        this.point = point;
    }

    /*
        ** 추상메서드 : 일반지정자인 abstract 예약어 사용 **
        상위에서는 틀(정의부분)만 제공하여 하위클래스에서 구현을 강제하기 위함.
        -> Shape를 상속하면 무조건 하위에서 구현을 해야하는 제약이 생김.
     */
    public abstract double area();

    // 공통 유틸성 메서드 x, y 합구하기
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
