package SOLID.AbstractClassesAndInterfaces.AbstractClassDemo;

public abstract class Product {
    // Abstract Method. It has no Implementation

    public abstract double calculateDiscount();

    // Concrete Method.
    public void termsAndConditions() {
        System.out.println("Terms and Conditions");
    }
}
