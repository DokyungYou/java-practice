package mid1.lang.string.example;

public class Example09 {
    public static void main(String[] args) {
        // 문자를 분리하고  "문자" * "문자" * "문자" 로 만들기
        String vegetables = "carrot,leek,lettuce,zucchini,radish";

        String result = String.join(" * ", vegetables.split(",") );
        System.out.println(result);


        // 뒤집기
        StringBuilder sb = new StringBuilder(result);
        System.out.println("뒤집기: " + sb.reverse());
    }
}
