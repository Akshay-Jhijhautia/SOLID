package SOLID.OpenClosedPrinciple.Example2.GoodCode;

public class PdfGenarator implements ReportGenerator {
    @Override
    public String generateReport() {
        return "Generate PDF";
    }
}
