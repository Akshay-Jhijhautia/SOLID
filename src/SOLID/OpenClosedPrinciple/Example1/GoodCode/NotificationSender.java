package SOLID.OpenClosedPrinciple.Example1.GoodCode;

import java.util.List;

public class NotificationSender {
    public void sendNotifications(List<Notification> notifications) {
        for(Notification notification: notifications) {
            notification.send();
        }
    }
}
