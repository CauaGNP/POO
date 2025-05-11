package entity;
public class MessageManager {
    public MessageManager(){}

    public static boolean sendMessage(SendMessage sendMenssage, String message){
        boolean sended = sendMenssage.send(message);
        System.out.println(sendMenssage.getStatus());
        return sended;
    }
}
