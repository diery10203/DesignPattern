package strategyPattern;

// Thanh toán bằng chuyển khoản
public class BankTransferPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán bằng chuyển khoản: " + amount + " VND");
    }
}
