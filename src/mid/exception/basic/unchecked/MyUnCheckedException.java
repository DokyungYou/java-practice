package mid.exception.basic.unchecked;


// RunTimeException 을 상속받은 예외는 언체크 예외
public class MyUnCheckedException extends RuntimeException{
    public MyUnCheckedException(String message) {
        super(message);
    }
}
