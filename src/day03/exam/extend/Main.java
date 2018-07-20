package day03.exam.extend;

public class Main {
    public static void main(String[] args) {
        /*
            상속익히기
         */
        // 실행결과 예상해보기
        System.out.println("--- 생성자 호출 순서 익히기 ---");
        A a = new A();
        System.out.println(a);

        // 실행결과 예상해보기
        System.out.println("--- 생성자 호출 순서 익히기2 ---");
        // 다형성 : 기본타입 때 했던 형변환을 객체에 적용한 확장개념 -> 포함관계 생각해보기 (A는 부모, B는 자식)
        A b = new B();
        System.out.println(b);

        // 실행결과 예상해보기
        System.out.println("--- 생성자 호출 순서 익히기3 ---");
        B b2 = new B();
        System.out.println(b2);

        System.out.println("--- 메서드 호출 ---");
        b2.test();
    }
}
