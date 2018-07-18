package day03.exam;


public class Main {
    public static void main(String[] args) {
        /*
            test와 test2 는 Test01클래스의 참조변수 이며, new 연산자를 통해 생성된 객체입니다.
            클래스는 test와 test2 처럼 객체를 만들어 주기 위한 틀이라 보시면 됩니다.
         */
        Test01 test = new Test01();     // 디폴트로 객체 생성
        Test01 test2 = new Test01(10, 20);    // 매개변수 2개 짜리 객체 생성


        /*
            1. 멤버변수 접근
             -> 접근 가능한 이유 생각해보기!
             -> 멤버변수 d는 접근이 안됩니다 -> 이유는?? 힌트 접근지정자를 잘 살펴보세요
         */
        System.out.println("---------------멤버변수-----------------");
        System.out.println("test a (public) : " + test.a);
        System.out.println("test b (protected) : " + test.b);
        System.out.println("test c (생략 : default): " + test.c);
        System.out.println("--------------------------------");

        // test2는 매개변수 2개를 넘겼습니다. 각각 데이터 예상해보기
        System.out.println("test2 a (public) : " + test2.a);
        System.out.println("test2 b (protected) : " + test2.b);
        System.out.println("test2 c (생략 : default): " + test2.c);

        /*
            2. 클래스 변수 접근
         */
        System.out.println("---------------클래스 변수-----------------");
        System.out.println(Test01.classVariable);       // 클래스 변수 접근 -> 초기화를 안했기때문에 0이 디폴트 셋팅됩니다.
        System.out.println(Test01.classVariable2);      // classVariable과 classVariable2 위에 마우스를 올려놓고 F2키를 눌러보세요.   classVariable는 javadoc 주석을 해놔서 설명글이 나옵니다!

        System.out.println("test classVariable : " + test.classVariable);
        System.out.println("test2 classVariable : " + test2.classVariable);

        // test가 classVariable에 접근하여 1증가
        test.classVariable++;

        System.out.println("test classVariable : " + test.classVariable);       // 예상해보기
        System.out.println("test2 classVariable : " + test2.classVariable);     // 예상해보기
        System.out.println("클래스변수는 클래스간 메모리를 공유하기 때문에 생성된 객체(test or test2)가 접근하여 데이터를 변경하면 모든 객체에 영향을 미치게 됩니다!");

        // test2가 classVariable에 접근하여 1증가
        System.out.println("--------------------------------");
        test2.classVariable++;
        System.out.println("test classVariable : " + test.classVariable);       // 예상해보기
        System.out.println("test2 classVariable : " + test2.classVariable);     // 예상해보기

        /*
            3. 메서드 호출해보기
             - methodName3은 호출이 안됩니다!!  -> 이유는~? 힌트 접근지정자를 잘 살펴보세요
             - 사용법 : 객체변수.메서드명 입니다.
         */
        System.out.println("---------------메서드 호출하기-----------------");
        test.methodName2(10);
        test2.methodName2(10);

        // Test01의 method4 주석을 푼 후 아래 주석을 풀고 테스트 해보시기 바랍니다.
        // Test01.method4();

        /*
            4. 오버로딩 메서드!
            - Test01의 overLoadMethod 메서드 주석을 푼 후 확인 해보시기 바랍니다!
            - 동일한 작업을 해야하는데 매개변수의 차이가 생길 경우 오버로딩을 활용하시면 됩니다.
         */
        System.out.println("---------------오버로딩 메서드-----------------");
//        test.overLoadMethod();
//        test.overLoadMethod(10, 20);
//        test.overLoadMethod(10, "아무개");

        // plus 오버로딩
        System.out.println("---------------오버로딩 메서드2-----------------");
        System.out.println(test.plus(10, 20));
        System.out.println(test.plus(10, 20, 30));
        System.out.println(test.plus(new int[]{10,20,30,40}));  // 배열 생성과 동시에 초기화하는 방식 기억나시나요 ?? int[] a = new int[]{10, 20, 30, 40}    : 보통 변수 선언 없이 활용해야하는 경우 이런 방식을 많이 사용합니다.

        /*
            5. 생성자
            - 생성자는 객체 생성시 호출되는 특별한 메서드라고 생각하시면 됩니다!
         */
        System.out.println("-------------- 생성자 확인 ------------------");
        new Test01();
        new Test01(10);

        /*
            6. 메서드 체인
            - 메서드를 이어 나가는 행위입니다.
            - 대표적인 예가 StringBuffer 클래스의 append 함수 입니다. append 함수는
         */
        System.out.println("---------------메서드 체인-----------------");
        new Test01().plus(10,20);
        new Test01(10).methodName2(2);

        System.out.println("---------------메서드 체인2-----------------");
        System.out.println(new StringBuffer().append(10).append(" + ").append(20).append(" = ").append(30).toString()); // StringBuffer
    }
}
