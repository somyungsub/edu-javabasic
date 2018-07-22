package day03.practice.basic;

import java.util.Scanner;

public class Practice07 {
    public static void main(String[] args) {
        /*
            day02.practice의 Practice07 문제에서 자료구조를 변경해서 활용해봤습니다.
            - 과목배열 : String[]
            - 점수배열 : int[]

            위 두 배열의 데이터를 Subject 클래스의 데이터로 넣고 Subject[]을 만들어서 (클래스배열 or 객체배열이라 함)
            로직 변경해보기
         */
        Scanner scanner = new Scanner(System.in);
        int size = 3;

        // 입력작업
        Subject[] subjects = new Subject[size];
        for (int i = 0; i < size; i++) {
            System.out.println((i+1)+"번째 과목, 점수를 입력해주세요!");
            subjects[i] = new Subject(scanner.next(), scanner.nextInt());
        }

        // 출력
        System.out.println("******* 입력된 내용 출력 *******");
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i].getSubjectName() + " : " + subjects[i].getScore());
        }

        // 합산점수 출력
        System.out.println("******* 합계 점수 출력 *******");
        int sum = 0;
        for (int i = 0; i < subjects.length; i++) {
            sum += subjects[i].getScore();
        }
        System.out.println(sum);

        // 평균점수 출력
        System.out.println("******* 평균 점수 출력 *******");
        double avg = sum;
        System.out.println(avg/size);
    }
}
