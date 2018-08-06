package day05.util;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        UtilClass.print(new Integer[]{1, 2, 3, 4, 5, 6, 0});
        UtilClass.print(new Double[]{1.0, 2.2, 3.3, 4.1});
        UtilClass.print(new String[]{"a","b","C"});


        String[] strings = {"abc", "def", "1235"};
        List<String> list = UtilClass.getArrToList(strings);
        for (String s : list) {
            System.out.println(s);
        }


        System.out.println("--------- Test --------");
        Map<String, Object> map = new HashMap<>();
        map.put("name", "소명섭");
        map.put("age", 99);
        map.put("weight", BigDecimal.valueOf(70.2));
        map.put("test", "Test");    // Test클래스에 없는 변수정보 추가

        Test test = UtilClass.convertMapToObject(map, Test.class);
        System.out.println(test);


        System.out.println("-------- Student 클래스 ---------");
        Map<String, Object> map2 = new HashMap<>();
        map2.put("name", "소명섭");
        map2.put("age", 99);
        map2.put("grade", 4);
        map2.put("address", "서울시 00구 00동 탈잉 Java를 자바라");


        Student student = UtilClass.convertMapToObject(map2, Student.class);
        System.out.println(student);
    }
}
