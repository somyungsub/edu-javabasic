package day04.interface2;

public class TVUser {
    public static void main(String[] args) {
        BeanFactory beanFactory = new BeanFactory();    // factory 패턴 적용
//        TV tv = new SamsungTV();
        TV tv = (TV) beanFactory.getBean(args[1]);      // 생성의 역할을 위임
        tv.powerOn();
        tv.powerOff();
        tv.volumeUp();
        tv.volumeDown();
    }
}