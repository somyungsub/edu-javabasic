package day04.exam.interface0;

/*
    인터페이스는 상수와 추상메서드만을 가지고 있음
    - 참조시 추상 메서드를 전부 구현해야합니다.
 */
public interface InterfaceA {
    int A = 1000;   // public static final이 자동 생략되어 있음
    void testA();   // public abstract가 자동 생략되어 있음
}
