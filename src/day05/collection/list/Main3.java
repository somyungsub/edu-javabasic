package day05.collection.list;

import day05.test.*;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        /*
            컬렉션은 기본적으로 제네릭스가 구현된 제네릭스 클래스입니다.
            그중 List를 통해 살펴 보도록 하겠습니다.

            제네닉스에서 와일드 카드를  활용한 예
             - ?는 와일드카드로서 어떤자료형이 오는지 모르는 경우 표시해주는 키워드입니다.
             - extends와 super키워드를 통해 자료형이 오는것에 대한 관계 제약을 걸어 관계에 맞는 클래스만 올 수 있도록 함.
               :main 메서드의 test, test2, test3, test4를 통해 개념익히기
         */
        List<TV> list3 = new ArrayList<>();
        List<TV> list4 = new ArrayList<>();
        List<SamsungTV> list5 = new ArrayList<>();
        List<Object> list6 = new ArrayList<>();

//        list4.add(new Object());

        test(list3);
        test2(list3);
        test3(list3, list3);
//        test4(list3, list3);  // test4 메서드의 두번째 매개변수의 타입을 잘 살펴보시고 에러가 나는이유를 생각해봅시다! 설명은 test4 메서드에!

        test(list4);
        test2(list4);
        test3(list4, list4);
//        test4(list4, list4);  // test4 메서드의 두번째 매개변수의 타입을 잘 살펴보시고 에러가 나는이유를 생각해봅시다! 설명은 test4 메서드에!

        test(list5);
//        test2(list5);           // list5 변수 타입은 SamsungTV 이므로 에러 발생 (test2메서드는 TV 기준 상위만 받음)
        test3(list5, list5);
//        test4(list5, list5);   // test4 메서드의 두번째 매개변수의 타입을 잘 살펴보시고 에러가 나는이유를 생각해봅시다! 설명은 test4 메서드에!

//        test(list6);            // list6 변수 타입은 Object 이므로 에러 발생 (test메서드는 TV 기준 하위만 받음)
        test2(list6);
        test3(list6, list6);
        test4(list6, list6);

    }

    // 제네릭스 코드읽기 : TV를 상속하는 클래스는 누구?    -> 즉, TV이하 (TV 기준 하위클래스 받기)
    private static void test(List<? extends TV> list) {
    }

    // 제네릭스 코드읽기 : TV가 상속하는 클래스는 누구?    -> 즉, TV이상 (TV 기준 상위클래스 받기)
    private static void test2(List<? super TV> list) {

    }

    // ?만 -> 아직 타입이 안정해져 있어서 어떤 타입이든 올수 있다는 의미 : 즉 ?과 생략은 같은의미
    private static void test3(List<?> list, List list2) {
        System.out.println("위 2개의 매개변수 타입 표시는 동일한 의미를 지닙니다");
    }

    // test3과 test4의 차이
    private static void test4(List<?> list, List<Object> list2) {
        System.out.println("위 2개의 매개변수 타입 표시는 헷갈릴 수 있으나 다른의미 입니다,");
        System.out.println("?는 아직 타입이 안정해졌기 때문에 모든타입을 받는 의미이고,");
        System.out.println("<Object>는 Object타입을 받겠다는 의미이므로, 매개변수로 받을 때는 제네릭스로 타입설정을 Object로 한 것만을 받게 됩니다.");
    }
}
