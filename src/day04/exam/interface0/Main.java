package day04.exam.interface0;

public class Main {
    public static void main(String[] args) {
        /*
            다형성을 통한 강제화 두번쨰
            - 인터페이스
         */


        System.out.println("----- 상수 접근 -----");
        System.out.println("InterfaceA.A 상수 : " + InterfaceA.A);
        System.out.println("InterfaceB.A 상수 : " + InterfaceB.C);    // 다중 상속이므로 A, B, C 전부 사용가능
        System.out.println("InterfaceB.B 상수 : " + InterfaceB.B);    // 다중 상속이므로 A, B, C 전부 사용가능
        System.out.println("InterfaceB.C 상수 : " + InterfaceB.C);    // 다중 상속이므로 A, B, C 전부 사용가능
        System.out.println("InterfaceC.C 상수 : " + InterfaceC.C);

        /*
            인터페이스가 상위개념 입니다.
            - 참조하는 클래스 -> 현재는 InterfaceImpl가 하위개념 입니다.
         */
        System.out.println("----- 인터페이스 구현체 예시 -----");
        InterfaceA test = new InterfaceImpl();  // 다형성이 적용 됨
        test.testA();

        /*
            InterfaceImpl02는 A,B,C 다중참조 중이므로
            InterfaceA, InterfaceB, InterfaceC로 다형성이 가능
         */
        InterfaceA test2 = new InterfaceImpl02();
        InterfaceB test22 = new InterfaceImpl02();
        InterfaceC test222 = new InterfaceImpl02();

        /*
            ((InterfaceImpl02) test2).testB()로 되는 이유 test2는 기본적으로 InterfaceA의 변수 입니다
            InterfaceA에는 testB와 testC 메서드가 없지만 InterfaceImpl02에는 2개가 구현되어 있습니다.
            지금처럼 InterfaceA인 test2변수로 testB, testC를 사용하려면 InterfaceImpl02로 형변환을 거친 후 사용해야합니다.
         */
        System.out.println("----- 인터페이스 구현체 예시 InterfaceA test2 -----");
        test2.testA();
        ((InterfaceImpl02) test2).testB();
        ((InterfaceImpl02) test2).testC();


        // InterfaceC test222도 마찬가지 입니다.
        System.out.println("----- 인터페이스 구현체 예시 InterfaceC test222 -----");
        ((InterfaceImpl02) test222).testA();
        ((InterfaceImpl02) test222).testB();
        test222.testC();


        // InterfaceB는 A,B,C 전부 정의되어 있어서 바로 활용가능
        System.out.println("----- 인터페이스 구현체 예시 InterfaceB test22 -----");
        test22.testA();
        test22.testB();
        test22.testC();



    }
}
