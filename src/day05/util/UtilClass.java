package day05.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UtilClass {

    /*
        배열 정보 출력
        - 모든타입 가능
     */
    public static <T> void print(T[] arr) {
        StringBuffer sb = new StringBuffer();
        for (T t : arr) {
            sb.append(t).append("\t");
        }
        System.out.println(sb.toString());
    }

    /*
        배열 -> List로 변환하여 반환
        - 모든타입 변환 가능
     */
    public static <T> List<T> getArrToList(T[] arr) {
        List<T> list = new ArrayList<>();
        for (T t : arr) {
            list.add(t);
        }
        return list;
    }


    /*
        Map에 있는 정보를 Class로 변환하여 객체를 생성
        - 리플렉션패키지 클래스 + 제네릭스문법 + 컬렉션이 합쳐진 예
        - 이부분 역시 배운내용들이 활용 될 수 있는 정도를 보여드린 예이므로 현재에서는 넘어가셔도 무방합니다.

        - 주석을 지우면 10줄도 안되는 로직이지만 이처럼 다형성을 최대한 활용하여 어떤 객체가 들어와도 동일한 작업을 할 수 있게 해줍니다.
          Java가 버전업을 하면서 가장 크게 이슈가 된 제네릭스는 이제 모르시면 안될 정도로 중요해졌습니다.
          아마 나중에는 람다도 활성화가 되어 엄청 중요해질겁니다.

        - 보시는 것처럼 OOP의 꽃은 다형성입니다. 다형성이 없었다면 아마... 코드량이 타입별로 존재하게 되는 사태가 벌어질겁니다..
          객체의 관계형성(상속, 참조)을 맺는 부분도 중요하지만 결국은 이런 관계를 맺고 활용되는 개념이 다형성, 오버라이딩, 동적바인딩입니다.

          다 잊어버리셔도 다형성, 오버라이딩, 동적바인딩 이 3가지 개념은 절대 잊으시면 안됩니다.
     */
    public static <K, V, T> T convertMapToObject(Map<K, V> map, Class<T> type) {
        Object obj = null;  // 반환대상
        try {
            // Class.forName(타입이름)은 해당패키지에서 클래스를 찾아 클래스를 반환하며, 반환과 동시에 클래스의 메서드 newInstance()를 통해 객체를 생성
            obj = Class.forName(type.getTypeName()).newInstance();

            // 생성된 객체 obj의 정보 중 getDeclaredFields를 통해 필드정보(멤버변수)를 for문을 통해 순회
            for (Field field : obj.getClass().getDeclaredFields()) {

                // field.getName()를 통해 변수명을 얻음. 현재 Test클래스에서는 name, age, weight 변수명을 얻게 됨
                String  key = ((K)field.getName()).toString();  // Map 저장된 키
                V value = map.get(key);                         // Map 저장된 키의 값

                // map의 메서드 중 containsKey(값)을 통해 map에 해당 값의 키가 있는지를 체크! 키가있으면 다음 로직 수행
                if (map.containsKey(key)) {

                    /*
                        Class 클래스에 getMethod()를 통해 메서드 정보를 얻기
                        - getMethod 구조는 getMethod(메서드명, 메서드매개변수타입 배열) 형식입니다.
                        - String 클래스의 메서드들 concat, substring, charAt,toUpperCase와 static메서드 String.valueOf 를 활용하여 메서드명을 만듬
                          : set + 첫문자 대문자 + 나머지문자열
                        - field.getType()를 활용하여 변수타입을 전달
                     */
                    Method method = obj.getClass().getMethod("set".concat(String.valueOf(key.charAt(0)).toUpperCase()).concat(key.substring(1)), field.getType());

                    /*
                        함수실행 : method.invoke(실행대상 객체, 매개변수 값들..)
                        - 여기서는 setter메서드를 통해 map의 값을 Test객체로 전달하여 Test객체에 값을 저장 하기 위함.
                        - for문을 통해 setName(값), setAge(값), setWeight(값)이 실행되게 됩니다.
                     */
                    method.invoke(obj, value);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) obj;
    }

    /*
        .... 이처럼 현재까지 배우신 내용으로 다양하게 활용을 하실수 있습니다.
     */
}
