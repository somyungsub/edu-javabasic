package homework.day03.h06;

public class StudentTest {
    public static void main(String[] args) {
        Student[] studentArray = new Student[3];

        // 객체생성
        studentArray[0] = new Student("홍길동", 15, 171, 81);
        studentArray[1] = new Student("한사람", 13, 183, 72);
        studentArray[2] = new Student("임걱정", 16, 175, 65);

        // 정보출력
        for (Student student : studentArray) {
            System.out.println(student.toString()); // toString을 오버라이딩
        }

        // 나이평균
        double avgAge = 0.0;
        for (Student student : studentArray) {
            avgAge += student.getAge();
        }
        System.out.println("나이의 평균 : " + getSetTwo(avgAge / studentArray.length));

        // 신장평균
        double avgHeight = 0.0;
        for (Student student : studentArray) {
            avgHeight += student.getHeight();
        }
        System.out.println("신장의 평균 : " + getSetTwo(avgHeight / studentArray.length));

        // 몸무게평균
        double avgWeight = 0.0;
        for (Student student : studentArray) {
            avgWeight += student.getWeight();
        }
        System.out.println("몸무게의 평균 : " + getSetTwo(avgWeight / studentArray.length));

    }

    // 3째자라에서 반올림하여 2째자리 까지 표현하기
    private static double getSetTwo(double value) {
        int result = (int) (value * 1000); // 곱하기 1000을 한 후 정수형으로 바꿔 나머지 소수점은 없애기

        // 나머지 연산자를 통해 반올림 체크
        if (result % 10 > 5) {
            result /= 10;
            result++;
        } else {
            result /= 10;
        }

        return (double) result / 100; // 마지막으로 100으로 나누어 2째자리 까지 표현하기
    }
}
