package mid1.exception.basic.checked;

public class CheckedCatchMain {

    public static void main(String[] args) {
        Service service = new Service();

        // callCatch 메서드 내부에서 예외처리를 했기때문에 호출하는 곳까지 오지않는다.
        service.callCatch();
        System.out.println("정상종료");

        /* 예외의 흐름
        Exception in thread "main" mid.exception.basic.checked.MyCheckedException: 문제 상황  -> 어떤 예외가 발생했는지 알려줌
        at mid.exception.basic.checked.Client.call(Client.java:8)  -> 예외가 시작된 위치
        at mid.exception.basic.checked.Service.catchThrows(Service.java:19)
        at mid.exception.basic.checked.CheckedThrowMain.main(CheckedThrowMain.java:10)
        */
    }
}
