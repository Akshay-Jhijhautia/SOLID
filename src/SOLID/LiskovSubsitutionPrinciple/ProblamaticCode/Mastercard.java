package SOLID.LiskovSubsitutionPrinciple.ProblamaticCode;

public class Mastercard extends CreditCard{
    @Override
    public void tapAndPay() {
        System.out.println("Tap and Pay for mastercard");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online Transfer for mastercard");
    }

    @Override
    public void mandatePayments() {
        System.out.println("Mandate Payments for mastercard");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and Pay for mastercard");
    }
}
