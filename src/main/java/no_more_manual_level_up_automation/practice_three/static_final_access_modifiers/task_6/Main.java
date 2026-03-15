package no_more_manual_level_up_automation.practice_three.static_final_access_modifiers.task_6;

public class Main {
    public static void main(String[] args) {

        Person personOne = new Person("Dmitrii", "Dmitrienko", "123-45-6789");
        Person personTwo = new Person("Ivan", "Ivanov", "111-55-9999");
        Person personThree = new Person("Viktoria", "Sokolova", "321-54-9876");

        personTwo.setFirstName("Vania");

        personOne.printPersonInfo();
        personTwo.printPersonInfo();
        personThree.printPersonInfo();
    }
}