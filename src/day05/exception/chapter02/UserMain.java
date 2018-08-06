package day05.exception.chapter02;

public class UserMain {
    public static void main(String[] args) throws UserException {
        int a = 10;
        int b = 0;

        if (b == 0) {
            throw new UserException("0으로 나누면 에러가 납니다.");
        }

        System.out.println(a / b);
//        if (b != 0) {
//        }
//        System.out.println("aa");


    }
}
