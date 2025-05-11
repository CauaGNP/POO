package entity;

import exceptions.ValueEmptyException;

public class SendSMS implements SendMessage {
    private String status;
    public SendSMS(){}

    @Override
    public boolean send(String message){
        if (message == null || message.trim().isEmpty()) {
            throw new ValueEmptyException("A mensagem não pode ser vazia");
        }
        System.out.println("Enviando SMS: " + message);
        status = "SMS enviado com sucesso";
        return true;
    }

    @Override
    public String getStatus(){
        return status;
    }
}
