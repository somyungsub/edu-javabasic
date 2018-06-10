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
//        Shape ss;
//        if (ss instanceof Triangle) {
//            ss = new Triangle();
//        } else {
//            ss = new Re
//        } else{
//                ss = new
//    }


        Shape s = new Triangle(new Point(10,2));
        Rectangle rectangle = new Rectangle(new Point(10, 50));
        Triangle triangle = new Triangle(new Point(3, 5));

//        System.out.println(rectangle.area());
//        System.out.println(triangle.area());
//        System.out.println(triangle.area());

        System.out.println(s.area());

        test2(s);

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

    private static void test2(Shape shape) {
        shape.area();
    }
}
