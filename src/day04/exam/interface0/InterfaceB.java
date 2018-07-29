package day04.exam.interface0;

/*
    인터페이스는 다중상속이 가능!
 */
public interface InterfaceB extends InterfaceA, InterfaceC{
    int B = 2000;

    @Override
    void testA();

    @Override
    void testC();

    void testB();
}
