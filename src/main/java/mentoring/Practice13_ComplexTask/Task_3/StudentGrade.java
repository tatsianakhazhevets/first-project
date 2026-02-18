package mentoring.Practice13_ComplexTask.Task_3;

import java.util.Objects;

public class StudentGrade<T extends Number> {

    private String studentName;
    private String subject;
    private T grade;

    public StudentGrade(String studentName, String subject, T grade) {
        if(studentName == null || studentName.isEmpty()) {
            throw new IllegalArgumentException("Fill in the name of the student");
        }
        this.studentName = studentName;
        if(subject == null || subject.isEmpty()) {
            throw new IllegalArgumentException("Fill in the subject");
        }
        this.subject = subject;
        if(grade == null) {
            throw new IllegalArgumentException("Fill in the subject");
        }
        this.grade = grade;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getSubject() {
        return subject;
    }

    public T getGrade() {
        return grade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        StudentGrade<?> that = (StudentGrade<?>) o;
        return Objects.equals(studentName, that.studentName) && Objects.equals(subject, that.subject) && Objects.equals(grade, that.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentName, subject, grade);
    }
}