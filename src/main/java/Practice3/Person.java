package Practice3;

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;

    Person(String someFirstName, String someLastName, String someSSN){
        this.firstName = someFirstName;
        this.lastName = someLastName;
        this.ssn = someSSN;
    }

    String getFirstName9(){
        return this.firstName;
    }
    String getLastName(){
        return this.lastName;
    }
    String getSsn(){
        return this.ssn;
    }
    void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }
    void setLastName(String newLastName){
        this.lastName = newLastName;
    }
    public void printPersonInfo(){
        System.out.println("Имя: " + this.firstName + ", Фамилия: " + this.lastName + ", SSN: " + this.ssn);
    }

}
