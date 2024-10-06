package SOLID.LiskovSubsitutionPrinciple.BetterCode;

public abstract class CreditCard {

    private String ccNumber;
    private String ownerName;
    private int cvv;

    public abstract void tapAndPay();
    public abstract void onlineTransfer();
    public abstract void mandatePayments();
    public abstract void swipeAndPay();

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public void displayCreditCardDetails() {
        System.out.println("Credit card Number " + this.ccNumber);
        System.out.println("Owner Name " + this.ownerName);
    }
}
