package basic.polymorphism.example3.messege;

public class EmailSender implements Sender{

    @Override
    public void sendMessage(String content) {
        System.out.println("이메일 발송: " + content);
    }

}
