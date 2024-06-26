package basic.polymorphism.example3.messege;

public class FaceBookSender implements Sender{
    @Override
    public void sendMessage(String content) {
        System.out.println("페이스북 메세지 발송: "+ content);
    }
}
