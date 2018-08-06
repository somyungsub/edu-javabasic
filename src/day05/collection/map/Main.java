package day05.collection.map;

import day05.util.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        /*
             3. 컬렉션 세번째 - Map
             - Map은 key, value의 쌍으로 움직이는 자료구조입니다. 정말 많이 활용됩니다
             - put 메서드를 통해 key, value 데이터를 저장하고
               get 메서드를 통해 value값을 뽑아냅니다.

             - key는 유일하여 중복허용 x, value는 키값에 따라 저장되는 데이터로 중복허용o
             - 만약 key값이 중복으로 저장되면 나중에 저장된 value값이 덮어쓰기가 됩니다.
         */

        System.out.println("-------- Map 출력 --------");
        Map<String, String> map = new HashMap<>();

        // put메서드를 통해 데이터 저장
        map.put("lg","lgTV");   // key : lg, value : lgTV
        map.put("lg","lgTV2");  // key : lg, value : lgTV2 (위에 key값 중복이므로 마지막에 저장된 lgTV2가 저장됩니다)
        map.put("samsung","samsung22"); // key, value

        // get(key)메서드를 통해 해당 key값에 대한 데이터를 뽑음
        System.out.println(map.get("lg"));      // value 예상해보기
        System.out.println(map.get("samsung")); // value 예상해보기


        System.out.println("-------- Map2 출력 --------");
        Map<Integer, String> map2 = new HashMap<>();        // 제네릭스의 자료형을 Integer, String으로 바꿨습니다.

        map2.put(1, "1입니다");
        map2.put(2, "2입니다");
        map2.put(3, "3입니다");
        map2.put(4, "4입니다");

        /*
            Map은 List나 Set과는 달리 key, value가 쌍으로 한 Row를 차지하므로
            순회 시 조금 다른 형태를 띕니다.
         */

        // Map에서 메서드 entrySet을 통해 Key, Value 쌍을이루는 Set<Entry>를 반환 -> Set에 저장된 객체를 하나씩 끄집어냄
        for (Entry<Integer, String> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


        // key만 얻기
        System.out.println("-------- key Test ---------");
        Set<Integer> setKey = map2.keySet();
        for (Integer key : setKey) {
            System.out.println(key + " : " + map2.get(key));
        }

        // value만 얻기
        System.out.println("-------- value Test ---------");
        Collection<String> setValue = map2.values();
        for (String value : setValue) {
            System.out.println(value);
        }



    }
}
