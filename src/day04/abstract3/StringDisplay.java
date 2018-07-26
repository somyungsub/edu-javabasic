package day04.abstract3;

/*
    문자열을 출력해주는 하위클래스
 */
public class StringDisplay extends AbstractDisplay {
    private String string;  // 출력문자열
    private int width;      // 문자열의 byte단위의 길이

    public StringDisplay(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    // 기능구현 - 오버라이딩
    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    // 내부클래스에서만 활용되므로 private 접근지정자로 명시
    private void printLine(){
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
