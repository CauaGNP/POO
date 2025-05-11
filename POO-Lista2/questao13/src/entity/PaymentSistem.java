package entity;

public class PaymentSistem {
    public PaymentSistem(){}

    public boolean makePayment(ProcessingPayment process, double value){
        boolean paymentProcess= process.authorizePayment(value);
        return paymentProcess;
    }
}
