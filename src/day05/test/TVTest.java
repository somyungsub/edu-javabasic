package day05.test;

public class TVTest {
    public static void main(String[] args) {
        TV tv = new LgTV();
        TV tv2 = new SamsungTV();

        tv.powerOff();
        tv.powerOn();
        tv.volumeDown();
        tv.volumeUp();

        tv2.powerOff();
        tv2.powerOn();
        tv2.volumeDown();
        tv2.volumeUp();

    }
}
