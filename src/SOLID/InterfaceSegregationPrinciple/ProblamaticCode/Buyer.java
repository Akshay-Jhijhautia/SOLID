package SOLID.InterfaceSegregationPrinciple.ProblamaticCode;

public class Buyer implements IUser{
    @Override
    public boolean canBuyProducts() {
        return false;
    }

    @Override
    public boolean canModifyProducts() {
        // Buyer cannot modify products
        return false;
    }

    @Override
    public boolean canAddProducts() {
        // Buyer cannot add products
        return false;
    }

    @Override
    public boolean canApproveProducts() {
        // Buyer cannot approve products
        return false;
    }

    @Override
    public void approveProduct() {
        // buyer cannot approve product
    }
}
