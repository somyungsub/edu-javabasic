package day04.interface2;

public class AppleTV implements TV {
    @Override
    public void powerOn() {
        System.out.println("애플 추가 파워 온");
    }

    @Override
    public void powerOff() {
        System.out.println("애플 추가 파워 1");
    }

    @Override
    public void volumeUp() {
        System.out.println("애플 추가 파워 2");
    }

    @Override
    public void volumeDown() {
        System.out.println("애플 추가 파워 3");
    }
}
