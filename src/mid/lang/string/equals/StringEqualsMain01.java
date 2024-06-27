package mid.lang.string.equals;

public class StringEqualsMain01 {
    public static void main(String[] args) {

        String str1 = new String("java");
        String str2 = new String("java");
        System.out.println("new String() == 비교: " + (str1 == str2));  //false
        System.out.println("new String() equals 비교: "+ str1.equals(str2));  // String 에서 equals() 오버라이딩 돼있음

        String str3 = "java";
        String str4 = "java";
        System.out.println("리터럴 == 비교: "+ (str3 == str4)); // true
        System.out.println("리터럴 equals 비교: "+ str3.equals(str4)); // true


        // 문자열 풀:  JVM(Java Virtual Machine)의 힙 메모리 영역에 위치하며, 문자열 리터럴을 저장하는 공간

        // 1. 문자열 리터럴 사용 -> 문자열 풀에서 해당 문자열을 가진 String 인스턴스를 찾는다. (없다면 이 때 문자열 풀에 인스턴스를 만든다.)
        // 2. 문자열 풀에서 찾은 인스턴스의 참조값을 반환
        // 결론: 문자열을 리터럴로 생성 시 같은 모양의 문자열이면 같은 주소값을 가진다.
    }
}
