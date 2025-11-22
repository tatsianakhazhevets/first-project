package Practice13_ComplexTask.Task_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddGradeDifferentTypesTest {

    @Test
    public void addDoubleStudentGrade() {
        GradeService<Double> gradeService = new GradeService<>();
        StudentGrade<Double> studentGrade = new StudentGrade<>("Петя", "Математика", 6.6);
        StudentGrade<Double> studentGradeForEqualsActualResult = new StudentGrade<>("Петя", "Математика", 6.6);

        // список пустой
        assertTrue(gradeService.getStudentGradeList().isEmpty());

        try{
            gradeService.addGrade(studentGrade);
        } catch (InvalidGradeException e) {
            throw new RuntimeException();
        }

        // в список добавлен элемент
        assertFalse(gradeService.getStudentGradeList().isEmpty());
        // в списке 1 элемент
        assertEquals(1, gradeService.getStudentGradeList().size());
        // проверка, что добавился studentGrade
        assertTrue(gradeService.getStudentGradeList().contains(studentGrade));
        // проверка равенства объекта и полей
        assertEquals(studentGrade, studentGradeForEqualsActualResult);
        assertEquals(studentGrade.getStudentName(), studentGradeForEqualsActualResult.getStudentName());
        assertEquals(studentGrade.getSubject(), studentGradeForEqualsActualResult.getSubject());
        assertEquals(studentGrade.getGrade(), studentGradeForEqualsActualResult.getGrade());
    }

    @Test
    public void addFloatStudentGrade() {
        GradeService<Float> gradeService = new GradeService<>();
        StudentGrade<Float> studentGrade = new StudentGrade<>("Петя", "Математика", 6.6f);
        StudentGrade<Float> studentGradeForEqualsActualResult = new StudentGrade<>("Петя", "Математика", 6.6f);

        // список пустой
        assertTrue(gradeService.getStudentGradeList().isEmpty());

        try{
            gradeService.addGrade(studentGrade);
        } catch (InvalidGradeException e) {
            throw new RuntimeException();
        }

        // в список добавлен элемент
        assertFalse(gradeService.getStudentGradeList().isEmpty());
        // в списке 1 элемент
        assertEquals(1, gradeService.getStudentGradeList().size());
        // проверка, что добавился studentGrade
        assertTrue(gradeService.getStudentGradeList().contains(studentGrade));
        // проверка равенства объекта и полей
        assertEquals(studentGrade, studentGradeForEqualsActualResult);
        assertEquals(studentGrade.getStudentName(), studentGradeForEqualsActualResult.getStudentName());
        assertEquals(studentGrade.getSubject(), studentGradeForEqualsActualResult.getSubject());
        assertEquals(studentGrade.getGrade(), studentGradeForEqualsActualResult.getGrade());
    }

    @Test
    public void addLongStudentGrade() {
        GradeService<Long> gradeService = new GradeService<>();
        StudentGrade<Long> studentGrade = new StudentGrade<>("Петя", "Математика", 10000000L);
        StudentGrade<Long> studentGradeForEqualsActualResult = new StudentGrade<>("Петя", "Математика", 10000000L);

        // список пустой
        assertTrue(gradeService.getStudentGradeList().isEmpty());

        try{
            gradeService.addGrade(studentGrade);
        } catch (InvalidGradeException e) {
            throw new RuntimeException();
        }

        // в список добавлен элемент
        assertFalse(gradeService.getStudentGradeList().isEmpty());
        // в списке 1 элемент
        assertEquals(1, gradeService.getStudentGradeList().size());
        // проверка, что добавился studentGrade
        assertTrue(gradeService.getStudentGradeList().contains(studentGrade));
        // проверка равенства объекта и полей
        assertEquals(studentGrade, studentGradeForEqualsActualResult);
        assertEquals(studentGrade.getStudentName(), studentGradeForEqualsActualResult.getStudentName());
        assertEquals(studentGrade.getSubject(), studentGradeForEqualsActualResult.getSubject());
        assertEquals(studentGrade.getGrade(), studentGradeForEqualsActualResult.getGrade());
    }

    @Test
    public void addByteStudentGrade() {
        GradeService<Byte> gradeService = new GradeService<>();
        StudentGrade<Byte> studentGrade = new StudentGrade<>("Петя", "Математика", (byte) 5);
        StudentGrade<Byte> studentGradeForEqualsActualResult = new StudentGrade<>("Петя", "Математика", (byte) 5);

        // список пустой
        assertTrue(gradeService.getStudentGradeList().isEmpty());

        try{
            gradeService.addGrade(studentGrade);
        } catch (InvalidGradeException e) {
            throw new RuntimeException();
        }

        // в список добавлен элемент
        assertFalse(gradeService.getStudentGradeList().isEmpty());
        // в списке 1 элемент
        assertEquals(1, gradeService.getStudentGradeList().size());
        // проверка, что добавился studentGrade
        assertTrue(gradeService.getStudentGradeList().contains(studentGrade));
        // проверка равенства объекта и полей
        assertEquals(studentGrade, studentGradeForEqualsActualResult);
        assertEquals(studentGrade.getStudentName(), studentGradeForEqualsActualResult.getStudentName());
        assertEquals(studentGrade.getSubject(), studentGradeForEqualsActualResult.getSubject());
        assertEquals(studentGrade.getGrade(), studentGradeForEqualsActualResult.getGrade());
    }

    @Test
    public void addShortStudentGrade() {
        GradeService<Short> gradeService = new GradeService<>();
        StudentGrade<Short> studentGrade = new StudentGrade<>("Петя", "Математика", (short) 50);
        StudentGrade<Short> studentGradeForEqualsActualResult = new StudentGrade<>("Петя", "Математика", (short) 50);

        // список пустой
        assertTrue(gradeService.getStudentGradeList().isEmpty());

        try{
            gradeService.addGrade(studentGrade);
        } catch (InvalidGradeException e) {
            throw new RuntimeException();
        }

        // в список добавлен элемент
        assertFalse(gradeService.getStudentGradeList().isEmpty());
        // в списке 1 элемент
        assertEquals(1, gradeService.getStudentGradeList().size());
        // проверка, что добавился studentGrade
        assertTrue(gradeService.getStudentGradeList().contains(studentGrade));
        // проверка равенства объекта и полей
        assertEquals(studentGrade, studentGradeForEqualsActualResult);
        assertEquals(studentGrade.getStudentName(), studentGradeForEqualsActualResult.getStudentName());
        assertEquals(studentGrade.getSubject(), studentGradeForEqualsActualResult.getSubject());
        assertEquals(studentGrade.getGrade(), studentGradeForEqualsActualResult.getGrade());
    }
}