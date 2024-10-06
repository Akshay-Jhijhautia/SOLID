package SOLID.LiskovSubsitutionPrinciple.ProblamaticCode;

public class Rupay extends CreditCard{
    @Override
    public void tapAndPay() {
        System.out.println("Tap and Pay for rupay");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online Transfer for rupay");
    }

    @Override
    public void mandatePayments() {
        System.out.println("Mandate Payments for rupay");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and Pay for rupay");
    }
}
