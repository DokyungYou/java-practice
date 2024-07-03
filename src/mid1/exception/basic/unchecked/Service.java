package mid1.exception.basic.unchecked;

// UnChecked 예외는 예외를 처리하거나 던지지 않아도 된다. (처리하지 않으면 자동으로 밖으로 던져짐)
public class Service {

    private final Client client = new Client();

    public void callCatch(){
        try{
            client.call();
        }catch (RuntimeException e){
            System.out.println("예외처리, message: " + e.getMessage());
        }
        System.out.println("정상 로직");
    }

    // 체크예외와 다르게 예외를 직접 던지지 않아도 자동으로 던져진다.
    public void callThrow(){
        client.call();
    }
}
