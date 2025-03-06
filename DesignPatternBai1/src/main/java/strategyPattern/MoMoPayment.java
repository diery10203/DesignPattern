package strategyPattern;

// Thanh toán qua MoMo
public class MoMoPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán qua MoMo: " + amount + " VND");
    }
}
