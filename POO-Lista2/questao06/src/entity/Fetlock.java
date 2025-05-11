package entity;

import exeptions.ErrorValueException;

public class Fetlock extends PaymentMethod{

    public Fetlock(){
        super(0.5);
    }

    @Override
    public boolean paymentProcess(double value){
        if(value <= 0){
            throw new ErrorValueException("Erro ao tentar realizar o processo de credito");
        }
        double valueWithRate = value + calculateRate(value);
        System.out.println("Pagamento feito: " + valueWithRate);
        return true;
    }
}
