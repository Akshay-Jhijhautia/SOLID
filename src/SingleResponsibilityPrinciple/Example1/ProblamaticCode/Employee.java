package SingleResponsibilityPrinciple.Example1.ProblamaticCode;

// This class also violates Single Responsibility Principle
public class Employee {
    private int id;

    public int getId() {
        return 0;
    }

    public String fetchBioData() {
        return "Bio Data";
    }

    public double calculateSalary() {
        return 0;
    }

    public void printPerformance() {
        System.out.println("Performance");
    }
}
