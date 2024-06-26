package basic.polymorphism.example3.messege;

import java.util.ArrayList;

public class MessageService {

    private final ArrayList<Sender> senders = new ArrayList<>();



    public void sendMessages(String content){
        System.out.println("일괄적으로 메세지를 전송합니다.");
        for (Sender sender: senders){
            sender.sendMessage(content);
        }
    }

    public void addSender(Sender sender){
        senders.add(sender);
    }
}
