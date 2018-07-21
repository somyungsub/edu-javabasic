package day03.exam.basic;

public class Main4 {
    public static void main(String[] args) {
        /*
            import static문 확인
         */
        System.out.println("----------------import static 문----------------");
        Test04 test04 = new Test04();
        test04.test();

        /*
            가변인자 활용
         */
        System.out.println("----------------가변인자----------------");
        test04.test("a");   // a 문자열 넘기기
        test04.test("a","b","c");   // 이것이 가능합니다. 매개변수3개를 넘겼습니다. 2개, 3개, 4개... 가능
//        test04.test(new String[]{"a", "b"});  // 예상해보기 배열도 가능할까요?? -> 주석풀고 확인! 위하고 차이점은 매개변수의 데이터를 넘기는 갯수 차이를 생각하셔야합니다.

        /*
            가변인자는 매개변수 위치상 항상 맨 끝에 와야합니다.
             - 이유는 위 예시 처럼 매개변수 갯수를 가변으로 넣어서 호출이 가능하기 때문에 그뒤에 다른 내용이 담기면 안되는 제약이 생깁니다.
             - 때에 따라 유용하게 활용할 수 있습니다.
             - 매개변수를 넘길 때 그 갯수가 달라지는 경우 -> 오버로딩을 한번에 해결할 수도 있겠죠?? test(String s), test(String s1, String s2) .... 이런식으로 오버로딩을 할 필요가 없어집니다.
         */
    }
}
