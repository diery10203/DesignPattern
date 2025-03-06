package strategyPattern;

// Thanh toán bằng tiền mặt
public class CashPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán bằng tiền mặt: " + amount + " VND");
    }
}


