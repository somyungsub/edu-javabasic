package day04.abstract1;

/*
    동적 바인딩
 */
public class Main {
    public static void main(String[] args) {
        /*
            부모  Shape   (일반, 상위개념) - 추상클래스
            자식  Rectangle, Triangle (구체적, 하위개념)

            다형성과 오버라이딩은 객체지향의 중요한 개념입니다.
            꼭 확인하시고 이해를 하시기 바라며 이해가 안되부분은
            꼭 질문을 해주셔서 이해하고 넘어 가셨으면 합니다.

            PDF 파일 교재에도 설명이 되어 있으나

            다형성 및 오버라이딩을 사용하는 이유
            - 하위클래스의 실행시점에서 그 클래스에 맞는 메서드를 실행하기 위함.
              여기에서 전제 조건은 상위클래스와 하위클래스 메서드명이 같아서 호출하는 메서드가 하위클래스별로
              다르게 호출하는 작업을 하지 않아야 합니다.. 메서드명이 달라지는 경우 달라진만큼 호출하는 코드량이
              증가하게 되지만 메서드명을 상위 하위 동일하게 할 경우는 1줄로 실행이 가능해지며
              이런 경우 동적바인딩(실행시 그 클래스에 따라 메서드호출)이 이루어지면서 작업을 실행하게 됩니다.
         */

        // 상위클래스 Shape의 형식과 변수하나로 내용을 처리합니다.
        // 여기에서는 하위클래스를 생성하는 부분만 분기처리를 하면 나머지 실행은 Shape로 처리할 수 있음을 의미합니다.

//        Shape ss;
//        if (ss instanceof Triangle) {
//            ss = new Triangle();
//        } else {
//            ss = new Rectangle();
//        } else{
//                ss = null;
//        }

        /*
            다형성의 예
            상위클래스 Shape에 하위클래스 Rectangle, Triangle로 생성하여 테스트
         */
        Shape shape1 = new Rectangle(new Point(10, 50));
        Shape shape2 = new Triangle(new Point(3, 5));

        Shape[] sss = new Shape[2];
        sss[0] = shape1;
        sss[1] = shape2;
        test3(sss);

        /*
            여기에서 중요한 것은 생성된 하위클래스로 함수가 호출된다는 점.
             - 즉 Shape형 변수 1개만으로 하위클래스의 생성만 구분해주면 동일한 처리 작업이 가능해짐
             - 이부분이 이해가 안되시면 꼭 질문주시기 바랍니다!
         */
//        shape1.area();  // 사각형 널이구하기가 호출되
//        shape2.area();  // 삼각형 넓이구하기가 호출됨

//        Shape s = new Triangle(new Point(10,2));
//        Rectangle rectangle = new Rectangle(new Point(10, 50));
//        Triangle triangle = new Triangle(new Point(3, 5));

//        System.out.println(rectangle.area());
//        System.out.println(triangle.area());
//        System.out.println(triangle.area());

//        System.out.println(s.area());
//
//        test2(s);

        // 익명 클래스 : 추상클래스 or 인터페이스를 생성시켜서 사용하는 방법... 기본적인 방식과 다릅니다.
        // 이 부분은 미리 한번 생각해보시기 바랍니다.
//        Shape shape = new Shape(new Point(10,10)) {
//            @Override
//            public double area() {
//                return point.getY() * point.getX() * 4;
//            }
//        };
//        System.out.println(shape.area());
    }

    private static void test2(Shape shape) {
        shape.area();
    }

    private static void test3(Triangle triangle, Rectangle rectangle) {
        System.out.println(triangle.area());
        rectangle.area();

    }

    private static void test3(Shape[] shape) {
        for (int i = 0; i < shape.length; i++) {
            double d = shape[i].area();
            System.out.println(d);
        }
    }
}
