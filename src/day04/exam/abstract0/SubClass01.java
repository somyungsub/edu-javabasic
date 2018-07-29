package day04.exam.abstract0;

/*
    똑같이 상속 키워드 extends 를 통해 클래스를 상속합니다.
    - 상속하면 에러가 발생합니다.
    - 이유는 : 추상클래스를 상속하면 미구현메서드(추상메서드)가 존재하기 때문에 구현을 하라고 나옵니다.
    - 하위에서 구현을 해주면 됩니다. (아래 3가지 방식 중 1개)
      1) 빨간줄위에 마우스 커서를 올려놓으면 빨간전구가 발생하는데 클릭 후 implement methods를 클릭 후 구현 메서드 클릭
      2) alt + insert -> implement methods 또는 override methods 클릭 후 구현 메서드 클릭
      3) 오른쪽 마우스 -> Generate -> implement methods 또는 override methods 클릭 후 구현 메서드 클릭
 */
public class SubClass01 extends AbstractClass {

    // @를 어노테이션이라 부릅니다. 자바에서 설정한 마크라고 생각하시면 되고 어떤 의미인지를 알게 해주는 도우미역할이라 보시면됩니다. 실행에는 영향을 미치지 않습니다
    @Override
    public void testOverride() {
        System.out.println("나는 SubClass01의 testOverride를 오버라이딩한 하위클래스!");
        System.out.println("하위에서 강제구현하기!!!");
    }
}
