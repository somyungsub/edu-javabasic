package day05.collection.list;


import day05.test.LgTV;
import day05.test.SamsungTV;
import day05.test.TV;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*
            컬렉션 프레임워크란?
             - Collection 인터페이스를 참조하는 List, Set 클래스와 Map 클래스의
               자료구조를 활용하여 프로그래밍 하는 방식을 뜻 합니다.
             - 유용한 자료구조이며 해당 자료구조는 성능도 빠르고, 배열의 불편함을 해소해주고 간단한 데이터를 다루기에도 유용합니다.
             - 내부적으로 제네릭스가 구현되어 있어서 타입의 안정성을 확보할 수 있고, 해당 자료형만 다룰 수 있도록 함으로써
               좀더 다양한 다형성을 활용 할 수 있게 해줍니다.

            1. 컬렉션 첫번째 - List
             - 배열과 공통정 : 저장순서에 따른 순서가 있고, 같은 데이터에 대해 중복이 허용됨.
             - 배열과 다른점 : 배열은 사이즈가 정해져있지만, 리스트는 사이즈가 정해져있지 않음.
         */

        // 제네릭스 + 다형성을 이용 -> 관련 타입만 다루겠다는 의미 (여기서는 TV타입을 다룸)
        List<TV> list = new ArrayList<>();  // List는 하위클래스 ArrayList를 많이 씀
        list.add(new SamsungTV());  // 하위클래스 저장
        list.add(new LgTV());       // 하위클래스 저장
        System.out.println("list size : " + list.size());    // list에 저장된 갯수 (2)

        /*
            배열경우
            - 정적 (사이즈가 정해져 있음)
            - Max : 100000개의 사이즈 공간을 확보해둠 -> 메모리 낭비 발생!!
         */
        String[] arr = new String[100000];
        arr[0] = "aaa";
        arr[1] = "aaa2";
        arr[2] = "aaa3";
        System.out.println("arr length" + arr.length); // arr에 선언된 사이즈크기 (100000)

        /*
            리스트
             - 동적사이즈 조절 (사이즈가 실행에 따라 사이즈가 늘어날 수 있음)
             - 제네닉스 생략 -> 최상위 클래스인 Object로 받아 다형성을 활용함
         */
        List list2 = new ArrayList();   // 제네릭스로 타입이 안정해져있음 : Object
        list2.add(10);      // Integer
        list2.add("aaa");   // String
        list2.add(10.5);    // Double

        // foreach -> list변수는 TV인터페이스의 다형성이 활용된 내용
        System.out.println("------- list 순회 -------");
        for (TV tv: list) {
            System.out.println("TV : " + tv.toString());
            tv.volumeUp();
            tv.volumeDown();
            tv.powerOn();
            tv.powerOff();
        }

        // foreach -> list2변수는 모든 최상위 클래스인 Object 클래스를 다루는 다형성이 활용된 내용
        System.out.println("------- list2 순회 -------");
        for (Object obj: list2) {
            System.out.println(obj);
        }

    }
}
