package day04.abstract2;

/*
    프린트 관련 추상클래스
    - 클라이언트에서 참조할 대상
    - 현재 필요로하는 부분
 */
public abstract class Print {
    public abstract void printWeak();   // 약한표현
    public abstract void printStrong(); // 강한표현
}
