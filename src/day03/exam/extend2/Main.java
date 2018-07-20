package day03.exam.extend2;

public class Main {
    public static void main(String[] args) {
        /*
            부모  Shape   (일반, 상위개념)
            자식  Rectangle, Triangle (구체적, 하위개념)
         */

        // 정적 바인딩 -> 정해진 타입에 의해 사용되는 방식입니다.
        System.out.println("------- 정적바인딩 ---------");
        Rectangle rectangle = new Rectangle(new Point(10, 50));
        Triangle triangle = new Triangle(new Point(3, 5));

        System.out.println(rectangle.area());
        System.out.println(triangle.area());

        /*
            이론자료 6장 p.20 참조
            동적 바인딩  -> 실행시점에 타입이 결정되며 그 타입을 사용하게 되는 방식일 생각하시면 됩니다.
         */
        System.out.println("------- 동적바인딩 ---------");
        System.out.println(getArea(new Shape(new Point(10,10))));
        System.out.println(getArea(new Triangle(new Point(10,10))));
        System.out.println(getArea(new Rectangle(new Point(10, 10))));

        // 여기에 타원을 만들고 area를 구하는 로직을 추가해봅시다!
    }

    /*
        이함수를 통해 동적바인딩의 흐름을 익히시기 바랍니다.
        - 상위클래스 Shape 는 하위클래스 Triangle, Rectangle를 포함할 수 있습니다. 즉 묵시적 형변환이 가능하여 받아 들일 수 있습니다.
        - 들어온 하위클래스 타입에 따라 area 메서드가 호출하게 됩니다. 이런 흐름을 동적바인딩이라 합니다.

        * 다형성, 오버라이딩을 통한 동적바인딩의 특징은 엄청 많이 사용되며 객체지향 프로그래밍의 핵심입니다.
        * 아래 함수 보시는 것처럼 코드 한줄이면 어떤 클래스가 들어와도 동일한 작업을 수행하게 됩니다
          -> 이개념을 통해 수정작업이 발생할 때 우리는 하위클래스의 내용만 수정을 하면 되고 함수 getArea는 손델 필요가 없게 됩니다.

          ex) 삼각형의 넓이를 1/2를 한번 더 해달라는 요청이 들어왔다면 우리는 Triangle 크래스의 area메서드만 수정을 하면됩니다.
          ex) 타원의 넓이도 구해달라는 요청이 들어왔다고 합시다. 그러면 우리는 타원 클래스만 구현을 하면되고(Triangle, Rectangle 처럼)
              구현 후 타원을 호출하는 쪽에서 사용을 하면됩니다.
     */
    private static double getArea(Shape shape) {
        return shape.area();
    }
}
