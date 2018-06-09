package day04.abstract1;

/*
    동적 바인딩
 */
public class Main {
    public static void main(String[] args) {
        /*
            부모  Shape   (일반, 상위개념) - 추상클래스
            자식  Rectangle, Triangle (구체적, 하위개념)
         */

        Rectangle rectangle = new Rectangle(new Point(10, 50));
        Triangle triangle = new Triangle(new Point(3, 5));

        System.out.println(rectangle.area());
        System.out.println(triangle.area());


        // 익명 클래스
//        Shape shape = new Shape(new Point(10,10)) {
//            @Override
//            public double area() {
//                return point.getY() * point.getX() * 4;
//            }
//        };

//        System.out.println(shape.area());


        Shape shape1 = new Rectangle(new Point(10, 50));
        Shape shape2 = new Triangle(new Point(3, 5));

        shape1.area();
        shape2.area();



    }
}
