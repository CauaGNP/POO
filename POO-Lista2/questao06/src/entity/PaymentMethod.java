package entity;

import exeptions.ErrorValueException;

public abstract class PaymentMethod {

    private double rate;

    public PaymentMethod(double rate){
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public abstract boolean paymentProcess(double value);

    public double calculateRate(double value) {
        if(rate == 0){
            return value;
        }
        return value * rate;
    }
}
