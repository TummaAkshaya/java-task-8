
// CreditCardPayment.java
public class CreditCardPayment implements Payment, Refundable {

    @Override
    public boolean pay(double amount) {
        if (amount <= 0) {
            System.out.println("❌ Invalid Credit Card payment amount");
            return false;
        }
        System.out.println("✅ Paid ₹" + amount + " using Credit Card");
        return true;
    }

    @Override
    public void refund(double amount) {
        System.out.println("🔁 Refunded ₹" + amount + " to Credit Card");
    }

    @Override
    public String getPaymentMode() {
        return "Credit Card";
    }
}
