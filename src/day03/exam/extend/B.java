package day03.exam.extend;

/*
    상속하기
     - 사용법  -> 하위클래스 extends 상위클래스
       접근지정자(protected, public)에 따라서 A의 정보까지 내 것이 됩니다.
       A+B의 정보를 가지게 되는 것입니다.
 */
public class B extends A {
    private int b;

    public B() {
        System.out.println("나는 하위클래스 B 기본생성자");
    }

    @Override
    public void overrideMethod() {
        System.out.println("하위클래스 B의 오버라이드");
        System.out.println("A클래스의 finalOverride  staticOverride 오버라이딩이 안됩니다.");
    }

    public void test() {
        System.out.println("super 키워드는 상위를 가르킵니다,");
        System.out.println("상위클래스 호출해보기");
        super.inheriteMethod(); // 상위클래스 메서드 호출
        super.finalOverride();  // 상위클래스 메서드 호출
        System.out.println("상위클래스 변수 name : " + super.name);    // protected 지정자이므로 하위에서 접근이 가능
        System.out.println("상위클래스 변수 age : " + super.age);      // protected 지정자이므로 하위에서 접근이 가능
        System.out.println("상위클래스 number는 접근이 안됩니다!");
    }

}
