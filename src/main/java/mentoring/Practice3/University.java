package mentoring.Practice3;

public class University {
    static String universityName;
    final int studentID;
    String studentName;

    University(int someStudentID, String someStudentName){
        this.studentID = someStudentID;
        this.studentName = someStudentName;
    }

    static {
        universityName = "БГУ";
    }

    public static void changeUniversityName(String newChangeUniversityName){
        universityName = newChangeUniversityName;
    }

    String getStudentName(){
        return this.studentName;
    }

    public void printStudentInfo(){
        System.out.println("ID: " + this.studentID + " Имя: " + this.studentName + " Университет: " + universityName);
    }


}
