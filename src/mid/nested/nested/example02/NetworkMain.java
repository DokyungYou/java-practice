package mid.nested.nested.example02;

public class NetworkMain {
    public static void main(String[] args) {
        
        // main 에서 NetworkMessage 클래스는 전혀 사용되지 않는 상태 (Network 내부에서만 쓰이고있음)
        Network network = new Network();
        network.sendMessage("Great JavaKim");

    }
}
