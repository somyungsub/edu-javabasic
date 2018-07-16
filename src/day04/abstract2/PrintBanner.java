package day04.abstract2;



/*
    인터페이스 Print를 참조       - 현재 필요한 객체
    클래스     Banner를 상속      - 기존의 미리 제공된 클래스

    중간에서 어댑터 역할 수행 구현체

 */
public class PrintBanner extends Print {

    private Banner banner;  // 위임된 클래스

    public PrintBanner(String string) {
        banner = new Banner(string);
    }

    // 현재 클라이언트에서 필요로 하는 메서드
    @Override
    public void printWeak() {
        System.out.println("요청작업 약하게");
        banner.showWithParen();    // 기존에 제공되고 있던 함수 -> Wrapper 하여 클라이언트에 제공
    }

    // 현재 클라이언트에서 필요로 하는 메서드
    @Override
    public void printStrong() {
        banner.showWithAster();    // 기존에 제공되고 있던 함수

    }

}
