package no_more_manual_level_up_automation.practice_four.static_final_access_modifiers.task_4;

public class University {
    protected static String universityName;
    private final int studentID;
    private String studentName;

    public University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public static void changeUniversityName(String newName) {
        universityName = newName;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void printStudentInfo() {
        System.out.println("Student name: " + this.studentName +
                "\nStudent ID: " + this.studentID +
                "\nUniversity: " + universityName);
    }
}