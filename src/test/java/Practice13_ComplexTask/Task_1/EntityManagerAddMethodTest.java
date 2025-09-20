package Practice13_ComplexTask.Task_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EntityManagerAddMethodTest extends EntityManagerSetObject {

    @Test
    public void addElementInEmptyCollection() {
        User userOne = new User(17, "Коля", true);
        User userOneActualResult = new User(17, "Коля", true);

        boolean isEmptyBefore = em.getAll().isEmpty();
        // check that the collection is empty
        assertTrue(isEmptyBefore);

        em.add(userOne);
        boolean isEmptyAfter = em.getAll().isEmpty();
        // check that the collection is not empty after add(user)
        assertFalse(isEmptyAfter);

        // check that userOne is located in collection
        assertTrue(em.getAll().contains(userOne));

        // check Object userOne is added and its fields
        assertEquals(userOne, userOneActualResult);
        assertEquals(userOne.getAge(), userOneActualResult.getAge());
        assertEquals(userOne.getName(), userOneActualResult.getName());
        assertEquals(userOne.isActive(), userOneActualResult.isActive());

        // check that size of the collection is consisted of 1 element
        assertEquals(1, em.getAll().size());
    }


    @Test
    public void addElementsInNotEmptyCollection() {
        User userOne = new User(17, "Коля", true);
        User userOneActualResult = new User(17, "Коля", true);

        boolean isEmptyBefore = em.getAll().isEmpty();
        // check that collection is empty
        assertTrue(isEmptyBefore);

        em.add(userOne);
        boolean isEmptyAfter = em.getAll().isEmpty();
        // check that collection is not empty after add(user)
        assertFalse(isEmptyAfter);

        User userTwo = new User(18, "Оля", true);
        User userTwoActualResult = new User(18, "Оля", true);
        em.add(userTwo);

        User userThree = new User(19, "Петя", true);
        User userThreeActualResult = new User(19, "Петя", true);
        em.add(userThree);

        // check that users is located in the collection
        assertTrue(em.getAll().contains(userTwo));
        assertTrue(em.getAll().contains(userThree));

        // check Objects users are added and their fields
        assertEquals(userTwo, userTwoActualResult);
        assertEquals(userTwo.getAge(), userTwoActualResult.getAge());
        assertEquals(userTwo.getName(), userTwoActualResult.getName());
        assertEquals(userTwo.isActive(), userTwoActualResult.isActive());

        assertEquals(userThree, userThreeActualResult);
        assertEquals(userThree.getAge(), userThreeActualResult.getAge());
        assertEquals(userThree.getName(), userThreeActualResult.getName());
        assertEquals(userThree.isActive(),userThreeActualResult.isActive());

        // check the size is 3
        assertEquals(3, em.getAll().size());

        // check that element added in order
        assertEquals(userTwo, em.getAll().get(1));
        assertEquals(userThree, em.getAll().get(2));
    }

    @Test
    public void addSameElementInCollection() {
        User userOne = new User(17, "Коля", true);

        em.add(userOne);
        em.add(userOne);

        // check the size is 2
        assertEquals(2, em.getAll().size());

        // check that elements added with the different indexes
        assertEquals(userOne, em.getAll().get(0));
        assertEquals(userOne, em.getAll().get(1));
    }

    @Test
    public void addNull() {
        assertThrows(NullPointerException.class, () -> em.add(null));
    }

    @Test
    public void addIllegalAge() {
        assertThrows(IllegalArgumentException.class, () -> new User(111, "Петя", false));
        assertThrows(IllegalArgumentException.class, () -> new User(-1, "Петя", false));
    }

    @Test
    public void addIllegalName() {
        assertThrows(IllegalArgumentException.class, () -> new User(25, "", false));
        assertThrows(IllegalArgumentException.class, () -> new User(25, "   ", false));
    }

    @Test
    public void addWithThreads() throws InterruptedException {
        User userOne = new User(17, "Коля", true);

        Thread t1 = new Thread(() -> em.add(userOne));
        Thread t2 = new Thread(() -> em.add(userOne));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        // check the size is 2
        assertEquals(2, em.getAll().size());

        // check that elements added with different indexes
        assertEquals(userOne, em.getAll().get(0));
        assertEquals(userOne, em.getAll().get(1));
    }
}