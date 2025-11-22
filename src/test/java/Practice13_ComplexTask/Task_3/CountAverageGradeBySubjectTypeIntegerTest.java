package Practice13_ComplexTask.Task_3;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountAverageGradeBySubjectTypeIntegerTest extends GradeServiceSetUp {

    @Test
    public void countAverageGradeWithSameSubjectsAndSameGrades() throws InvalidGradeException {

        List<StudentGrade<Integer>> studentGrades = List.of(
                new StudentGrade<>("Петя", "Математика", 9),
                new StudentGrade<>("Петя", "Математика", 9),
                new StudentGrade<>("Петя", "Математика", 9),
                new StudentGrade<>("Петя", "Математика", 9),
                new StudentGrade<>("Петя", "Математика", 9)
        );

        for(StudentGrade<Integer> sg : studentGrades) {
            gradeService.addGrade(sg);
        }

        double actualResult = gradeService.countAverageGradeBySubject("Математика");
        double expectedResult = 9;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void countAverageGradeWithSameSubjectsAndDifferentGrades() throws InvalidGradeException {

        List<StudentGrade<Integer>> studentGrades = List.of(
                new StudentGrade<>("Петя", "Математика", 9),
                new StudentGrade<>("Петя", "Математика", 5),
                new StudentGrade<>("Петя", "Математика", 0),
                new StudentGrade<>("Петя", "Математика", 10),
                new StudentGrade<>("Петя", "Математика", 7)
        );

        for(StudentGrade<Integer> sg : studentGrades) {
            gradeService.addGrade(sg);
        }

        double actualResult = gradeService.countAverageGradeBySubject("Математика");
        double expectedResult = 6.2;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void countAverageGradeWithDifferentSubjectsAndDifferentGrades() throws InvalidGradeException {

        List<StudentGrade<Integer>> studentGrades = List.of(
                new StudentGrade<>("Петя", "Математика", 9),
                new StudentGrade<>("Петя", "История", 5),
                new StudentGrade<>("Петя", "Физкультура", 0),
                new StudentGrade<>("Петя", "Информатика", 10),
                new StudentGrade<>("Петя", "Математика", 7)
        );

        for(StudentGrade<Integer> sg : studentGrades) {
            gradeService.addGrade(sg);
        }

        double actualResult = gradeService.countAverageGradeBySubject("Математика");
        double expectedResult = 8;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void countAverageGradeWithSingleStudentGrade() throws InvalidGradeException {

        StudentGrade<Integer> studentGrade = new StudentGrade<>("Петя", "Математика", 9);
        gradeService.addGrade(studentGrade);

        double actualResult = gradeService.countAverageGradeBySubject("Математика");
        double expectedResult = 9;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void countAverageGradeWithNoStudentGradeToCheckOrElse() throws InvalidGradeException {

        double actualResult = gradeService.countAverageGradeBySubject("Математика");
        double expectedResult = 0;

        assertEquals(expectedResult, actualResult);
    }
}