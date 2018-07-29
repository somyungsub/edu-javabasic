package day04.exam.abstract0;

public class Main {
    public static void main(String[] args) {
        /*
            다형성을 통한 강제화 첫번쨰
            - 추상클래스
            - 3주차에 배운 내용(상속을 통한 형변환 - 다형성, 오버라이딩, 동적바인딩)이 객체지향프로그래밍 핵심이고 가장 중요합니다.
            - 4주차에 배우는 추상클래스와 인터페이스는 다형성을 통해 오버라이딩, 동적바인딩을 강제화 시켜서
              활용 시키기 위해 만들어진 문법체계라 보시면 됩니다.
         */
        AbstractClass test = new SubClass01();
        test.test();            // 상속이기 때문에 상위클래스의 메서드는 당영히 사용가능
        test.testOverride();    // 다형성 -> 동적바인딩이 이루어져서 SubClass01의 메서드가 호출됨.

        // 문법에러 -> 상속에서 상위클래스 생성이 가능했으나 추상클래스는 상위클래스 객체생성이 불가능
//        AbstractClass test2 = new AbstractClass();  // 주석풀고 확인가능

        // 하지만 추상메서드를 구현하면 생성 가능합니다.
        AbstractClass test3 = new AbstractClass() {
            @Override
            public void testOverride() {
                System.out.println("실행시점에서 상위클래스의 추상메서드를 구현하면 생성이 가능합니다.");
                System.out.println("이렇게 구현하여 생성하여 test3이라는 변수에 저장하여 활용이 가능합니다.");
                System.out.println("안드로이드에서 이벤트리스너 구현시 이런 경우가 많이 나타납니다. 또는 자바에서 GUI 프로그래밍할 때 자주 발생합니다.");
            }
        };
        System.out.println("--- 추상클래스의 추상메서드 구현 후 활용 ---");
        test3.testOverride();   // 상위클래스의 변수 test3이 호출하는 testOverride()는 어떤내용이 출력 될까요??

    }
}
