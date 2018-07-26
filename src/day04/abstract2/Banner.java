package day04.abstract2;

/*
    기존에 제공되어 있던 클래스
 */
public class Banner {
    private String string;  // 해당문자열
    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen(){
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }

}
