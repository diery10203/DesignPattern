package strategyPattern;

public class VNPayPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán qua VNPay: " + amount + " VND");
    }
}
