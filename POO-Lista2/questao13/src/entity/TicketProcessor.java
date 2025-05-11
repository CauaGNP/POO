package entity;

import exceptions.InvalidValueException;

public class TicketProcessor implements ProcessingPayment {
    public TicketProcessor(){}

    @Override
    public boolean authorizePayment(double value){
        if(value <= 0){
            throw new InvalidValueException("O valor deve ser maior que zero");
        }
        System.out.println("Pagamento por boleto autorizado");
        return true;
    }

    @Override
    public boolean processPayment(double value){
        if(value <= 0){
            throw new InvalidValueException("O valor deve ser maior que zero");
        }
        System.out.println("Pagamento por boleto concluído");
        return true;
    }
}
