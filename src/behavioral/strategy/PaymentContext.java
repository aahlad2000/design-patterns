package behavioral.strategy;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(int amount){
        if(paymentStrategy == null){
            System.out.println("Please select your payment method");
        } else{
            paymentStrategy.pay(100);
        }
    }
}
