package day05.util;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // 모든 배열 타입을 순차적으로 출력하는 print 메서드
        UtilClass.print(new Integer[]{1, 2, 3, 4, 5, 6, 0});
        UtilClass.print(new Double[]{1.0, 2.2, 3.3, 4.1});
        UtilClass.print(new String[]{"a","b","C"});


        // 모든 배열을 List<T>타입으로 변경해주는 getArrToList메서드
        String[] strings = {"abc", "def", "1235"};
        List<String> list = UtilClass.getArrToList(strings);
        for (String s : list) {
            System.out.println(s);
        }


        // Map의 데이터를  미리 정의된 클래스(여기서는 Test, Student)로 데이터를 전달 후 객체생성하는 convertMapToObject 메서드
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
