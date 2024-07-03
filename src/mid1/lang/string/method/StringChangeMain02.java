package mid1.lang.string.method;

public class StringChangeMain02 {
    public static void main(String[] args) {

        String strWithSpaces = "      Java     Programming   ";
        System.out.println("소문자변환: "+ strWithSpaces.toLowerCase());
        System.out.println("대문자변환: " + strWithSpaces.toUpperCase());

        
        // trim, strip ==========================================================
        // 문자열 양쪽 끝 공백 제거
        // strip 은 유니코드공백문자까지 제거
        System.out.println("공백제거: " + strWithSpaces.trim());  // Java     Programming
        System.out.println("공백제거: " + strWithSpaces.strip()); // Java     Programming
        System.out.println("앞 공백제거: " + strWithSpaces.stripLeading());  // Java     Programming   |
        System.out.println("뒤 공백제거: " + strWithSpaces.stripTrailing()); //       Java     Programming
    }
}
