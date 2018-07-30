package day05.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<? extends String> list1 = new ArrayList<String>();
//        List<? extends String> list2 = new ArrayList<CharSequence>();
        List<? super String> list3 = new ArrayList<String>();
        List<? super String> list4 = new ArrayList<CharSequence>();
        List<? super String> list5 = new ArrayList<Object>();
    }
}
