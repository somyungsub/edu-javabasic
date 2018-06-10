package day03.singleton;

/*
    싱글턴 패턴
    - 객체의 메모리를 1개만 점유하여 재 사용하는 패턴
 */
public class DBConection {
    private static DBConection singleton; // 자기자신
    private DBConection(){
        System.out.println("인스턴스 생성");
    }

    // static으로 선언하여 ->Stack 메모리영역에 할당 -> 인스턴스를 생성하지 않고 메서드를 참조
    public static DBConection getInstance(){
        if (singleton == null) {
            singleton = new DBConection();    // null 인 경우만 객체를 생성
        }
        return singleton;   // 클래스변수 반환
    }
}
