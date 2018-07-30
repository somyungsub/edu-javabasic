

public enum TtackTtack {

    /** 딱딱이 */
    TTACK_TTACK("딱딱이"),
    /** 바보 딱딱이 */
    BABO_TTACK_TTACK("바보딱딱이"),
    /**
     * 딱딱이 클라스보소~
     */
    TTACK_TTACK_CLASS("딱딱이클라스보기~ㅋㅋ");

    private String code;

    TtackTtack(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

}
