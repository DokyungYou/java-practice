package mid1.lang.string.method;

public class StringSearchMain {
    public static void main(String[] args) {
        String str = "Great Java Kim of Java World!";

        // contains =====================================================
        System.out.println("str.contains(World): " + str.contains("World"));
        System.out.println("str.contains(world): " + str.contains("world"));

        // indexOf =======================================================
        System.out.println("Java 의 첫 번째 인덱스: " + str.indexOf("Java")); // 6 ( 6번 인덱스에서 처음 나타난다. )
        System.out.println("Java 의 두 번째 인덱스: " + str.indexOf("Java",str.indexOf("Java") + 1));


        // lastIndexOf ====================================================
        System.out.println("Java가 마지막으로 나타나는 인덱스 " + str.lastIndexOf("Java")); // 18
        System.out.println("Java가 마지막에서 두번째로 나타나는 인덱스 " + str.lastIndexOf("Java", str.lastIndexOf("Java") -1)); // 17번 인덱스를 마지막으로 두고 역순으로 찾기
    }
}
