package mid2.collection.compare.test.cardgame.version01;

public class Card implements Comparable<Card>{

    private CardSuit suit;
    private int number;

    public Card(CardSuit suit, int number) {
        this.suit = suit;
        this.number = number;
    }

    public CardSuit getSuit() {
        return suit;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int compareTo(Card o) {
        if(this.number < o.number){
            return -1;
        }else if(this.number > o.number){
            return 1;
        }else {
            if(this.suit.getOrder() < o.suit.getOrder()){
                return -1;
            }else {
                return 1;
            }
        }
    }

    @Override
    public String toString() {
        return number + "(" + this.suit.getPattern() + ")";
    }
}
