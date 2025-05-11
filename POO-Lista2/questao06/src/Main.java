import entity.*;
import repositories.PaymentSystem;

public class Main {
    public static void main(String[] args) {
        CreditCard c = new CreditCard(0.3);
        Fetlock f = new Fetlock();
        Pix p = new Pix();

        PaymentSystem pay = new PaymentSystem();
        pay.makePayment(c, 200);
        pay.makePayment(f, 200);
        pay.makePayment(p, 200);
    }
}