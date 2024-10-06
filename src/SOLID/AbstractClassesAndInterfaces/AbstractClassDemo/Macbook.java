package SOLID.AbstractClassesAndInterfaces.AbstractClassDemo;

public class Macbook extends Product{
    // Need to implement Abstract method
    @Override
    public double calculateDiscount() {
        return 0;
    }

    @Override
    public void termsAndConditions() {
        System.out.println("Terms For Macbook");
    }
}
