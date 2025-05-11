package entity;

import exeptions.ErrorValueException;

public class CreditCard extends PaymentMethod{

    public CreditCard(double rate){
        super(rate);
    }

    @Override
    public boolean paymentProcess(double value){
        if(value <= 0){
            throw new ErrorValueException("Erro ao tentar realizar o processo de credito");
        }
        if(getRate() > 0.2){
            return false;
        }
        double valeuWithRate = value + calculateRate(value);
        System.out.println("Valor total" + valeuWithRate);
        return true;
    }
}
