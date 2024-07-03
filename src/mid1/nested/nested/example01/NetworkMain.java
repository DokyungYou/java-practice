package mid1.nested.nested.example01;

public class NetworkMain {
    public static void main(String[] args) {
        
        // main 에서 NetworkMessage 클래스는 전혀 사용되지 않는 상태 (Network 내부에서만 쓰이고있음)
        Network network = new Network();
        network.sendMessage("Great JavaKim");


        /*
        Network 클래스 내부에서만 쓰이는 NetworkMessage 클래스가 외부의 별개의 클래스로 존재 시
        처음 코드를 접할 때
        - 다른 여러곳에서도 사용이 되겠구나
        - NetworkMessage 클래스 생성자를 별도로 만든 다음 뭔가를 해야하나?
        라는 등의 불필요한 과정을 거치게 됨
        */



    }
}
