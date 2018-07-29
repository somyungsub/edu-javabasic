package day04.interface2;

import java.util.Scanner;

public class TVUser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BeanFactory beanFactory = new BeanFactory();    // factory 패턴 적용
        TV tv = beanFactory.getBean(scanner.next());           // 사용자 입력에 따라 생성의 역할을 위임
        tv.powerOn();
        tv.powerOff();
        tv.volumeUp();
        tv.volumeDown();
    }
}
