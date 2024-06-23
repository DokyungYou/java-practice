package basic.static2;


// 속성없이 단순히 기능만을 제공한다.
// 서로 다른 속성값의 여러 인스턴스가 필요한 상황 X
// 해당 클래스의 기능을 여러곳에서 사용
public class DecorationUtil {

    public static String decorateString(String string){
        return "** " + string + " **";
    }
}
