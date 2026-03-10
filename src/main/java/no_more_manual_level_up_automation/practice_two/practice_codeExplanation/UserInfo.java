package no_more_manual_level_up_automation.practice_two.practice_codeExplanation;

public class UserInfo {
    // class signature
    // declare variable / final - not reassigned
    // initialize the var DEFAULT_NAME with value unknown
    private static final String DEFAULT_NAME = "unknown";
    // after that we created special field name, which has ..
    private String name; // объявление поля класса с типом данным String и именем name
    private int age;

    public void printInfo() {   // declared method with public access modifier .. withount any parameters
        System.out.println("Имя " + name); // вызов распечатывания в консоль с новой строки с аргументом "Имя ", контентинированное с полем name
        //method body, which contains printing in the console the name and afterword printing in the console the age
        System.out.println("Возраст " + age);
        // every line has to be separated as new line
    }

    // create two setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // create entry point main
    public static void main(String[] args) {//определение метода
        // create new variable with type UserInfo and name userInfo and initialazed it with
        // new instance of UserInfo class, using special new operator
        UserInfo userInfo = new UserInfo();
        //call the method setName to set OLEG value as a name userInfo object
        userInfo.setName("Олег");
        // -\\-
        userInfo.setAge(21);
        // we call the method printInfo to check the result and to check we are gonna get the expected result
        userInfo.printInfo();
    }
}