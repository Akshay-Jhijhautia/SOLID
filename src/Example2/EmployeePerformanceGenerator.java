package Example2;

import Example1.GoodCode.Employee;

// This class follows Single Responsibility Principle
public class EmployeePerformanceGenerator {
    public String generateReport(String reportType, Employee employee) {
        if(reportType.equals("PDF")) {
            return "Generating PDF Report";
        } else if (reportType.equals("WORD")) {
            return "Generating Word Report";
        }
        return "Report Type Not Supported";
    }
}
