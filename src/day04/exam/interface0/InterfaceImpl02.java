package day04.exam.interface0;

/*
    인터페이스
     - 이론자료 7장 p.8 ~ 13 참조
     - 인터페이스는 강제성을 높여서 다형성의 개념을 적용 할 수 있도록 함으로써
       객체 끼리 다양한 관계를 형성하여 좀 더 다양한 객체지향프로그래밍을 할 수 있도록 해줍니다.

     - 클래스와는 다르게 인터페이스 끼리 다중상속이 가능하며, 클래스는 인터페이스를 다중 참조(implements)를 할 수 있어서
       정의해논 인터페이스를 필요할 때 참조하여 오버라이딩하여 활용 할 수 있습니다.

     - 클래스에서 인터페이스를 참조하여 구현하는 클래스를 구현클래스 or 구현체라고 부릅니다.

     클래스에서 키워드 implements 를 통해 인터페이스를 참조합니다.
    - 구현체에서 인터페이스를 참조하면 에러가 발생합니다.
    - 이유는 : 인터페이스를 참조하면 미구현메서드(추상메서드)가 존재하기 때문에 구현을 하라고 나옵니다.
    - 해당클래스에서 구현을 해주면 됩니다. (아래 3가지 방식 중 1개)
      1) 빨간줄위에 마우스 커서를 올려놓으면 빨간전구가 발생하는데 클릭 후 implement methods를 클릭 후 구현 메서드 클릭
      2) alt + insert -> implement methods 또는 override methods 클릭 후 구현 메서드 클릭
      3) 오른쪽 마우스 -> Generate -> implement methods 또는 override methods 클릭 후 구현 메서드 클릭
 */


// 다중 참조가능
public class InterfaceImpl02 implements InterfaceA, InterfaceC, InterfaceB {

    @Override
    public void testA() {
        System.out.println("구현체에서 testA 오버라이딩!!");
    }

    @Override
    public void testB() {
        System.out.println("구현체에서 testB 오버라이딩");
    }

    @Override
    public void testC() {
        System.out.println("구현체에서 testC 오버라이딩");
    }

}
