package SOLID.OpenClosedPrinciple.Example2.GoodCode;

public class WordGenerator implements ReportGenerator {
    @Override
    public String generateReport() {
        return "Generate Word";
    }
}
