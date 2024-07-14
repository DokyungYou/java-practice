package mid2.collection.compare.test.cardgame.answer;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private List<Card> handedCards;

    public Player(String name) {
        this.name = name;
        this.handedCards = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void drawCard(Deck deck){
        handedCards.add(deck.drawCard());
    }

    public int rankSum(){
        int value = 0;
        for (Card card : handedCards) {
            value += card.getRank();
        }
        return value;
    }

    public void showHand(){
        handedCards.sort(null);
        System.out.println(name +"의 카드: " + handedCards + "  합계:  " + rankSum());
    }
}
