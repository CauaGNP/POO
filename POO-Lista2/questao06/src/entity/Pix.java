package entity;

import exeptions.ErrorValueException;

public class Pix extends PaymentMethod{
    public Pix(){
        super(0);
    }

    @Override
    public boolean paymentProcess(double value){
        if(value <= 0){
            throw new ErrorValueException("Erro ao tentar realizar o processo de credito");
        }
        System.out.println("Pagamento feito" + value);
        return true;
    }
}
