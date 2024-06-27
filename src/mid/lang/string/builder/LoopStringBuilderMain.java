package mid.lang.string.builder;

public class LoopStringBuilderMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("Great Java Kim ");
        }
        String result = sb.toString();
        System.out.println(result);
        long endTime = System.currentTimeMillis();
        System.out.println("소요시간: " + (endTime - startTime) + "ms"); // 오... 대강 17 ~ 23ms 걸린다.
    }
}
