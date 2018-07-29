package homework.day03.h05;

public class Calc {

    // 짝수 합만 구하는 메서드
    public int calculate(int data) {
        int sum = 0;    // 짝수합 반환을 위한 임시 로컬변수
        for (int i = 1; i <= data; i++) {
            // 들어온 데이터 까지의 짝수를 판단하여 sum변수에 저장
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
