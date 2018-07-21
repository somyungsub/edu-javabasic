package day03.exam.basic;

public class Test03 {
    private int a;

//    public Test03(int a) {
//        this.a = a;
//    }


    // 클래스 안에 클래스 선언하여 사용   -> 이너클래스
    // 안드로이드나 GUI 프로그래밍에 자주 쓰이는편    -> 장점은 class 내부에 다양한 자료구조를 만들어 효율적으로 사용이 가능하지만 이너클래스가 많아지면 복잡해지므로 파일을 나누는게 낫습니다.
    public class Inner03{
        private int innerInt;
        public Inner03() {
            System.out.println("Test03 이너 클래스 Inner03");
            innerInt = 10;
        }
        private void innerMthod() {
            System.out.println("innerMthod 멤버변수 int 값 : " + innerInt);
        }
    }

    // 내부에 이렇게 객체를 생성하여 사용 ㅓ가능
    private Inner03 inner03 = new Inner03();

    // Test03 클래스에 메서드를 활용하여 inner클래스를 Test03에서만 활용
    public void innterTest() {
        Inner03 innerTest = new Inner03();
        innerTest.innerMthod();
    }
}


/*
    이렇게 접근지정자가 생략된(default) class도 같이 기술은 가능하나
    보통 하나의 파일에 하나의 클래스를 기술합니다.
    이렇게 한 파일에 여러개의 클래스를 사용하는 것은 관리하기가 쉽지 않고, 외부 패키지에서 참조를 못하기 때문에 거의 사용을 안하고
    클래스 내에서 다른 클래스를 통한 자료구조가 필요한 경우는 위 이너클래스 처럼 활용을 합니다.
 */
class Test033{
    public Test033() {
        System.out.println("Test033");
    }
}
class Test044{
    public Test044() {
        System.out.println("Test044");
    }
}
