package SOLID.InterfaceSegregationPrinciple.BetterCode;

public class Seller implements ICanSell,ICanModify,ICanBuy{
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
