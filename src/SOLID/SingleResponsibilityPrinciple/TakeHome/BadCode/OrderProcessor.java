package SOLID.SingleResponsibilityPrinciple.TakeHome.BadCode;

class Order {
 // some properties
}

class User{
    // some properties
}

public class OrderProcessor {
    public void processOrder(Order order) {
        System.out.println("Order");
    }

    public void calculateTotalSum(Order order) {
        System.out.println("Sum");
    }

    public void sendEmailNotification(User user) {
        System.out.println("Notification");
    }
}
