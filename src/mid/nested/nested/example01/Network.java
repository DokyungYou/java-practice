package mid.nested.nested.example01;

public class Network {
    public void sendMessage(String text){
        NetworkMessage message = new NetworkMessage(text);
        message.print();
    }
}
