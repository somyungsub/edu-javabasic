package day05.set;

import test.LgTV;
import test.SamsungTV;
import test.TV;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        List<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("aaa");
        list.add("aaa");
        list.add("aaa");
        list.add("aaa");

        set.add("aaa");
        set.add("bbb");
        set.add("aaa");
        set.add("aaa");
        set.add("aaa");
        set.add("aaa");

        Iterator<String> ite = set.iterator();


//        for (String s : list) {
//            System.out.println(s);
//        }

//        for (String s : set) {
//            System.out.println(s);
//        }

        Map<String, String > map = new HashMap<>();
        map.put("lg","lgTV"); // key, value
        map.put("lg","lgTV2"); // key, value
        map.put("samsung","samsung"); // key, value

        System.out.println(map.get("lg"));
        System.out.println(map.get("samsung"));
    }
}
