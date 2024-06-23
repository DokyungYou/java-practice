package basic.static2.example;

public class LottoMain {
    public static void main(String[] args) {

        int[] numbers1 = {5, 12, 23, 34, 41, 45};
        int[] numbers2 = {7, 14, 19, 28, 35, 42};
        int[] numbers3 = {2, 9, 16, 25, 33, 40};
        int[] numbers4 = {1, 11, 21, 31, 37, 44};
        int[] numbers5 = {3, 8, 15, 22, 29, 36};
        int[] longNumbers = {100, 10, 18, -1, 32, 39};

        Lotto lotto1 = new Lotto(numbers1);
        Lotto lotto2 = new Lotto(numbers2);
        Lotto lotto3 = new Lotto(numbers3);
        Lotto lotto4 = new Lotto(numbers4);
        Lotto lotto5 = new Lotto(numbers5);
        Lotto lotto6 = new Lotto(longNumbers);

        Lotto.showTotalSaleCount();

    }
}
