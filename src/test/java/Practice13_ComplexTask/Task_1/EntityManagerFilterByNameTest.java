package Practice13_ComplexTask.Task_1;

import mentoring.Practice13_ComplexTask.Task_1.User;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EntityManagerFilterByNameTest extends EntityManagerSetObject {

    @Test
    public void shouldReturnLessElementsThenInInput() {
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

        List<User> filteredUsers = em.filterByName("Петя");

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

        List<User> filteredUsers = em.filterByName("Таня");

        // check that the List is Empty
        assertTrue(filteredUsers.isEmpty());
    }

    @Test
    public void shouldReturnOneElementInListWhenOneMatch() {
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

        List<User> filteredUsers = em.filterByName("Оля");

        // check that the size is different from List<User> usersBeforeFiltering
        assertEquals(1, filteredUsers.size());

        // check the availability of the users
        assertFalse(filteredUsers.contains(userOne));
        assertTrue(filteredUsers.contains(userTwo));
        assertFalse(filteredUsers.contains(userThree));
        assertFalse(filteredUsers.contains(userFour));
        assertFalse(filteredUsers.contains(userFive));

        // check the order after filtering
        assertIterableEquals(List.of(userTwo), filteredUsers);
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

        List<User> filteredUsers = em.filterByName("Коля");

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
    public void shouldReturnEmptyListWhenBeforeFilteredListIsEmpty() {
        List<User> usersBeforeFiltering = em.getAll();
        assertEquals(0, usersBeforeFiltering.size());

        List<User> filteredUsers = em.filterByName("Таня");

        // check that the List is Empty
        assertTrue(filteredUsers.isEmpty());
    }

    @Test
    public void shouldCheckUpperAndLowerCaseOfFieldName() {
        User userOne = new User(17, "Коля", true);
        User userTwo = new User(25, "Оля", true);
        User userThree = new User(44, "Петя", true);
        User userFour = new User(66, "петя", true);
        User userFive = new User(105, "петя", true);

        em.add(userOne);
        em.add(userTwo);
        em.add(userThree);
        em.add(userFour);
        em.add(userFive);

        List<User> usersBeforeFiltering = em.getAll();
        assertEquals(5, usersBeforeFiltering.size());

        List<User> filteredUsers = em.filterByName("Петя");

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
    public void shouldReturnNamesWithSpacesInFieldName() {
        User userOne = new User(17, "Коля ", true);
        User userTwo = new User(17, " Коля", true);
        User userThree = new User(17, " Коля ", true);

        em.add(userOne);
        em.add(userTwo);
        em.add(userThree);

        List<User> usersBeforeFiltering = em.getAll();
        assertEquals(3, usersBeforeFiltering.size());

        List<User> filteredUsers = em.filterByName("Коля");

        // check that the quantity of the elements in the List does not change
        assertEquals(3, usersBeforeFiltering.size());

        // check the availability of the users
        assertTrue(filteredUsers.contains(userOne));
        assertTrue(filteredUsers.contains(userTwo));
        assertTrue(filteredUsers.contains(userThree));

        // check the order after filtering
        assertIterableEquals(List.of(userOne, userTwo, userThree), filteredUsers);
    }

    @Test
    public void shouldCheckThatListIsReturnedWhenOneLetterInFieldName() {
        User userOne = new User(17, "К", true);
        User userTwo = new User(17, "Р", true);
        User userThree = new User(17, "Д", true);

        em.add(userOne);
        em.add(userTwo);
        em.add(userThree);

        List<User> usersBeforeFiltering = em.getAll();
        assertEquals(3, usersBeforeFiltering.size());

        List<User> filteredUsers = em.filterByName("К");

        // check that the quantity of the elements in the List changes
        assertEquals(1, filteredUsers.size());

        // check the availability of the users
        assertTrue(filteredUsers.contains(userOne));
        assertFalse(filteredUsers.contains(userTwo));
        assertFalse(filteredUsers.contains(userThree));

        // check the order after filtering
        assertIterableEquals(List.of(userOne), filteredUsers);
    }
}