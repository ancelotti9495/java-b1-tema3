public class PayPalPayment extends Payment {
    private String email;
  public PayPalPayment(Double amount,String email){
      super(amount);
      this.email=email;      
    }
    @Override
    public  void processPayment(){
      System.out.println("Processing PayPal payment of "+amount+"€ for account "+email);
    }

    @Override
    public  String getPaymentDetails(){
      return "PayPal Account: "+email;
    }

    @Override
    public  double calculateTransactionFee(){
      return amount * 0.015;
    }
}
