package mid2.collection.compare.test.cardgame.answer;

public enum Suit {
    // enum 클래스는 자동으로 Enum class 를 상속
    // public abstract class Enum<E extends Enum<E>> implements Comparable<E>, Serializable
    SPADE("♠"),
    HEART("♥"),
    DIAMOND("♦"),
    CLOVER("♣"),
    ;

    private String icon;


    Suit(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }


}
