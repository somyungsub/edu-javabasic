package homework.day03.h07;

public class StudentTest {

    public static void main(String[] args) {
        Student[] studentArray = new Student[3];

        // 객체생성
        studentArray[0] = new Student("홍길동", 15, 170, 80);
        studentArray[1] = new Student("한사람", 13, 180, 70);
        studentArray[2] = new Student("임걱정", 16, 175, 65);

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

        Student minStudent = studentArray[0];
        Student maxStudent = studentArray[0];

        // 나이
        for (int i = 0; i < studentArray.length; i++) {
            Student student = studentArray[i];
            if (minStudent.getAge() > student.getAge()) {
                minStudent = student;
            }

            if (maxStudent.getAge() < student.getAge()) {
                maxStudent = student;
            }
        }
        System.out.println("나이가 가장 많은 학생 : " + maxStudent.getName());
        System.out.println("나이가 가장 적은 학생 : " + minStudent.getName());

        // 신장
        for (int i = 0; i < studentArray.length; i++) {
            Student student = studentArray[i];
            if (minStudent.getHeight() > student.getHeight()) {
                minStudent = student;
            }

            if (maxStudent.getHeight() < student.getHeight()) {
                maxStudent = student;
            }
        }
        System.out.println("신장이 가장 큰 학생 : " + maxStudent.getName());
        System.out.println("신장이 가장 작은 학생 : " + minStudent.getName());

        // 몸무게
        for (int i = 0; i < studentArray.length; i++) {
            Student student = studentArray[i];
            if (minStudent.getWeight() > student.getWeight()) {
                minStudent = student;
            }

            if (maxStudent.getWeight() < student.getWeight()) {
                maxStudent = student;
            }
        }
        System.out.println("몸무게가 가장 많이 나가는 학생 : " + maxStudent.getName());
        System.out.println("몸무게가 가장 적게 나가는 학생 : " + minStudent.getName());

    }


    private static String getSetTwo(double value) {
        /*
            String.format 메서드를 활용하면 자릿수를 표현해서 반올림하여 문자열로 반환해줍니다.
            - 매개변수 1 : %.3f에서 숫자 3이 소수점 표현숫자를 의미
            - 매개변수 2 : 타겟 값입니다. 예를들어    123.5551123 -> 123.555
                                                   123.555555 -> 123.556
         */

        return String.format("%.3f", value);
    }
}
