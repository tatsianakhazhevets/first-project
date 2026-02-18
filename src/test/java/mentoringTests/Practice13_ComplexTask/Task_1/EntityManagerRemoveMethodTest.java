package mentoringTests.Practice13_ComplexTask.Task_1;

import mentoring.Practice13_ComplexTask.Task_1.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EntityManagerRemoveMethodTest extends EntityManagerSetObject {

    @Test
    public void removeOneElementAndSetEmptyCollection() {
        User userOne = new User(17, "Коля", true);

        em.add(userOne);
        boolean isEmptyBefore = em.getAll().isEmpty();
        // check that the collection is not empty
        assertFalse(isEmptyBefore);

        boolean userOneRemoved = em.remove(userOne);
        boolean isEmptyAfter = em.getAll().isEmpty();
        // check that the collection is empty after remove(user)
        assertTrue(isEmptyAfter);

        // check that element is removed
        assertTrue(userOneRemoved);

        // check that userOne is not located in the collection
        assertFalse(em.getAll().contains(userOne));

        // check the size is 0
        assertEquals(0, em.getAll().size());
    }


    @Test
    public void removeOneElementThatWasNotAdded() {
        User userOne = new User(17, "Коля", true);

        boolean userOneRemoved = em.remove(userOne);

        // check that element is removed
        assertFalse(userOneRemoved);

        // check that userOne is not located in the collection
        assertFalse(em.getAll().contains(userOne));

        // check the size is 0
        assertEquals(0, em.getAll().size());
    }

    @Test
    public void removeSameElementsInCollection() {
        User userOne = new User(17, "Коля", true);

        em.add(userOne);
        em.add(userOne);

        boolean userIndex0Removed = em.remove(userOne);
        boolean userIndex1Removed = em.remove(userOne);

        // check that elements are removed
        assertTrue(userIndex0Removed);
        assertTrue(userIndex1Removed);

        // check that userOne is not located in the collection
        assertFalse(em.getAll().contains(userOne));

        // check that the collection is empty
        assertTrue(em.getAll().isEmpty());
    }

    @Test
    public void removeInTheMiddleAndMoreThenOneElement() {
        User userOne = new User(17, "Коля", true);
        em.add(userOne);

        User userTwo = new User(18, "Оля", true);
        em.add(userTwo);

        User userThree = new User(19, "Петя", true);
        em.add(userThree);

        // check the size is 2
        assertEquals(3, em.getAll().size());

        boolean userTwoRemoved = em.remove(userTwo);

        // check that element in the middle is removed
        assertTrue(userTwoRemoved);

        // check that element is not contained in the collection
        assertFalse(em.getAll().contains(userTwoRemoved));

        // check the order of the remains elements
        assertEquals(userOne, em.getAll().get(0));
        assertEquals(userThree, em.getAll().get(1));

        // check the size is 2
        assertEquals(2, em.getAll().size());

        boolean userOneRemoved = em.remove(userOne);
        boolean userThreeRemoved = em.remove(userThree);

        // check that elements are removed
        assertTrue(userOneRemoved);
        assertTrue(userThreeRemoved);

        // check that the elements are not contained in the collection
        assertFalse(em.getAll().contains(userOneRemoved));
        assertFalse(em.getAll().contains(userThreeRemoved));

        // check that the collection isEmpty
        assertTrue(em.getAll().isEmpty());

        // check the size is 0
        assertEquals(0, em.getAll().size());
    }

    @Test
    public void addWithThreads() throws InterruptedException {
        User userOne = new User(17, "Коля", true);
        em.add(userOne);
        em.add(userOne);

        Thread t1 = new Thread(() -> em.remove(userOne));
        Thread t2 = new Thread(() -> em.remove(userOne));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        // check the size is 0
        assertEquals(0, em.getAll().size());

        // check that the collection is empty
        assertTrue(em.getAll().isEmpty());

        // check that elements is not located in the collection
        assertFalse(em.getAll().contains(userOne));
    }
}