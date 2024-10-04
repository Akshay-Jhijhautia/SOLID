package SOLID.OpenClosedPrinciple.Example1.GoodCode;

public class PushNotifications implements Notification{
    @Override
    public void send() {
        System.out.println("Sending Push Notifications");
    }
}
