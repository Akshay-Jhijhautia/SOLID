package SOLID.InterfaceSegregationPrinciple.BetterCode;

public class Buyer implements ICanBuy{
    @Override
    public void buy() {
        System.out.println("Buy");
    }
}
