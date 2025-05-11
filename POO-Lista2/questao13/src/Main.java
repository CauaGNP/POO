import entity.*;

public class Main {
    public static void main(String[] args){

        ProcessingPayment card = new CardProcessor();
        ProcessingPayment pix = new PixProcessor();
        ProcessingPayment ticket = new TicketProcessor();
        PaymentSistem paymentSistem = new PaymentSistem();

        paymentSistem.makePayment(card, 100);
        paymentSistem.makePayment(pix, 40);
        paymentSistem.makePayment(ticket, 500);

    }
}
