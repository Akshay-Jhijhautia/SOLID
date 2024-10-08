package SOLID.InterfaceSegregationPrinciple.ProblamaticCode;

public class Seller implements IUser{
    @Override
    public boolean canBuyProducts() {
        return false;
    }

    @Override
    public boolean canModifyProducts() {
        return false;
    }

    @Override
    public boolean canAddProducts() {
        return false;
    }

    @Override
    public boolean canApproveProducts() {
        // seller cannot approve products
        return false;
    }

    @Override
    public void approveProduct() {
        // seller cannot approve product
    }
}
