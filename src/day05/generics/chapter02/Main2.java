package day05.generics.chapter02;

public class Main2 {
    public static void main(String[] args) {
        /*
            2. 제네릭 메서드
             - 제네릭스를 통해 와.. 소스가 얼마나 간결해지고, 중복성을 없앨 수 있는지 느끼시면 됩니다.
             - 현재로서는 아직 익숙하지 않으시기 떄문에 보고 이해하고 차후에 다시 한번 소스를 보시기를 권합니다.
             - 개발자의 꿈을 가지고 계시다면 제네릭스 문법은 차후에 꼭 아시고 활용 하실 줄 아셔야합니다.
         */
        System.out.println("------ Integer 확인 --------");
        Integer[] num = {1, 2, 3, 4, 5, 6};
        GenericMethod.swap(num, 0, num.length - 1); // 처음과 맨마지막을 swap
        GenericMethod.printArray(num);  // 출력

        System.out.println("------ String 확인 --------");
        String[] str = {"안녕", "하세요", "제네릭스가 나오면서 많은 변화가 생겼습니다."};
        GenericMethod.swap(str, 0, 1);    // 0번쨰와 1번째 스왑
        GenericMethod.printArray(str);          // 출력

        System.out.println("------ Character 확인 --------");
        Character[] ch = {'a', 'b', 'c', 'd', 'e'};
        GenericMethod.swap(ch, 2, 3);    // 2번쨰와 3번째 스왑
        GenericMethod.printArray(ch);          // 출력

        // ..... 다양하게 만들어 낼 수 있습니다.
    }
}
