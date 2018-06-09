package day04.practice1;

/*
    종합 연습문제
    - 부모 : 도형        Shape (추상클래스)
    - 자식 : 사각형, 원  Rectangle, Circle
    - 단일 : 점          Point - 점
    - 인터페이스         Movable
 */
public class Main {
    public static void main(String[] args) {

        /*
            20 ~ 30분
         */
        Shape[] list = new Shape[4];

        Rectangle r1 = new Rectangle(4,7,5);
        Rectangle r2 = new Rectangle(5,4,6);
        Circle c1 = new Circle(6,6,7);
        Circle c2 = new Circle(7,8,3);

        list[0] = new Rectangle(4,7,5);
        list[1] = new Rectangle(5,4,6);
        list[2] = new Circle(6,6,7);
        list[3] = new Circle(7,8,3);

        System.out.println("구분 \t\t 길이 \t X좌표 \t Y좌표 \t Area \t Circumference");









        for(int i = 0; i < list.length; i++) {
            Shape s = (Shape)list[i];

            if(s instanceof Rectangle){
                Rectangle r = (Rectangle)s;
                System.out.println("Rectangle \t" + r.getWidth() + "\t" + s.getPoint().getX() + "\t" + s.getPoint().getY() + "\t" + Math.round(s.getArea()) + "\t" + Math.round(s.getCircumference()));

            } else if(s instanceof Circle) {
                Circle c = (Circle)s;
                System.out.println("Circle \t\t" + c.getRadius() + "\t" + s.getPoint().getX() + "\t" + s.getPoint().getY() + "\t" + Math.round(s.getArea()) + "\t" + Math.round(s.getCircumference()));
            }
        }

        System.out.println("이동 후...");

        for(int i = 0; i < list.length; i++) {
            Shape s = (Shape)list[i];

            if(s instanceof Rectangle) {
                Rectangle r = (Rectangle)s;
                r.move(10,10);
                System.out.println("Rectangle \t" + r.getWidth() + "\t" + s.getPoint().getX() + "\t" + s.getPoint().getY());

            } else if(s instanceof Circle) {
                Circle c = (Circle)s;
                c.move(10,10);
                System.out.println("Circle \t\t" + c.getRadius() + "\t" + s.getPoint().getX() + "\t" + s.getPoint().getY());
            }
        }

    }
}
