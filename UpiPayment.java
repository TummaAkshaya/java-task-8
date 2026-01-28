// UpiPayment.java
public class UpiPayment implements Payment {

    @Override
    public boolean pay(double amount) {
        if (amount <= 0) {
            System.out.println("❌ Invalid UPI payment amount");
            return false;
        }
        System.out.println("✅ Paid ₹" + amount + " using UPI");
        return true;
    }

    @Override
    public String getPaymentMode() {
        return "UPI";
    }
}
