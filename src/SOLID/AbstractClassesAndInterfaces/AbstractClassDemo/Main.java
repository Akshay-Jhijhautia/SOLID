package SOLID.AbstractClassesAndInterfaces.AbstractClassDemo;

public class Main {
    public static void main(String[] args) {
        // abstract classes cannot be instantiated, no object can be created.
        // Product p = new Product(); this line would throw error

        Product product = new Macbook();
        product.termsAndConditions();
        Product product1 = new Lenovo();
        product1.termsAndConditions();
    }
}
