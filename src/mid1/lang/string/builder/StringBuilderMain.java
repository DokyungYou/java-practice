package mid1.lang.string.builder;

public class StringBuilderMain {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        // 가변 클래스여서 메서드 사용 후 꼭 반환받지 않아도 된다.

        // 추가 append
        sb.append("a");
        sb.append("b");
        sb.append("c");
        sb.append("d");
        sb.append("e");
        System.out.println("sb: " +sb);  // abcde

        // 삽입 insert
        sb.insert(0, "Java!");
        System.out.println("sb: " +sb);  // Java!abcde

        // 삭제 delete
        sb.delete(5, sb.length());
        System.out.println("sb: " +sb);  // Java!

        // 뒤집기 reverse
        sb.reverse();
        System.out.println("sb: " +sb);  // !avaJ
        sb.reverse();

        // StringBuilder -> String
        String result = sb.toString();  // 마지막에 불변객체로 바꾸기
        System.out.println("result: " + result);
    }
}
