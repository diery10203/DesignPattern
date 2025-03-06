package strategyPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chọn phương thức thanh toán (cash, bank, momo, vnpay): ");
        String method = scanner.nextLine();

        System.out.println("Nhập số tiền cần thanh toán: ");
        double amount = scanner.nextDouble();

        PaymentStrategy paymentStrategy;

        switch (method.toLowerCase()) {
            case "cash":
                paymentStrategy = new CashPayment();
                break;
            case "bank":
                paymentStrategy = new BankTransferPayment();
                break;
            case "momo":
                paymentStrategy = new MoMoPayment();
                break;
            case "vnpay":
                paymentStrategy = new VNPayPayment();
                break;
            default:
                System.out.println("Phương thức thanh toán không hợp lệ!");
                return;
        }

        // Sử dụng Strategy Pattern
        PaymentContext context = new PaymentContext(paymentStrategy);
        context.executePayment(amount);

        scanner.close();
    }
}

