package day05.collection.list;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        /*
            컬렉션 중요 메서드
            - add       : 객체를 저장
            - size      : 저장된 객체의 갯수 반환
            - isEmpty   : 저장된 객체가 있는지 확인 (사이즈 0 : true / 사이즈 1이상 : false)
            - remove    : 저장된 객체를 삭제
            - clear     : 저장된 객체를 전부 삭제
         */
        List<String> list = new ArrayList<>();
        System.out.println("--------------------------------------");
        System.out.println("리스트 size : " + list.size());
        System.out.println("리스트 isEmpty : " + list.isEmpty());

        System.out.println("-------------- 추가 후 ------------------------");
        System.out.println("리스트 add1 : " + list.add(new String("추가하기")));
        System.out.println("리스트 add2 : " + list.add(new String("추가하기2")));
        System.out.println("리스트 add3 : " + list.add(new String("추가하기3")));
        System.out.println("리스트 add4 : " + list.add(new String("추가하기4")));
        System.out.println("리스트 size : " + list.size());
        System.out.println("리스트 isEmpty : " + list.isEmpty());
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-------------- 삭제 후 ------------------------");
        System.out.println("리스트 remove : " + list.remove(0));   // 0번쨰 삭제됨 삭제시 삭제하는 데이터가 반환됨
        System.out.println("리스트 size : " + list.size());
        System.out.println("리스트 isEmpty : " + list.isEmpty());
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-------------- Clear 후 ------------------------");
        list.clear();
        System.out.println("리스트 size : " + list.size());
        System.out.println("리스트 isEmpty : " + list.isEmpty());
        for (String s : list) {
            System.out.println(s);
        }
        /*
            데이터만 사라짐! 메모리에서 변수가 사라지지는 않습니다.
            즉, 데이터를 언제든 다시 추가할 수 있으며, clear 후 사용하지 않으면 쓰레기 변수로 GC의 대상이 될 수 있습니다.
         */
        System.out.println(list.toString());

        System.out.println("-------------- Clear 후 추가하기 ------------------------");
        System.out.println("리스트 add1 : " + list.add(new String("추가하기")));
        System.out.println("리스트 add2 : " + list.add(new String("추가하기2")));
        System.out.println("리스트 size : " + list.size());
        System.out.println("리스트 isEmpty : " + list.isEmpty());
        for (String s : list) {
            System.out.println(s);
        }


    }
}
