package exam;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[10];    // 변수 arr를 선언하고 자료형 int 크기 10개를 할당.
        int[] arr2 = {10,2,55};
//        System.out.println(arr);
//        System.out.println(arr.length);

//        arr[0] = 15;
//        arr[1] = 20;
        System.out.println("-------------------------------");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        int[][] num = { {10 , 20 } , {30 } , { 40 , 50 } };
//        num = new int[3][];
        System.out.println(num.length); // 행갯수  3
        System.out.println(num[0].length);  //2
        System.out.println(num[1].length);  //1
        System.out.println(num[2].length);  //2
        System.out.println("-------------------------------");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.println(num[i][j]);
            }
        }


//        String [][] name = { {"홍길동", "이순신"} , {"이순신"}};
//        System.out.println(name.length);
//        System.out.println(name[0].length);
//        System.out.println(name[1].length);


    }
}
