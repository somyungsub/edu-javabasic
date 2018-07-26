package day04.abstract2;

/*
    클라이언트

    위임에 의한 어댑터패턴

 */
public class Main {
    public static void main(String[] args) {
        Print print = new PrintBanner("Hello");
//        print.printStrong();
//        print.printWeak();
    }
}
