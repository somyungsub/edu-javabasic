package day03.practice.extend1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
            실생활 활용 연습 : 라면 조리하기

            1. 상위클래스(일반적인) 라면 클래스만들기

            2. 하위클래스 치즈라면, 떡라면, 만두라면 클래스만들기

            3. 클래스 정보
                - 라면 이름
                - 재료 (만두,치즈,떡), 추가공통재료(파, 계란)

            4. 클래스 기능구현 및 제약
                - cookRamyeon (조리)              - 오버라이딩
                - addItemRecipe (추가재료설명)    - 공통

            5. 실행순서
               5.1. 라면선택    - 상위클래스에 공통정보 (라면이름, 라면가격)
               5.2. 재료선택    - 선택에 따른 하위클래스 생성 (다형성이용)       **
               5.3. 조리하기    - 오버라이딩 하여 해당 클래스별로 조리방식 설명  **

            (추가)
            6. 각 하위클래스에서 구현된 cookRamyeon에 공통메서드로 상위에 explainRamyeon 구현해보기
         */
        Scanner scanner = new Scanner(System.in);



        while (true) {
            System.out.print("라면선택 (1. 신라면\t 2. 안성탕면\t 3. 삼양라면\t 이외.종료) : ");
            int selectType = scanner.nextInt();

            if (selectType != 1 && selectType != 2 && selectType != 3) {
                System.out.println("잘못입력했습니다. 프로그램 종료!");
                break;
            }

            System.out.print("재료선택 (1. 만두\t 2. 치즈\t 3. 떡) : ");
            String selectItem = getItem(scanner);

            System.out.print("추가재료선택 (y/n) ? ");
            Ramyeon selectRamyeon = getRaymeon(scanner, getName(selectType), selectItem);
            selectRamyeon.cookRamyeon();
        }

    }


    // 선택 라면 번호에 따른 라면이름 출력
    private static String getName(int num) {
        if (num == 1) {
            return "신라면";
        } else if (num == 2) {
            return "안성탕면";
        } else if (num == 3) {
            return "삼양라면";
        } else {
            return "잘못된 정보가 들어왔습니다.";
        }
    }

    // 재료선택
    private static String getItem(Scanner scanner) {
        while (true) {
            int num = scanner.nextInt();
            if (num == 1) {
                return "만두";
            } else if (num == 2) {
                return "치즈";
            } else if (num == 3) {
                return "떡";
            } else {
                System.out.println("잘못된 정보가 들어왔습니다.");
                continue;
            }
        }
    }

    // 라면 얻기
    private static Ramyeon getRaymeon(Scanner scanner, String selectName, String selectItem) {
        boolean addFlg = false;
        while (true) {
            String yn = scanner.next();
            if ("y".equals(yn.trim().toLowerCase())) {
                addFlg = true;
                break;
            } else if ("n".equals(yn.trim().toLowerCase())){
                addFlg = false;
                break;
            } else{
                System.out.println("잘못된 내용 입력 다시 입력해주세요!");
                continue;
            }
        }

        // 하위객체 생성하기
        if ("만두".equals(selectItem)) {
            return new ManduRamyeon(selectName, addFlg, selectItem);    // 만두라면 생성
        }
        else if ("치즈".equals(selectItem)) {
            return new CheeseRaymeon(selectName, addFlg, selectItem);   // 치즈라면 생성
        } else if ("떡".equals(selectItem)) {
            return new MochiRamyeon(selectName, addFlg, selectItem);    // 떡라면 생성
        }
        else {
            System.out.println("데이터가 잘못들어온 경우 처리하기");
            System.out.println("null 반환은 객체생성을 하지 않았다는 의미. 어떤 메모리주소값도 반환하지 않았음을 의미");
            return  null;
        }

    }
}
