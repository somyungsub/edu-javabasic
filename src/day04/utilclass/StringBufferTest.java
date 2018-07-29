package day04.utilclass;

public class StringBufferTest {
    public static void main(String[] args) {
        /*
            StringBuffer 클래스 관련 예제
            - StringBuffer는 문자열을 붙일때도 자주 쓰이는 클래스이며, 유용한 메서드들을 제공합니다
         */
        StringBuffer sb = new StringBuffer();

        // 문자열 붙이기
        sb.append("내 이름은").append(" : ").append("소명섭");
        System.out.println("이름 출력 " + sb.toString());

        // 현재 버퍼에 저장된 문자열 길이
        System.out.println(sb.length());

        // 현재 버퍼에 문자열 삽입하기
        sb.insert(3, "AAAA"); // 인덱스로 3인 곳. 즉 4번쨰 위치에 AAAA 문자열 삽입
        System.out.println(sb.toString());

        // 현재 버퍼에서 문자변경
        sb.setCharAt(0,'미'); // 인덱스로 0인 위치의 문자를 미로 변경
        System.out.println(sb.toString());

        // 현재 버퍼에서 문자열 삭제
        sb.delete(0, 5);    // 인덱스로 0 ~ 5인 위치의 문자열 삭제 -> 0에서 4까지 해당됨
        System.out.println(sb.toString());

        // 문자열을 거꾸로
        sb.reverse();
        System.out.println(sb.toString());


        /*
            ** 추가내용 **
            여태까지 문자열을 출력할 때 + 연산자를 통해 문자열을 붙이는 작업을 했습니다.
            다음을 통해 속도에 대해 생각해보시기 바랍니다
         */
        System.out.println("---- + 연산자를 통해 걸리는 실행시간 ----");
        String s = "";
        long stTime = System.currentTimeMillis();   // 실행시점의 시간을 저장
        for (int i = 0; i < 50000; i++) {
            s = s + i;
        }
        System.out.println(System.currentTimeMillis() - stTime);    // 작업이 끝난 현재시점 시간 - 시작전 시간  =  수행하는데 걸린 시간

        // 시작전 시간 재 저장
        stTime = System.currentTimeMillis();
        System.out.println("---- concat 메서드를 통해 걸리는 실행시간 ----");
        s = "";
        for (int i = 0; i < 50000; i++) {
            s.concat(String.valueOf(i));
        }
        System.out.println(System.currentTimeMillis() - stTime);    // 수행시간

        // 시작전 시간 재 저장
        stTime = System.currentTimeMillis();
        System.out.println("---- StringBuffer append 메서드를 통해 걸리는 실행시간 ----");
        StringBuffer sb2 = new StringBuffer();
        for (int i = 0; i < 50000; i++) {
            sb.append(i);
        }
        System.out.println(System.currentTimeMillis() - stTime);    // 수행시간

        /*
            이처럼 문자열에 + 연산자를 사용하는 것은 편하기는 하지만 속도에 큰 영향을 미칩니다.
            따라서 어느정도 숙달이 되시면 문자열에서는 + 연산자를 사용을 금합니다. 지금처럼 concat메서드나 StringBuffer클래스를 활용해주세요

            이런 속도차이가 생기는 이유는 +연산자를 할때 new String(문자열) 작업을 내부적으로 실행하게 되는데
            이 과정에서 new 연산자가 생기므로 객체를 생성하고, Heap영역에 메모리를 할당하는 시간만큼 실행시간이 길어지기 떄문입니다.
         */
    }
}
