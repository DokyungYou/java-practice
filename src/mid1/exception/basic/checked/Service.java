package mid1.exception.basic.checked;

public class Service {
    private final Client client = new Client();

    public void callCatch(){

        try{
            client.call();
        } catch (MyCheckedException e){
            System.out.println("예외처리, message: " + e.getMessage());
        }
        System.out.println("예외를 처리한 후엔 정상 로직으로 내려온다.");
    }


    // 현 위치에서 예외를 잡지 않는다면 밖으로 던져야한다.
    public void catchThrows() throws MyCheckedException{
        client.call();
    }
}
