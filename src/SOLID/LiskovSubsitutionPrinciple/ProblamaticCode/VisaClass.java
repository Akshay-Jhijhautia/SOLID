package SOLID.LiskovSubsitutionPrinciple.ProblamaticCode;

public class VisaClass extends CreditCard{
    @Override
    public void tapAndPay() {
        System.out.println("Tap and Pay for visa");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online Transfer for visa");
    }

    @Override
    public void mandatePayments() {
        System.out.println("Mandate Payments for visa");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and Pay for visa");
    }

    @Override
    public void upiPayments() {
        System.out.println("Does not support UPI Payments");
    }

    @Override
    public void internationalPayments() {
        System.out.println("Does not support International Payments");
    }
}
