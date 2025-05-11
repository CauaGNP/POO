package entity;

import exceptions.*;

public class SendEmail implements SendMessage {
    private String status;
    public SendEmail(){}

    @Override
    public boolean send(String message){
        if (message == null || message.trim().isEmpty()) {
            throw new ValueEmptyException("A mensagem de e-mail não pode ser vazia");
        }
        System.out.println("Enviando o email: " + message);
        status = "Email enviado";
        return true;
    }
    public String getStatus(){
        return status;
    }

}
