package no_more_manual_level_up_automation.practice_four.static_final_access_modifiers.task_1;

public class Company {

    protected static String companyName;
    private final int employeeID;
    private String employeeName;

    public Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public static void printCompanyName() {
        System.out.println("Company: " + Company.companyName);
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void printInfo() {
        System.out.println("Employee ID: " + this.employeeID +
                "\nEmployee Name: " + this.employeeName);
    }
}