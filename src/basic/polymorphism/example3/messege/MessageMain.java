package basic.polymorphism.example3.messege;

public class MessageMain {
    public static void main(String[] args) {

        MessageService company = new MessageService();
        company.addSender(new EmailSender());
        company.addSender(new SmsSender());
        company.addSender(new FaceBookSender());

        company.sendMessages("여름맞이 이벤트!");
    }
}
