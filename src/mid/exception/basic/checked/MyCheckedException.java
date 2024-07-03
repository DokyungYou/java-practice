package mid.exception.basic.checked;

// Exception을 상속받은 예외는 check예외가 된다.
public class MyCheckedException extends Exception {
    public MyCheckedException(String message) {
        super(message);
    }
}
