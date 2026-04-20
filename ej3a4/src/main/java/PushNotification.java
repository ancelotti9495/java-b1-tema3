public class PushNotification extends Notification {

  public PushNotification(String recipient){
    super(recipient);
  }
  @Override
  public void send(){
    System.out.println("Sending PUSH notification to "+recipient);
  }
   
}
