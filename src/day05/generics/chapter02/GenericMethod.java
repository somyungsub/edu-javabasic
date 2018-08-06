package day05.generics.chapter02;

public class GenericMethod {
    /*
        제네릭스란? -> 다시한번 상기해보세요 (Student클래스 참조)

        제네릭스의 특징을 이용하여 다형성을 좀 더 폭넓게 활용 할 수 있습니다.
        여기에서는 메서드에는 제네릭이 어떻게 활용 될 수 있는지 간단히 살펴 보고 컬렉션 프레임워크에서
        조합해서 활용해보겠습니다.
     */

    /*
        1. 구조
         - 지정자 <T> 리턴자료형 순서대로 명시해주셔야합니다.
         - 꼭 T가 아니더라도 됩니다만, 매개변수로 들어온 T[]에서 T와 지정자 리턴사이의 T의 문자가 일치해야합니다.
           Ex) 매개변수 : E[] array -> 지정자 <E> 리턴자료형. 이렇게 영어를 일치시켜주셔야 합니다.
     */

    // 기본적인 swap 위치의 데이터 바꾸기
    public static <T>void swap(T[]  array, int i, int j){
        System.out.println("T는 어떤 자료형이 들어올지 안정해져 있습니다. 원래대로라면 int[], String[] 이런식으로" +
                "타입(자료형)이 정해져서 매개변수를 선언하지만.. 이렇게 제네릭스를 이용하면 다양한 타입을 받을 수 있습니다" +
                "여기서 중요한점은 T는 int와 같은 기본자료형을 받지 않습니다. 클래스단위만 허용합니다." +
                "즉, int[] 넘기고싶으시면 Integer[]를 넘기셔서 오토박싱을 이용하셔야합니다" +
                "int는 기본타입이고 Integer는 참조타입(클래스) 입니다. 다르지만 호환이 가능하게끔 만들어 놓은것에 주의하셔야합니다");

        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // 배열의 데이터를 출력
    public static <T> void printArray(T[] arr) {
        /*
            제네릭스 없이 모든배열의 내용을 출력하는 함수를 작성해야 한다 합시다......
            어떤일이 벌어 질까요??
            Integer, String, Double, ...... 엄청많은 자료형이 들어올 수 있습니다..
            그러면 그떄마다 오버로딩을 통해 함수를 그 갯수만큼 작성하셔야겠다는게 감이 오시나요???

            -> printArray(Integer[] arr), printArray(String[] arr), printArray(Double[] arr) 이렇게 말이죠...
            -> 제네릭스가 이것을 한방에 해결해줍니다... 엄청나지 않나요?
         */

        // 어떤 타입이 들어와도 현재 함수 하나면 끝입니다.
        StringBuffer sb = new StringBuffer();   // 4주차에 배운 내용 복습겸 활용해보겠습니다.
        for (T t : arr) {
            sb.append(t).append("\t");          // append로 붙이기 / 메서드체인 방식 활용
        }
        System.out.println(sb.toString());      // 출력
    }

}
