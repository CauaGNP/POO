package entity;

import exceptions.InvalidValueException;

public class ProcessadorPix implements ProcessingPayment {
    public ProcessadorPix(){}

    @Override
    public boolean authorizePayment(double value){
        if(value <= 0){
            throw new InvalidValueException("O valor deve ser maior que zero");
        }
        System.out.println("Pagamento por pix autorizado");
        return true;
    }

    @Override
    public boolean processPayment(double value){
        if(value <= 0){
        throw new InvalidValueException("O valor deve ser maior que zero");
    }
        System.out.println("Pagamento pix concluído");
        return true;
    }
}
