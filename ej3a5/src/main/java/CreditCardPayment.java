public class CreditCardPayment extends Payment {
    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        // TODO: Print "Processing credit card payment of <amount>€ using card <cardNumber>"
        System.out.println("Processing credit card payment of "+amount+"€ using card "+cardNumber);
    }

    @Override
    public String getPaymentDetails() {
        // TODO: Return "Card Number: <cardNumber>"
        return "Card Number: "+cardNumber;
           }

    @Override
    public double calculateTransactionFee() {
        // TODO: Return 2% of amount
      return amount * 0.02;
    }
}
