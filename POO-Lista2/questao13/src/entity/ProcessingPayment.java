package entity;

public interface ProcessingPayment {
    boolean authorizePayment(double value);
    boolean processPayment(double value);
}
