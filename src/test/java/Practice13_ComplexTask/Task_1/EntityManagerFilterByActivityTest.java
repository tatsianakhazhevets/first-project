package Practice13_ComplexTask.Task_1;

import mentoring.Practice13_ComplexTask.Task_1.User;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EntityManagerFilterByActivityTest extends EntityManagerSetObject {

    @Test
    public void shouldReturnLessElementsThenInInput() {
        User userOne = new User(17, "Коля", false);
        User userTwo = new User(25, "Оля", false);
        User userThree = new User(44, "Петя", true);
        User userFour = new User(66, "Петя", true);
        User userFive = new User(105, "Петя", true);

        em.add(userOne);
        em.add(userTwo);
        em.add(userThree);
        em.add(userFour);
        em.add(userFive);

        List<User> usersBeforeFiltering = em.getAll();
        assertEquals(5, usersBeforeFiltering.size());

        List<User> filteredUsers = em.filterByActivity(true);

        // check that the size is different from List<User> usersBeforeFiltering
        assertEquals(3, filteredUsers.size());

        // check the availability of the users
        assertFalse(filteredUsers.contains(userOne));
        assertFalse(filteredUsers.contains(userTwo));
        assertTrue(filteredUsers.contains(userThree));
        assertTrue(filteredUsers.contains(userFour));
        assertTrue(filteredUsers.contains(userFive));

        // check the order after filtering
        assertIterableEquals(List.of(userThree, userFour, userFive), filteredUsers);
    }

    @Test
    public void shouldReturnEmptyListWhenNoMatchs() {
        User userOne = new User(17, "Коля", true);
        User userTwo = new User(25, "Оля", true);
        User userThree = new User(44, "Петя", true);
        User userFour = new User(66, "Петя", true);
        User userFive = new User(105, "Петя", true);

        em.add(userOne);
        em.add(userTwo);
        em.add(userThree);
        em.add(userFour);
        em.add(userFive);

        List<User> usersBeforeFiltering = em.getAll();
        assertEquals(5, usersBeforeFiltering.size());

        List<User> filteredUsers = em.filterByActivity(false);

        // check that the List is empty
        assertTrue(filteredUsers.isEmpty());
    }

    @Test
    public void shouldReturnTheSameQuantityOfElementsThatInBeforeFilteredList() {
        User userOne = new User(17, "Коля", true);
        User userTwo = new User(17, "Коля", true);
        User userThree = new User(17, "Коля", true);
        User userFour = new User(17, "Коля", true);
        User userFive = new User(17, "Коля", true);

        em.add(userOne);
        em.add(userTwo);
        em.add(userThree);
        em.add(userFour);
        em.add(userFive);

        List<User> usersBeforeFiltering = em.getAll();
        assertEquals(5, usersBeforeFiltering.size());

        List<User> filteredUsers = em.filterByActivity(true);

        // check that the quantity of the elements in the List does not change
        assertEquals(5, usersBeforeFiltering.size());

        // check the availability of the users
        assertTrue(filteredUsers.contains(userOne));
        assertTrue(filteredUsers.contains(userTwo));
        assertTrue(filteredUsers.contains(userThree));
        assertTrue(filteredUsers.contains(userFour));
        assertTrue(filteredUsers.contains(userFive));

        // check the order after filtering
        assertIterableEquals(List.of(userOne, userTwo, userThree, userFour, userFive), filteredUsers);
    }

    @Test
    public void shouldReturnOneValueInListWhenOneMatch() {
        User userOne = new User(17, "Коля", false);
        User userTwo = new User(17, "Рома", true);
        User userThree = new User(17, "Денис", true);

        em.add(userOne);
        em.add(userTwo);
        em.add(userThree);

        List<User> usersBeforeFiltering = em.getAll();
        assertEquals(3, usersBeforeFiltering.size());

        List<User> filteredUsers = em.filterByActivity(false);

        // check that the quantity of the elements in the List is 1
        assertEquals(1, filteredUsers.size());

        // check the availability of the users
        assertTrue(filteredUsers.contains(userOne));
        assertFalse(filteredUsers.contains(userTwo));
        assertFalse(filteredUsers.contains(userThree));

        // check the order after filtering
        assertIterableEquals(List.of(userOne), filteredUsers);
    }

    @Test
    public void shouldReturnEmptyListWhenFilteringEmptyList() {
        List<User> usersBeforeFiltering = em.getAll();
        assertEquals(0, usersBeforeFiltering.size());

        List<User> filteredUsers = em.filterByActivity(false);

        // check that the List is empty
        assertTrue(filteredUsers.isEmpty());
    }
}