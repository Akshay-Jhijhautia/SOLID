package SOLID.OpenClosedPrinciple.Example1.GoodCode;

public class EmailNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Sending Email");
    }
}
