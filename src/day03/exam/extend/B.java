package day03.exam.extend;

/*
    상속하기
     - 사용법  -> 하위클래스 extends 상위클래스
       접근지정자(protected, public)에 따라서 A의 정보까지 내 것이 됩니다.
       자식클래스(하위클래스) B는 A+B의 정보를 가지게 되는 것입니다.
 */
public class B extends A {
    private int b;

    public B() {
        System.out.println("나는 하위클래스 B 기본생성자");
    }

    @Override
    public void overrideMethod() {
        System.out.println("하위클래스 B의 오버라이드");
        System.out.println("A클래스의 finalOverride  staticOverride 메서드는 static, final 지정자를 사용해서 오버라이딩이 안됩니다.");
        System.out.println("final은 변경불가의 의미가 담겨있어서 변수는 데이터 변경불가, 메서드는 오버라이딩 불가, 클래스는 상속불가입니다.");
    }

    public void test() {
        System.out.println("super 키워드는 상위를 가르킵니다,");
        System.out.println("상위클래스 호출해보기");
        super.inheriteMethod(); // 상위클래스 메서드 호출
//        inheriteMethod(); // super 키워드 없이 사용 가능! super를 쓰면 명시적으로 상위의 메서드임을 알 수 있어서 super키워드를 사용하시는 습관도 중요합니다
        super.finalOverride();  // 상위클래스 메서드 호출
        System.out.println("상위클래스 변수 name : " + super.name);    // protected 지정자이므로 하위에서 접근이 가능
        System.out.println("상위클래스 변수 age : " + super.age);      // protected 지정자이므로 하위에서 접근이 가능
        System.out.println("상위클래스 number는 접근이 안됩니다!");
    }

}
