package no_more_manual_level_up_automation.practice_three.static_final_access_modifiers.task_4;

public class Main {
    public static void main(String[] args) {

        University studentOne = new University(1, "Roman");
        University studentTwo = new University(2, "Evgenii");
        University studentThree = new University(3, "Olga");

        University.changeUniversityName("Some University");

        studentOne.printStudentInfo();
        studentTwo.printStudentInfo();
        studentThree.printStudentInfo();
    }
}