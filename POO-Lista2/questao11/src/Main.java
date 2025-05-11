import entity.*;

public class Main {
    public static void main(String[] args) {
        SendMessage email = new SendEmail();
        SendMessage sms = new SendSMS();
        SendMessage whatsapp = new SendWhatsApp();

        MessageManager.sendMessage(email, "Olá por e-mail!");
        MessageManager.sendMessage(sms, "Mensagem de texto.");
        MessageManager.sendMessage(whatsapp, "Mensagem no WhatsApp.");
    }
}