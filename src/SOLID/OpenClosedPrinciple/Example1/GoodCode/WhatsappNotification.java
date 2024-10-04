package SOLID.OpenClosedPrinciple.Example1.GoodCode;

public class WhatsappNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Sending WhatsApp");
    }
}
