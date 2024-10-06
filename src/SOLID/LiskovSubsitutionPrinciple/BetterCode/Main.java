package SOLID.LiskovSubsitutionPrinciple.BetterCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<InternationalPaymentCompatibleCreditCards> cards = new ArrayList<>();
        List<UpiPaymentCompatibleCreditCard> cards1 = new ArrayList<>();

        for(InternationalPaymentCompatibleCreditCards card: card) {
            card.internationalPayment();
        }

        for(UpiPaymentCompatibleCreditCard card: card) {
            card.upiPayments();
        }
    }
}
