package day04.abstract3;

/*
    클라이언트

    템플릿메서드 패턴 실행
 */
public class Main {
    public static void main(String[] args) {
        AbstractDisplay display1 = new CharDisplay('H');
        AbstractDisplay display2 = new StringDisplay("Hello, World");
        AbstractDisplay display3 = new StringDisplay("안녕하세요.");
        display1.display();
        display2.display();
        display3.display();

    }
}
