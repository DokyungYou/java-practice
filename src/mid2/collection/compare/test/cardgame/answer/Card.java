package mid2.collection.compare.test.cardgame.answer;

public class Card implements Comparable<Card> {

    private final int rank; // 카드 숫자
    private final Suit suit;

    public Card(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public int compareTo(Card anotherCard) { // 오버라이딩 시 매개변수의 이름은 상관없음
        
        // 순자 먼저 비교 후, 같으면 문양 비교
        if(this.rank != anotherCard.rank){
            return Integer.compare(this.rank, anotherCard.rank);
        }else {
            return this.suit.compareTo(anotherCard.suit);
            // Enum 클래스는 이미 Comparable 를 구현 중 (enum의 ordinal 기준으로 비교)
            // public final int compareTo(E o)
        }
    }

    @Override
    public String toString() {
        return rank +"(" + suit.getIcon() + ")";
    }
}
