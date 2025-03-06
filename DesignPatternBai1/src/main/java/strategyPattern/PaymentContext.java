package strategyPattern;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    // Constructor nhận vào một Strategy cụ thể
    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Thực hiện thanh toán bằng chiến lược được chọn
    public void executePayment(double amount) {
        paymentStrategy.pay(amount);
    }
}

