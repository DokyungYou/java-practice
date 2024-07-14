package mid2.collection.compare.test.cardgame.version01;

public enum CardSuit {
    SPADE("♠","\u2660",1),
    HEART("♥","\u2665",2),
    DIAMOND("♦","\u2666",3),
    CLOVER("♣","\u2663",4),

    ;

    private String pattern;

    private String code;

    private int order;

    CardSuit(String pattern, String code, int order) {
        this.pattern = pattern;
        this.code = code;
        this.order = order;
    }

    public String getPattern() {
        return pattern;
    }

    public String getCode() {
        return code;
    }

    public int getOrder() {
        return order;
    }
}
