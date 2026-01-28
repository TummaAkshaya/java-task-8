// PaymentProcessor.java
public class PaymentProcessor {

    private Payment payment;

    public PaymentProcessor(Payment payment) {
        this.payment = payment;
    }

    public void process(double amount) {
        System.out.println("🔔 Processing via: " + payment.getPaymentMode());
        boolean status = payment.pay(amount);

        if (status) {
            System.out.println("🎉 Payment Successful\n");
        } else {
            System.out.println("⚠ Payment Failed\n");
        }
    }
}
