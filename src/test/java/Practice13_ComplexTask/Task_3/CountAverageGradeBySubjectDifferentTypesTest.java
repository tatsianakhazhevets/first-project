package Practice13_ComplexTask.Task_3;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountAverageGradeBySubjectDifferentTypesTest {

    @Test
    public void countAverageGradeWithDifferentSubjectsAndDifferentDoubleGrades() throws InvalidGradeException {

        GradeService<Double> gradeService = new GradeService<>();
        List<StudentGrade<Double>> studentGrades = List.of(
                new StudentGrade<>("Петя", "Математика", 9.0),
                new StudentGrade<>("Петя", "История", 5.0),
                new StudentGrade<>("Петя", "Физкультура", 0.0),
                new StudentGrade<>("Петя", "Информатика", 10.0),
                new StudentGrade<>("Петя", "Математика", 7.0)
        );

        for(StudentGrade<Double> sg : studentGrades) {
            gradeService.addGrade(sg);
        }

        double actualResult = gradeService.countAverageGradeBySubject("Математика");
        double expectedResult = 8.0;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void countAverageGradeWithDifferentSubjectsAndDifferentFloatGrades() throws InvalidGradeException {

        GradeService<Float> gradeService = new GradeService<>();
        List<StudentGrade<Float>> studentGrades = List.of(
                new StudentGrade<>("Петя", "Математика", 9.0f),
                new StudentGrade<>("Петя", "История", 5.0f),
                new StudentGrade<>("Петя", "Физкультура", 0.0f),
                new StudentGrade<>("Петя", "Информатика", 10.0f),
                new StudentGrade<>("Петя", "Математика", 7.0f)
        );

        for(StudentGrade<Float> sg : studentGrades) {
            gradeService.addGrade(sg);
        }

        double actualResult = gradeService.countAverageGradeBySubject("Математика");
        double expectedResult = 8.0;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void countAverageGradeWithDifferentSubjectsAndDifferentLongGrades() throws InvalidGradeException {

        GradeService<Long> gradeService = new GradeService<>();
        List<StudentGrade<Long>> studentGrades = List.of(
                new StudentGrade<>("Петя", "Математика", 9000L),
                new StudentGrade<>("Петя", "История", 5000L),
                new StudentGrade<>("Петя", "Физкультура", 60000L),
                new StudentGrade<>("Петя", "Информатика", 100000L),
                new StudentGrade<>("Петя", "Математика", 700000L)
        );

        for(StudentGrade<Long> sg : studentGrades) {
            gradeService.addGrade(sg);
        }

        double actualResult = gradeService.countAverageGradeBySubject("Математика");
        double expectedResult = 354500.0;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void countAverageGradeWithDifferentSubjectsAndDifferentByteGrades() throws InvalidGradeException {

        GradeService<Byte> gradeService = new GradeService<>();
        List<StudentGrade<Byte>> studentGrades = List.of(
                new StudentGrade<>("Петя", "Математика", (byte) 9),
                new StudentGrade<>("Петя", "История", (byte) 5),
                new StudentGrade<>("Петя", "Физкультура", (byte) 0),
                new StudentGrade<>("Петя", "Информатика", (byte) 10),
                new StudentGrade<>("Петя", "Математика", (byte) 7)
        );

        for(StudentGrade<Byte> sg : studentGrades) {
            gradeService.addGrade(sg);
        }

        double actualResult = gradeService.countAverageGradeBySubject("Математика");
        double expectedResult = 8;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void countAverageGradeWithDifferentSubjectsAndDifferentShortGrades() throws InvalidGradeException {

        GradeService<Short> gradeService = new GradeService<>();
        List<StudentGrade<Short>> studentGrades = List.of(
                new StudentGrade<>("Петя", "Математика", (short) 9),
                new StudentGrade<>("Петя", "История", (short) 5),
                new StudentGrade<>("Петя", "Физкультура", (short) 0),
                new StudentGrade<>("Петя", "Информатика", (short) 10),
                new StudentGrade<>("Петя", "Математика", (short) 7)
        );

        for(StudentGrade<Short> sg : studentGrades) {
            gradeService.addGrade(sg);
        }

        double actualResult = gradeService.countAverageGradeBySubject("Математика");
        double expectedResult = 8;

        assertEquals(expectedResult, actualResult);
    }
}
