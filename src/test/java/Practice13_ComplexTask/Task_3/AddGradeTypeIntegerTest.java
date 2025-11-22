package Practice13_ComplexTask.Task_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddGradeTypeIntegerTest extends GradeServiceSetUp {

    @Test
    public void addSingleStudentGradeToEmptyList() {
        StudentGrade<Integer> studentGrade = new StudentGrade<>("Петя", "Математика", 9);
        StudentGrade<Integer> studentGradeForEqualsActualResult = new StudentGrade<>("Петя", "Математика", 9);

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
    public void addSingleStudentGradeToNotEmptyList() {
        StudentGrade<Integer> studentGrade = new StudentGrade<>("Петя", "Математика", 9);
                // список пустой
        assertTrue(gradeService.getStudentGradeList().isEmpty());

        try{
            gradeService.addGrade(studentGrade);
        } catch (InvalidGradeException e) {
            throw new RuntimeException();
        }

        // в список добавлен элемент
        assertFalse(gradeService.getStudentGradeList().isEmpty());

        StudentGrade<Integer> studentGradeOne = new StudentGrade<>("Анна", "Литература", 5);
        StudentGrade<Integer> studentGradeOneForEqualsActualResult = new StudentGrade<>("Анна", "Литература", 5);

        try{
            gradeService.addGrade(studentGradeOne);
        } catch (InvalidGradeException e) {
            throw new RuntimeException();
        }

        // в списке 2 элемента
        assertEquals(2, gradeService.getStudentGradeList().size());
        // проверка, что добавился studentGradeOne
        assertTrue(gradeService.getStudentGradeList().contains(studentGradeOne));
        // проверка индекса studentGradeOne
        assertEquals(studentGradeOne, gradeService.getStudentGradeList().get(1));
        // проверка равенства объекта и полей
        assertEquals(studentGradeOne, studentGradeOneForEqualsActualResult);
        assertEquals(studentGradeOne.getStudentName(), studentGradeOneForEqualsActualResult.getStudentName());
        assertEquals(studentGradeOne.getSubject(), studentGradeOneForEqualsActualResult.getSubject());
        assertEquals(studentGradeOne.getGrade(), studentGradeOneForEqualsActualResult.getGrade());
    }

    @Test
    public void addDublicatedStudentGradeToList() {
        StudentGrade<Integer> studentGrade = new StudentGrade<>("Петя", "Математика", 9);

        // список пустой
        assertTrue(gradeService.getStudentGradeList().isEmpty());

        try{
            gradeService.addGrade(studentGrade);
        } catch (InvalidGradeException e) {
            throw new RuntimeException();
        }

        try{
            gradeService.addGrade(studentGrade);
        } catch (InvalidGradeException e) {
            throw new RuntimeException();
        }

        // список содержит элементы
        assertFalse(gradeService.getStudentGradeList().isEmpty());
        // в списке 2 элемент
        assertEquals(2, gradeService.getStudentGradeList().size());
        // проверка индексов обоих studentGrade
        assertEquals(studentGrade, gradeService.getStudentGradeList().get(0));
        assertEquals(studentGrade, gradeService.getStudentGradeList().get(1));
        // проверка референса на один объект
        assertSame(gradeService.getStudentGradeList().get(0), gradeService.getStudentGradeList().get(1));
    }

    @Test
    public void addStudentGradeByThreadsAllowed() throws InterruptedException {
        StudentGrade<Integer> studentGradeForThreadOne = new StudentGrade<>("Петя", "Математика", 9);
        StudentGrade<Integer> studentGradeForThreadTwo = new StudentGrade<>("Коля", "История", 2);

        // список пустой
        assertTrue(gradeService.getStudentGradeList().isEmpty());

        Thread t1 = new Thread(
                () -> {
                    try {
                        gradeService.addGrade(studentGradeForThreadOne);
                    } catch (InvalidGradeException e) {
                        throw new RuntimeException(e);
                    }
                });

        Thread t2 = new Thread(
                () -> {
                    try {
                        gradeService.addGrade(studentGradeForThreadTwo);
                    } catch (InvalidGradeException e) {
                        throw new RuntimeException();
                    }
                });


       t1.start();
       t2.start();

       t1.join();
       t2.join();

        // список содержит элементы
        assertFalse(gradeService.getStudentGradeList().isEmpty());
        // в списке 2 элемент
        assertEquals(2, gradeService.getStudentGradeList().size());
        // проверка индексов обоих studentGrade
        assertEquals(studentGradeForThreadOne, gradeService.getStudentGradeList().get(0));
        assertEquals(studentGradeForThreadTwo, gradeService.getStudentGradeList().get(1));
    }

    @Test
    public void addNullStudentGradeThrowsIllegalArgumentException() {
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,
                () -> gradeService.addGrade(null));
        // проверка сообщения об ошибке
        assertEquals("Student Grade is null", illegalArgumentException.getMessage());
    }

    @Test
    public void addNegativeGradeThrowsInvalidGradeException() {
        StudentGrade<Integer> studentGrade = new StudentGrade<>("Петя", "Математика", -9);

        InvalidGradeException invalidGradeException = assertThrows(InvalidGradeException.class,
                () -> gradeService.addGrade(studentGrade));
        // проверка сообщения об ошибке
        assertEquals("Grade is negative", invalidGradeException.getMessage());
    }
}