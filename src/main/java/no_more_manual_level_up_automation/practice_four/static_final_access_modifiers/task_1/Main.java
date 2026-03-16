package no_more_manual_level_up_automation.practice_four.static_final_access_modifiers.task_1;

public class Main {

    public static void main(String[] args) {
        Company employeeOne = new Company(1, "Anna");
        Company employeeTwo = new Company(2, "Dmitrii");
        Company employeeThree = new Company(3, "Oleg");
        Company.companyName = "Some Company";
        Company.printCompanyName();
        employeeOne.printInfo();
        employeeTwo.printInfo();
        employeeThree.printInfo();
    }
}