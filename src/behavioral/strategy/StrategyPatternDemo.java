package behavioral.strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        //To test if no payment method is selected
        paymentContext.pay(100);

        paymentContext.setPaymentStrategy(new CreditCardPayment("13131414", "aahlad"));
        paymentContext.pay(100);

        paymentContext.setPaymentStrategy(new UPIPayment("aahlad@upi.com"));
        paymentContext.pay(500);

        paymentContext.setPaymentStrategy(new BankTransferPayment("13716881"));
        paymentContext.pay(900);
    }
}
