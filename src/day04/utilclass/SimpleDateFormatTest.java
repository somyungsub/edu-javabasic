package day04.utilclass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) {
        /*
            SimplDateFormat클래스 관련 메서드
            - 날짜 관련해서 자주 쓰이는 클래스입니다
         */

        // 패턴(형식) 지정없이 그대로 출력
        Date date = new Date();
        System.out.println(date);

        // 패턴 지정 후 날짜를 출력
        SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");
        System.out.println(sf.format(date));

        // 패턴 재 정의 후 재출력
        sf.applyPattern("yyyy년 MM월 dd일");
        System.out.println(sf.format(date));

        // 패턴 재 정의 후 재출력
        sf.applyPattern("yyyy-MM-dd HH:mm");
        System.out.println(sf.format(date));

        // 패턴 재 정의 후 재출력
        sf.applyPattern("yyyy년 MM월 dd일 \tHH시 mm분 ss초");
        System.out.println(sf.format(date));

        // 패턴 재 정의 후 재출력
        sf.applyPattern("yyyy년 MM월 dd일 \tHH시 mm분 ss초 a");
        System.out.println(sf.format(date));

    }
}
