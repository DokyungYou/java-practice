package mid1.nested.nested.example02;

public class Network {

    public void sendMessage(String text){
        NetworkMessage message = new NetworkMessage(text);
        message.print();
    }


    private static class NetworkMessage { // 중첩이면서 private -> Network 내부에서 단독사용하는 클래스로 바로 인지가능
        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }
        public void print(){
            System.out.println(content);
        }
    }

}
