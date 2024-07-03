package mid.exception.basic.checked;

public class CheckedThrowsMain {
    public static void main(String[] args) throws Exception{

        Service service = new Service();

        service.catchThrows();
        System.out.println();
        System.out.println("정상종료");
    }
}


