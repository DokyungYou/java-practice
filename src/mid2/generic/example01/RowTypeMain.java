package mid2.generic.example01;

public class RowTypeMain {
    public static void main(String[] args) {
        // 타입인수를 넘기지 않고 생성  -> row type(원시 타입) -> 매개타입변수가 Object 로 사용됨 (권장 X)
        GenericBox genericBox = new GenericBox();
        
        GenericBox<Object>  objectGenericBox = new GenericBox<>(); // 권장 O
    }

}
