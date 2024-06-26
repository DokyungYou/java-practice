package basic.polymorphism.example3.messege;

public class SmsSender implements Sender{
    @Override
    public void sendMessage(String content) {
        System.out.println("SMS 발송: " + content);
    }
}
