package day03.practice.basic;

import java.util.Scanner;

public class Practice07 {
    public static void main(String[] args) {
        /*
            10분

            입력 ex) 과목입력 : 영어  / 점수 입력 : 100 ...
            출력 ex) 영어 : 100  / 수학 : 85 ...
            1. 합산점수
            2. 평균점수
            3. 랭킹 출력
         */
        Scanner scanner = new Scanner(System.in);
        int size = 3;


        // Subject 클래스를 만들어서 배열로 선언한 후 로직 변경해보기








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
