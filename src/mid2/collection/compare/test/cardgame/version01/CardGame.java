package mid2.collection.compare.test.cardgame.version01;

import java.util.*;

public class CardGame { // 단순한 카드 뽑기 게임으로 만들었다.

    private static final int TOTAL_NUMBER_OF_CARD = 52;
    private static final int maxCardNum = 13;

    private final List<Card> cards;

    private List<Player> players;


    public CardGame() {
        this.cards = new ArrayList<>(TOTAL_NUMBER_OF_CARD);

        for (CardSuit value : CardSuit.values()) {
            for (int i = 1; i <= maxCardNum; i++) {
                cards.add(new Card(value, i));
            }
        }
        System.out.println("초기화 상태: " + cards);
    }

    private void settingGame(int numberOfPlayer, int numberOfDrawCard){
        if(numberOfPlayer < 1 || numberOfDrawCard < 1){
            System.out.println("잘못된 세팅");
            return;
        }
        if((TOTAL_NUMBER_OF_CARD / numberOfPlayer) < numberOfDrawCard){
            System.out.println("잘못된 세팅");
            return;
        }

        this.players = new ArrayList<>();
        for (int i = 0; i < numberOfPlayer; i++) {
            players.add(new Player((i + 1), numberOfDrawCard));
        }

    }

    private void pickCard(){
        boolean[] pickedNums = new boolean[TOTAL_NUMBER_OF_CARD]; // 뽑히면 true 로 바꾸기
        Random random = new Random();

        for (Player player : players) {
            Card[] playerCards = player.getPickedCard();

            for (int i = 0; i < playerCards.length; i++) {
                int randomNum = random.nextInt(52);
                System.out.println(i + "번: "+ "뽑은 수: " + randomNum);
                if(!pickedNums[randomNum]){

                    pickedNums[i] = true;
                    playerCards[i] = cards.get(randomNum);

                    player.addScore(cards.get(randomNum).getNumber());

                }else {
                    i--;
                }
            }

            Arrays.sort(playerCards);
            System.out.println("카드 결과: " + Arrays.toString(playerCards));
            System.out.println();
        }
    }

    private void showResult(){

        for (int i = 0; i < players.size(); i++) {

            Player player = players.get(i);
            System.out.println("player" + (i+1) + ": "
                    + Arrays.toString(player.getPickedCard())
                    + ", totalScore: " + player.getTotalScore()
            );
        }
        printRanking();
    }

    private void sortRanking(){

        players.sort(null);
    }

    private void printRanking(){
        sortRanking();
        System.out.println("== 순위 ==");
        for (int i = 0; i < players.size(); i++) {
            Player player = players.get(i);
            System.out.printf("%02d위: %s번 플레이어 - 점수: %d점 \n", (i+1), player.getNumber(), player.getTotalScore());
        }
    }

    private void shuffleCards(){
        Collections.shuffle(cards);
    }


    public void start(int playerNumber, int numberOfDrawCard){

        shuffleCards();
        System.out.println("섞은 상태: " + cards);

        settingGame(playerNumber, numberOfDrawCard);
        pickCard();
        showResult();
    }
}
