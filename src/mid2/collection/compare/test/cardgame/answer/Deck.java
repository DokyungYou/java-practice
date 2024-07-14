package mid2.collection.compare.test.cardgame.answer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards = new ArrayList<>();

    public Deck() {
        initCards();
        Collections.shuffle(cards);
    }

    private void initCards() {
        for (int i = 1; i <= 13; i++) {
            for (Suit value : Suit.values()) {
                cards.add(new Card(i, value));
            }
        }
    }

    public Card drawCard(){
        // 섞은 카드를 순서대로 맨 앞장의 카드를 뽑기로 하였다. (데이터의 수가 적은 편이라 ArrayList 사용)
        return cards.remove(0); // Java21에서는 removeFirst()
    }
}
