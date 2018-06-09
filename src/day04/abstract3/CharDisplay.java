package day04.abstract3;

/*
    문자를 출력해주는 하위클래스
 */
public class CharDisplay extends AbstractDisplay {

    private char ch;    // 출력할 문자

    // 생성자를 통해 문자 전달
    public CharDisplay(char ch) {
        this.ch = ch;
    }

    // 기능구현
    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
