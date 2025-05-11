package entity;

import exceptions.InvalidValueException;

public class CardProcessor implements ProcessingPayment {
    public CardProcessor(){}

    @Override
    public boolean authorizePayment(double value){
        if(value <= 0){
            throw new InvalidValueException("O valor deve ser maior que zero");
        }
        System.out.println("Pagamento autorizado");
        return true;
    }

    @Override
    public boolean processPayment(double value){
        if(value <= 0){
            throw new InvalidValueException("O valor deve ser maior que zero");
        }
        System.out.println("Pagamento concluído");
        return true;
    }
}
