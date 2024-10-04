package SOLID.OpenClosedPrinciple.Example1.ProblamaticCode;

public enum NotificationType {
    SMS,
    EMAIL,
    WHATSAPP;

    public void sendSmsNotification() {
        System.out.println("Send SMS Notification");
    }

    public void sendEmailNotification() {
        System.out.println("Send Email Notification");
    }

    public void sendWhatsappNotification() {
        System.out.println("Send Whatsapp Notifications");
    }
}
