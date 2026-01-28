// PaymentGatewaySimulator.java
public class PaymentGatewaySimulator {

    public static void main(String[] args) {

        Payment creditCard = new CreditCardPayment();
        Payment upi = new UpiPayment();


        PaymentProcessor processor;

        processor = new PaymentProcessor(creditCard);
        processor.process(5000);

        processor = new PaymentProcessor(upi);
        processor.process(1500);

        
    }
}
