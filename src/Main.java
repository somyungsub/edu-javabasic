public class Main {
    public static void main(String[] args) {
        /*
            딱딱이 테스트하기 멍충아
         */
        System.out.println(TtackTtack.BABO_TTACK_TTACK);
        System.out.println(TtackTtack.BABO_TTACK_TTACK.getCode());
        System.out.println(TtackTtack.TTACK_TTACK);
        System.out.println(TtackTtack.TTACK_TTACK.getCode());
        System.out.println(TtackTtack.TTACK_TTACK_CLASS);
        System.out.println(TtackTtack.TTACK_TTACK_CLASS.getCode());

        System.out.println("---- value 배열로 뽑기-----");
        for (TtackTtack ttack : TtackTtack.values()) {
            System.out.println(ttack.getCode());
        }

        System.out.println("---- Enum 타입체크 -----");
        if (TtackTtack.TTACK_TTACK_CLASS.getCode().equals("딱딱이클라스보기~ㅋㅋ")) {
            System.out.println("나는 딱딱이클라스보기~ㅋㅋ ");
        }
        if (TtackTtack.TTACK_TTACK.getCode().equals("딱딱이")) {
            System.out.println("나는 딱딱이");
        }
        if (TtackTtack.BABO_TTACK_TTACK.getCode().equals("바보딱딱이")) {
            System.out.println("나는 바보 딱딱이에요~ 성국 바보");
        }
    }
}
