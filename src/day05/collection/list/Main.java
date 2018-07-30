package day05.collection.list;


import test.SamsungTV;
import test.TV;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<TV> list = new ArrayList<>();
        list.add(new SamsungTV());
//        list.add(new LgTV());
        System.out.println(list.size());

        String[] sList = new String[100000];
        sList[0] = "aaa";
        sList[1] = "aaa2";
        sList[2] = "aaa3";
        System.out.println(sList.length);

        List list2 = new ArrayList();
        list2.add(10);
        list2.add("aaa");
        list2.add(10.5);

        for (int i = 0; i < list2.size(); i++) {
            Object s = list2.get(i);
            System.out.println(s);
        }


        for (int i = 0; i < list.size(); i++) {
            TV tv = list.get(i);
            tv.volumeUp();
            tv.volumeDown();
            tv.powerOn();
            tv.powerOff();
        }

    }
}
