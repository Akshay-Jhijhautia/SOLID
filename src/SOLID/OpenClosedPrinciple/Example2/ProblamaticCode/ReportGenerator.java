package SOLID.OpenClosedPrinciple.Example2.ProblamaticCode;

public class ReportGenerator {
    public String generateReport(String reportType) {
        if(reportType.equals("PDF")) {
            return "Generating PDF";
        } else if(reportType.equals("Word")) {
            return "Generating Word";
        }
        return "Report Type Not Supported";
    }
}
