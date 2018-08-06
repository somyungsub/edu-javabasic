package day05.collection.set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        /*
            2. 컬렉션 두번째 - Set
             - 저장순서에 따른 순서가 없음. 즉, 1,2,3,4,5 저장 -> 출력시 다른순서로 출력될 수 있음
             - 같은 데이터에 대해 중복이 허용안됨 -> 즉 1,1,1,2,3 저장 -> 1,2,3 만 출력 (중복처리 할 때 유용합니다)
         */

        // List와 Set 차이
        Set<String> set = new HashSet<>();      // Set은 하위클래스 HashSet을 많이 씀
        List<String> list = new ArrayList<>();  // List는 하위클래스 ArrayList를 많이 씀

        // List 저장
        list.add("ccc");
        list.add("aaa");
        list.add("bbb");
        list.add("aaa");
        list.add("aaa");
        list.add("aaa");


        set.add("ccc");
        set.add("aaa");
        set.add("bbb");
        set.add("aaa");
        set.add("aaa");
        set.add("aaa");

        // foreach를 통한 순회
        System.out.println("------- List 출력 -------");  // 중복허용o, 순서o
        for (String s : list) {
            System.out.println(s);
        }

        // foreach를 통한 순회
        System.out.println("------- Set 출력 -------");   // 중복허용x, 순서x
        for (String s : set) {
            System.out.println(s);
        }

        // Iterator클래스를 활용한 순회방법 - foreach문이 나오면서 Iterator는 거의 사용되지 않습니다. 그래도 이런게 있구나는 아셔야합니다.
        System.out.println("------- Iterator클래스를 통한 출력 -------");
        Iterator<String> ite = set.iterator();
        while (ite.hasNext()) {             // ite.hasNext()를 통해 저장된 다음 데이터가 있는지 확인 : 있으면 true, 없으면 false 반환
            System.out.println(ite.next()); // ite.next()로 저장된 다음 데이터 출력
        }
    }
}
