package day05.collection.list;

import day05.test.SamsungTV;
import day05.test.TV;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        /*
            제네닉스를 활용한 예
             - ?는 와일드카드로서 모든 자료형이 올수 있음을 의미
             - extends와 super키워드를 통해 모든자료형이 오는것 대신 해당내요에 맞는 클래스만 올 수 있도록 제약을 걸어 사용가능.
             -
         */
        List<? extends TV> list3 = new ArrayList<>();   // 제네릭스 코드읽기 : TV를 상속하는 클래스는 누구?
        List<? super TV> list4 = new ArrayList<>();     // 제네릭스 코드읽기 : TV가 상속하는 클래스는 누구?

//        list3.add(new SamsungTV());
    }
}
