package day03.exam.basic;


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


        /*
            Test01의 method4 주석을 푼 후 아래 주석을 풀고 테스트 해보시기 바랍니다.
            static 지정자 메서드의 예입니다.
             - 사용법 : 클래스명.메서드명
             - 이렇게 가능한 이유는 ? 메모리영역 로딩 시점을 잘 생각해보시기 바랍니다.
               static 지정자는 프로그램 실행시점에 로딩이 되어 클래스간 공유를 하게 된다고 했습니다.
               메서드에 static 지정자를 사용할 경우 new 연산자를 안하고,
               즉 객체를 생성하지 않아도 메서드를 호출 할 수 있게 해줍니다.
             - 자주 호출되고 일반성이 강한 경우에 static 으로 지정해주면 메모리 할당면에서 이익을 볼 수 있겠죠??
               Math.pow 같은 경우 pow가 static이 아니라면 Math클래스를 매번 new연산자로 생성후 사용을 해야할 겁니다.
               하지만 static으로 지정해놨기 때문에 Math 클래스를 객체생성없이 그냥 Math.pow로 사용을 할 수 있습니다.
               이 차이점을 이해 하시는게 중요하며, 혹시 이해 안되시면 꼭 질문 주세요
         */
//         Test01.method4();
        Math.pow(10,2); // pow에 커서를 올려놓고 f3키 클릭  -> 해당 메서드로 이동이 가능


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
            - 동일한 명으로 가능한이유는 >> 오버로딩이 된 예라고 보시면 됩니다.
         */
        System.out.println("-------------- 생성자 확인 ------------------");
        new Test01();
        new Test01(10);

        /*
            ** 추가내용 **
            이 내용은 아직 이해가 안되시면 넘어가셔도 됩니다.
            언젠가는 보게 되실 부분이고 자바환경에서는 자주 활용되는 예입니다.
            일단 넣어 두었으니 보시고 궁금하신건 질문주세요

            6. 메서드 체인
            - 메서드를 호출 후 반환 된 자기자신 or 다른객체의 메서드를 이어서 호출 해 나가는 행위입니다.
            - 대표적인 예가 StringBuffer 클래스의 append 함수 입니다.
            - append 함수는 매개변수로 들어온 데이터를 더하고 StringBuffer객체 (자기자신)를 리턴함으로써 이어나갈 수 있습니다
         */
        System.out.println("---------------메서드 체인-----------------");
        new Test01().plus(10,20);       // new 연산자로 Test01크래스 객체 생성 후 바로 plus 메서드호출
        new Test01(10).methodName2(2);  // new 연산자로 Test01클래스 객체 생성 후 바로 methodName2 메서드 호출

        System.out.println("---------------메서드 체인2-----------------");
        System.out.println(new StringBuffer().append(10).append(" + ").append(20).append(" = ").append(30).toString()); // StringBuffer
    }
}
