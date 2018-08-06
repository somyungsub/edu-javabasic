package day05.collection.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        /*
            TreeSet
            - HashSet과는 달리 순서가 정렬되면서 저장됩니다.
            - 작업속도가 느립니다.
            - 정렬이 필용한 경우 하위클래스를 HashSet대신 TreeSet을 사용.
         */
        Set<String> set = new TreeSet<>();

        set.add("ccc");
        set.add("aaa");
        set.add("bbb");
        set.add("aaa");
        set.add("aaa");
        set.add("aaa");

        Set<String> set2 = new HashSet<>();

        set2.add("ccc");
        set2.add("aaa");
        set2.add("bbb");
        set2.add("aaa");
        set2.add("aaa");
        set2.add("aaa");

        // 정렬되어 출력
        System.out.println("------- Set 출력 -------");
        for (String s : set) {
            System.out.println(s);
        }
        // 정렬x 출력
        System.out.println("------- Set2 출력 -------");
        for (String s : set2) {
            System.out.println(s);
        }


        // 정렬안된 set를 List로 변환 후 Collections 클래스의 sort 메서드를 활용하여 정렬 출력
        List<String> list = new ArrayList<>(set2);  // Set -> List로 변환 저장
        System.out.println("------- Set2 -> List -> 정렬 전 -------");
        for (String s : list) {
            System.out.println(s);
        }
        Collections.sort(list); // 정렬 메서드 sort 활용
        System.out.println("------- Set2 -> List -> 정렬 후 -------");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
