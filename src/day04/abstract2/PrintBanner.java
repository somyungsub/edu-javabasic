package day04.abstract2;



/*
    추상클래스 Print 상속       - 현재 요청에 의해 필요한 객체
    클래스     Banner를 상속    - 기존 시스템에서 활용되고 있는 클래스

    중간에서 어댑터 역할 수행 구현체  (PrintBanner)

 */
public class PrintBanner extends Print {

    private Banner banner;  // 위임된 클래스

    public PrintBanner(String string) {
        banner = new Banner(string);
    }

    // 현재 클라이언트에서 필요로 하는 메서드
    @Override
    public void printWeak() {
        banner.showWithParen();    // 기존에 제공되고 있던 함수 -> Wrapper 하여 클라이언트에 제공
    }

    // 현재 클라이언트에서 필요로 하는 메서드
    @Override
    public void printStrong() {
        banner.showWithAster();    // 기존에 제공되고 있던 함수
    }

}
