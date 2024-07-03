package mid1.lang.string.example;

public class Example04 {
    public static void main(String[] args) {

        // hello 와 .txt 분리
        String str = "hello.txt";
        String hello = str.substring(0, str.indexOf(".txt"));
        String txt = str.substring(str.indexOf(".txt"));

        System.out.println(hello);
        System.out.println(txt);


    }
}
