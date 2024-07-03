package mid.exception.basic.unchecked;

public class Client {
    public void call(){
        throw new MyUnCheckedException("언체크 예외 발생");
    }
}
