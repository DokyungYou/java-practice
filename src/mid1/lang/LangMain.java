package mid1.lang;

public class LangMain {
    public static void main(String[] args) {
        System.out.println("System 클래스는 Lang 패키지에 속한다.");
        
        Object str = "String 클래스";
        System.out.println(str.toString());

        /* Object의 toString()
        *  public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
         }
        * */
    }
}
