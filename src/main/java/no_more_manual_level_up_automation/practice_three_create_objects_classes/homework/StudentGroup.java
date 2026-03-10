package no_more_manual_level_up_automation.practice_three_create_objects_classes.homework;

public class StudentGroup {

    String groupName;
    int studentCount;

    public StudentGroup(String groupName, int studentCount) {
        this.groupName = groupName;
        this.studentCount = studentCount;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public int getStudentCount() {
        return this.studentCount;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public void printInfo() {
        System.out.println("Group: " + this.groupName + " , quantity: " + this.studentCount);
    }
}