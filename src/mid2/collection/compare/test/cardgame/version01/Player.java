package mid2.collection.compare.test.cardgame.version01;

public class Player implements Comparable<Player>{

    private int number;
    private Card[] pickedCard;

    private int totalScore;

    public Player(int number, int numberOfDrawCard) {
        this.number = number;
        this.pickedCard = new Card[numberOfDrawCard];
    }

    public Card[] getPickedCard() {
        return pickedCard;
    }

    public int getNumber(){
        return number;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void addScore(int score) {
        this.totalScore += score;
    }

    @Override
    public int compareTo(Player o) {
        return Integer.compare(o.totalScore, this.totalScore);
        //return this.totalScore < o.totalScore ? 1 : (this.totalScore == o.totalScore ? 0 : -1);

    }
}
