package day04.abstract3;

/*
    상위클래스
    - 하위클래스에 Template 제공
    - 흐름(뼈대)을/를 제공 -> display 메서드
 */

public abstract class AbstractDisplay {

    /*
        템플릿메서드
        -> final : 하위클래스에서 오버라이딩을 못하게 막음 (재정의가 이루어지면 안됨)
     */
    public final void display(){
        // print를 5회 호출하는 프로세스
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }

    // 기능구현메서드 (하위클래스 정의)
    public abstract void open();        // 열기
    public abstract void print();       // 출력
    public abstract void close();       // 닫기
}
