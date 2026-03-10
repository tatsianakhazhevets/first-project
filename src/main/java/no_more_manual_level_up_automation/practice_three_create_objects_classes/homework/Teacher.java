package no_more_manual_level_up_automation.practice_three_create_objects_classes.homework;

public class Teacher {

    String name;
    String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return this.name;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void printInfo() {
        System.out.println("Teacher: " + this.name + ", subject: " + this.subject);
    }
}