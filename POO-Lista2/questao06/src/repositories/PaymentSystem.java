package repositories;

import entity.PaymentMethod;

public class PaymentSystem {

    public boolean makePayment(PaymentMethod paymentMethod, double value){
        boolean payment = paymentMethod.paymentProcess(value);

        if(payment){
            System.out.println("Pagamento realizado");
            System.out.println("Taxa aplicada: " + paymentMethod.getRate());
            return true;
        }else{
            System.out.println("Pagamento negado");
            return false;
        }
    }

}

