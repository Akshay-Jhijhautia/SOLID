package SOLID.OpenClosedPrinciple.Example1.ProblamaticCode;

import java.util.List;

public class NotificationSender {
    public void sendNotifications(List<NotificationType> notificationTypes) {
        for(NotificationType type : notificationTypes) {
            if(type == NotificationType.SMS) {
                type.sendSmsNotification();
            } else if(type == NotificationType.EMAIL) {
                type.sendEmailNotification();
            } else if(type == NotificationType.WHATSAPP){
                type.sendWhatsappNotification();
            }
        }
    }
}
