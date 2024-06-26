package mid.lang.object.tostring;

public class ToStringMain01 {
    public static void main(String[] args) {
        Object obj = new Object();
        String objStr = obj.toString();

        // Object toString()
        // return getClass().getName() + "@" + Integer.toHexString(hashCode());    일단 지금은 hashCode()는 객체의 참조값 정도로 이해
        System.out.println(objStr); // java.lang.Object@3ac3fd8b
        
        // obj 직접 출력
        System.out.println(obj); // java.lang.Object@3ac3fd8b
        
        
    /*
        println(객체) 과 객체.toString()의 출력결과가 같은 이유:
        System.out.println() 은 내부적으로 toString() 호출

        내부로 들어가보면
        String s = String.valueOf(x); -> String.valueOf() 의 반환값은   return (obj == null) ? "null" : obj.toString();

        결론: 굳이  print 메서드에 (객체.toString()) 를 넘길 필요없이  바로 객체를 넣어서 출력하면 된다.
     */
    }
}
