package mentoring.Practice3;

public class Company {
    static String companyName;
    final int employeeID;
    String employeeName;

    Company(int someEmployeeID, String someEmployeeName){
        this.employeeID = someEmployeeID;
        this.employeeName = someEmployeeName;
    }

    static {
        companyName = "Some Company";
    }

    public static void printCompanyName(){
        System.out.println("Наименование компании: " + companyName);
    }

    String getEmployeeName(){
        return this.employeeName;
    }

    void setEmployeeName(String newEmployeeName){
        this.employeeName = newEmployeeName;
    }

    public void print(){
        System.out.println("ID: " + this.employeeID + " Имя: " + this.employeeName);
    }

    public static void setCompanyName(String newCompanyName){
        companyName = newCompanyName;
    }


}
