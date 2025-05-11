package entity;

import exceptions.ValueEmptyException;

public class SendWhatsApp implements SendMessage {
    private String status;
    public SendWhatsApp(){}

    @Override
    public boolean send(String message){
        if (message == null || message.trim().isEmpty()) {
            throw new ValueEmptyException("A mensagem não pode ser vazia");
        }
        System.out.println("Enviando mensagem WhatsApp: " + message);
        status = "Mensagem whatsapp enviado com sucesso";
        return true;
    }

    @Override
    public String getStatus(){
        return status;
    }
}
