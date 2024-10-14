package behavioral.strategy;

class BankTransferPayment implements PaymentStrategy{
    private String bankAccNumber;

    public BankTransferPayment(String bankAccNumber){
        this.bankAccNumber = bankAccNumber;
    }

    @Override
    public void pay(int amount){
        System.out.println(STR."Paid \{amount} using Bank Transfer");
    }
}
