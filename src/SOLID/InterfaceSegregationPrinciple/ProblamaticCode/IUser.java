package SOLID.InterfaceSegregationPrinciple.ProblamaticCode;

public interface IUser {

    boolean canBuyProducts();

    boolean canModifyProducts();

    boolean canAddProducts();

    boolean canApproveProducts();

    void approveProduct();
}
