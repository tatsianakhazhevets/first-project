package mentoringTests.Practice13_ComplexTask.Task_1;

import mentoring.Practice13_ComplexTask.Task_1.User;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EntityManagerGetAllTest extends  EntityManagerSetObject {

    @Test
    public void shouldReturnEmptyListWhenNoEntityAdded() {
        List<User> users = em.getAll();

        // check that List is empty
        assertTrue(users.isEmpty());
    }

    @Test
    public void shouldReturnEntitiesIncludingDublicates() {
        User userOne = new User(17, "Коля", true);
        User userTwo = new User(18, "Оля", true);
        User userThree = new User(18, "Оля", true);

        em.add(userOne);
        em.add(userTwo);
        em.add(userThree);

        List<User> users = em.getAll();

        // check that the size is 3
        assertEquals(3, users.size());

        // check that all 3 users are located in the List
        assertTrue(users.contains(userOne));
        assertTrue(users.contains(userTwo));
        assertTrue(users.contains(userThree));

        // check indexes of the users
        assertEquals(userOne, users.get(0));
        assertEquals(userTwo, users.get(1));
        assertEquals(userThree, users.get(2));
    }

    @Test
    public void shouldReturnImmutableCopyOfEntities() {
        User userOne = new User(17, "Коля", true);
        em.add(userOne);

        List<User> users = em.getAll();

        assertThrows(UnsupportedOperationException.class,
                () -> users.add(new User(18, "Оля", true)));
    }
}