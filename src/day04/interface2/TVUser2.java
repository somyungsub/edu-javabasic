package day04.interface2;

import java.util.Scanner;

public class TVUser2 {
    public static void main(String[] args) {

        /*
            아래 TV tv = BeanFactory.getBean(args[0]) 부터 주석을 풀고 에러가 나는 부분을 확인 해주시고
            BeanFactory클래스의 getBean 메서드를 수정해주세요!!
         */

        /*
            TvUser 복사 한 후 BeanFactory의 getBean 메서드를 static 지정자로 바꿔서 활용한 예입니다.
            지금처럼 TV관련 객체(SamsungTV, LgTV....)를 이곳저곳에서 수시로 생성해서 사용해야 한다고 합시다.
            TvUser에서 처럼 객체생성이 필요할 때 마다 BeanFactory를 생성을 해야한다면...??
            메모리leak(메모리누수)가 발생하여 메모리의 할당량을 넘어서면 서버가 다운되는 현상이 발생하게 됩니다.

            따라서 프로그래밍을 할 때는 이런부분 까지 생각을 하셔야 하며, 지금 단계에서는 조금 힘들 수 있으나
            숙달되고 Java 관련 개발자로 진로를 생각하고 계시다면 이런 메모리 관리도 하셔야합니다.
            다행인건 C++에 비해 가비지컬렉터 때문에 메모리 관리가 적은편이고, new연산자의 할당시점만 잘 파악하신다면 Heap메모리영역의
            메모리누수가 안 생기실 겁니다.

            이런 디자인 패턴은 지금 처럼 메모리의 효율적인 관리와 유지보수성 때문에 선대 개발자들이 만들어준 값진 산출물이라 생각하시면 됩니다.
         */

//        Scanner scanner = new Scanner(System.in);
//        TV tv = BeanFactory.getBean(scanner.next());           // 사용자 입력에 따라 생성의 역할을 위임
//        tv.powerOn();
//        tv.powerOff();
//        tv.volumeUp();
//        tv.volumeDown();
    }
}
