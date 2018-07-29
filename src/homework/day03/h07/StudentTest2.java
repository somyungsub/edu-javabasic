package homework.day03.h07;

import java.lang.reflect.Method;
import java.math.BigDecimal;

public class StudentTest2 {

    public static void main(String[] args) throws Exception {

        /*
            ++ 내용추가 ++
            향후 개발자의 꿈을 꾸게 되신다면 리플렉션이라는 용어를 듣게 되실겁니다.
            지금 단계에서는 정말 어려운 부분이고 활용하기도 쉽지 않으나 소스를 보고 느껴보시는게 큰 도움이 되실 수 있다고 판단되어
            추가하였으니 가벼운 마음으로 읽고 넘어가시기 바랍니다.
         */
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

        // 나이
        reflectionExam("getAge", null, studentArray, "나이가 가장 많은 학생", "나이가 가장 적은 학생");
        // 신장
        reflectionExam("getHeight", null, studentArray, "신장이 가장 큰 학생", "신장이 가장 작은 학생");
        // 몸무게
        reflectionExam("getWeight", null, studentArray, "몸무게가 가장 많이 나가는 학생", "몸무게가 가장 적게 나가는 학생");
    }

    // 소수점 구하기
    private static String getSetTwo(double value) {
        return String.format("%.3f", value);
    }


    /*
        동적프로그래밍 방식
         - 동적프로그래밍이란 실행되는 매순간 요청인풋에 따라 실행되는 내용이 달라지고, 결과를 도출해내는 방식입니다.
         - 리플렉션 (클래스의 정보를 뽑아서 활용할 수 있도록 해주는 클래스들의 집합입니다.)
         - java.lang.reflect 패키지에 있습니다.

        JAVA에서 제공하는 다양한 API를 활용 하실 때 쯤 아마 리플렉션이라는 단어를 듣게 되실겁니다.
        지금은 이런게 있구나만 보시고 넘어가시고 차후에 한번 아래 메서드 코드분석을 해보시길 권합니다.
     */
    private static void reflectionExam(String methodName, Class<?>[] parameter, Student[] studentArray , String... strings) throws Exception {

        Student minStudent = studentArray[0];   // 리플렉션을 통해 메서드를 수행하기 위한 객체
        Student maxStudent = studentArray[0];   // 리플렉션을 통해 메서드를 수행하기 위한 객체

        // 리플렉션 활용 : getMethod(메서드명, 매개변수리스트) -> 메서드 클래스 정보를 받아서 활용가능하게 해줌
        Method method = Student.class.getMethod(methodName, parameter);

        // min, max를 판단하는 로직
        for (int i = 0; i < studentArray.length; i++) {
            Student student = studentArray[i];

            // method.invoke(실행객체, 매개변수리스트) -> 추출한 메서드를 실행하기
            // BigDecimal 클래스는 숫자의 모든영역을 다뤄주는 클래스라고 보시면 됩니다. ex) new BigDecimal(100) -> 100, new BigDecimal(100.12) -> 100.12, new BigDecimal("100") -> 100 (문자열->숫자화)
            if (new BigDecimal(method.invoke(minStudent, parameter).toString()).compareTo(new BigDecimal(method.invoke(student, parameter).toString())) > 0) {
                minStudent = student;
            }
            if (new BigDecimal(method.invoke(maxStudent, parameter).toString()).compareTo(new BigDecimal(method.invoke(student, parameter).toString())) < 0) {
                maxStudent = student;
            }
        }

        // 스트링버퍼의 append 메서드를 통해 내용을 전부 더한 후 한번에 반환하기
        StringBuffer sb = new StringBuffer();
        sb.append(strings[0]).append(" : ").append(maxStudent.getName()).append(System.lineSeparator())
          .append(strings[1]).append(" : ").append(minStudent.getName());

        System.out.println(sb.toString());
    }

}
