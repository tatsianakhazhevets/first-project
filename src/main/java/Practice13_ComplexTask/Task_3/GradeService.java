package Practice13_ComplexTask.Task_3;

import java.util.ArrayList;
import java.util.List;

public class GradeService<T extends Number> {

    private List<StudentGrade<T>> studentGradeList = new ArrayList<>();

    public List<StudentGrade<T>> getStudentGradeList() {
        return studentGradeList;
    }

    public synchronized void addGrade(StudentGrade<T> studentGrade) throws InvalidGradeException {
        if(studentGrade == null) {
            throw new IllegalArgumentException("Student Grade is null");
        }
        if(studentGrade.getGrade().doubleValue() < 0) {
            throw new InvalidGradeException("Grade is negative");
        }
        studentGradeList.add(studentGrade);
    }

    public synchronized double countAverageGradeBySubject(String subject) {
        return studentGradeList.stream()
                .filter(studentGrade -> studentGrade.getSubject().equals(subject))
                .mapToDouble(studentGrade -> studentGrade.getGrade().doubleValue())
                .average().orElse(0.0);
    }
}