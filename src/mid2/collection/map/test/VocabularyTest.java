package mid2.collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 영단어장 만들기
public class VocabularyTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> vocabulary = new HashMap<>();

        while (true){
            System.out.println("영단어 추가 - 'a' ");
            System.out.println("영단어 검색 - 's' ");
            System.out.println("나가기 - 'q' ");

            switch(scanner.nextLine()){
                case "a":
                    addWord(scanner, vocabulary);
                    break;
                case "s":
                    searchWord(scanner, vocabulary);
                    break;
                case "q":
                    System.out.println("종료합니다.");
                    scanner.close();
                    return;
                default:
                    System.out.println("잘못된 입력");
            }
        }
    }
    private static void addWord(Scanner scanner,  Map<String, String> vocabulary){
        System.out.println("== add word ==");
        while (true){
            System.out.println("영어 단어를 입력하세요. (exit - press 'q')");
            String englishWord = scanner.nextLine();
            if(englishWord.equals("q")) return;

            if(englishWord.matches("^[a-zA-Z]+$")){
                System.out.println("뜻을 입력하세요.");
                String meaning = scanner.nextLine();
                vocabulary.put(englishWord, meaning);
            }else {
                System.out.println("유효하지 않는 문자포함");
            }
        }
    }

    private static void searchWord(Scanner scanner,  Map<String, String> vocabulary){
        System.out.println("== search word ==");
        while (true){
            System.out.println("영어 단어를 입력하세요. (exit - press 'q')");
            String englishWord = scanner.nextLine();
            if(englishWord.equals("q")) return;

            String meaning = vocabulary.get(englishWord);
            if(meaning == null){
                System.out.println(englishWord + ": 단어장에 존재하지 않는 단어입니다.");
            }else {
                System.out.println(englishWord + ": " + meaning);
            }
        }
    }
}
