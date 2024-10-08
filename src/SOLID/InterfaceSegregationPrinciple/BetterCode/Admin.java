package SOLID.InterfaceSegregationPrinciple.BetterCode;

public class Admin implements ICanBuy,ICanSell,ICanModify,ICanApprove{
    @Override
    public void approve() {
        System.out.println("Approve");
    }

    @Override
    public void buy() {
        System.out.println("Buy");
    }

    @Override
    public void modify() {
        System.out.println("Modify");
    }

    @Override
    public void sell() {
        System.out.println("Sell");
    }
}
