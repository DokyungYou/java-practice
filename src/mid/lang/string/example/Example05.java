package mid.lang.string.example;

public class Example05 {
    public static void main(String[] args) {

        // str에서 key로 주어지는 문자를 찾고, 찾은 문자의 수 출력
        String str = "start Great JavaKim, Great springKim, Great jpaKim";
        String key = "Great";

        // 내 풀이
        int keyCount = 0;
        int index = 0;
        while (true){
            int keyIndex = str.indexOf(key, index);
            if(keyIndex == -1) break;

            keyCount++;
            index = keyIndex + key.length();
        }
        System.out.println("Great의 개수: " + keyCount);


        // 해답
        int count = 0;
        int idx = str.indexOf(key); // 첫번째 key 없다면 반복문 진입 X
        while (idx >= 0) {
            idx = str.indexOf(key, idx + 1); // 다음 key 존재 여부를 위함
            count++;
        }
        System.out.println("count = " + count);
    }
}
