package day03.exam.extend;

/*
    상속 개념익히기 (이론자료 6장 p.7 ~ 20)

    상속이란 현실세계에서 부모님이 계시고 자녀가 관계를 맺고 있듯이
    현실성을 살린 자바에서 객체간 관계를 맺는 개념이라 보시면됩니다,
    부모님이 낳은 자녀처럼 자바에서도 부모클래스가 있고, 부모클래스를 받아들이는 자식클래스가 존재하게 됩니다.
    보통 부모클래스는 상위클래스라는 말과 혼용하여 사용되고 있고, 자식클래스는 하위클래스라는 말과 혼용되어 사용하고 있습니다.

    A는  상위클래스
    B는  하위클래스
 */

/*
    상위클래스에는 보통 하위클래스들의 공통 부분을 기술하게 됩니다!
    여기에서는 간단히 예시로만 활용할 예정이고 extend1과 extend2패키지를 통해 좀더 세세히 익혀보시기 바랍니다.
 */
public class A {
    protected String name;  // protected 접근지정자 -> 동일패키지 + 상속관계 + 자기자신 까지 접근이 됩니다.
    protected int age;
    private int number;

    // 기본생성자
    public A() {
        System.out.println("상위클래스 A 기본생성자");
    }

    public A(String name, int age, int number) {
        System.out.println("상위클래스 A 매개변수 생성자");
        this.name = name;
        this.age = age;
        this.number = number;
    }



    // 상속을 하면 하위클래스에서 사용이가능. 보통은 공통메서드로 활용됩니다.
    protected void inheriteMethod() {
        System.out.println("나는 A 클래스 (상위클래스) 공통 메서드!!! 하위클래스는 언제든지 나를 활용해주세요");
    }

    /*
       하위클래스에서 메서드 재 정의 -> 오버라이딩

       오버로딩과 오버라이딩의 차이를 잘 파악하시기 바랍니다.
       이름 때문에 헷갈릴 수 있습니다 정확히 의미를 파악하시기 바랍니다.

       6장 p.14 ~ 15
        - 오버로딩 : 같은 클래스내에 동일한 이름의 메소드가 여러 개 존재 가능하여 의미적으로 동일한 작업을 하는 경우 입니다.
        - 오버라이딩 : 상위클래스에 정의된 내용을 하위클래스에서 하위클래스에 맞게 함수를 재정의하여 사용하기 위함.
                       여기에서 동적바인딩의 개념이 추가됩니다. extend2 패키지에서 좀 더 다뤄보도록하겠습니다.
     */
    public void overrideMethod() {
        System.out.println("나는 상위클래스 오버라이딩 하세요");
    }

    public final void finalOverride() {
        System.out.println("final은 오버라이드 불가");
    }

    public static void staticOverride() {
        System.out.println("static도 오버라이드 불가");
    }



}
