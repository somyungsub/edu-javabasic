package day03.exam.basic;

import static java.lang.System.out;
import static java.lang.Math.*;

public class Test04 {
    public void test() {

        out.println("System의 static 멤버를 선언하여 활용 하면 System.out.println 에서 System을 생략할 수 있습니다.");
        out.println("Math 또한 저렇게 static import 문을 사용할 경우 static멤버들은 생략하여 사용이 가능합니다.");
        out.println("random 메서드 : " + random()); // 0~1사이의 값을 랜덤발생
        out.println("2의 10승 " + pow(2,10));         // 2의 10승
        out.println("2의 10승 " + Math.pow(2,10));    // 2의 10승
        out.println("보통 근데 이렇게 활용하지는 않습니다. 소스의 길이가 길어지면 pow가 현재 객체의 pow메서드인지 Math pow메서드인지 확인하는 시간비용이(코드분석시간) 발생하기 때문에" +
                "보통은 import static문을 사용하지 않습니다.");
    }

    // 가변인자
    public void test(String... strings) {
        System.out.println("매개변수에서 자료형 String... 와 String[]은 동일합니다. 그냥 배열을 다르게 표현한 방식이라 보시면되지만");
        System.out.println("차이점은 이 메서드를 호출할 때 매개변수로 넘기는 형태입니다.");

        out.println("주의하셔아 할 점은 가변인자를 사용할 경우 항상 맨 끝에 선언이 되어야 합니다. " +
                "매개변수에 대체해보기 -> String... strings, int a " +
                "에러가 발생하죠? 그럼 String...를 맨끝으로 가게 해서 해보세요 -> int a, String... strings" +
                "에러가 발생하지 않습니다! 이유는 사용을 해보시면 이해가 되실거에요 -> Main4에서 확인");

    }

    // 주석을 풀면 에러가 발생해요.. 위의 test(String... strings)메서드와 같은 내용으로 인식하기 떄문입니다. 즉 매개변수를 동일하게 인식하고 있습니다.
//    public void test(String[] strings) {
//        System.out.println("에러!");
//    }
}
