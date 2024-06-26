package mid.lang.object.tostring;

public abstract class ObjectPrinter {
    public static void print(Object obj){
        String str = "객체 정보 출력: " + obj.toString();
        System.out.println(str);
    }
}
