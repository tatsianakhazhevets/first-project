package mentoringTests.Practice13_ComplexTask.Task_1;

import mentoring.Practice13_ComplexTask.Task_1.User;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EntityManagerFilterByAgeTest extends EntityManagerSetObject {

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

        List<User> filteredUsers = em.filterByAge(18, 55);

        // check that the size is different from List<User> usersBeforeFiltering
        assertEquals(2, filteredUsers.size());

        // check the availability of the users
        assertFalse(filteredUsers.contains(userOne));
        assertTrue(filteredUsers.contains(userTwo));
        assertTrue(filteredUsers.contains(userThree));
        assertFalse(filteredUsers.contains(userFour));
        assertFalse(filteredUsers.contains(userFive));

        // check the order after filtering
        assertIterableEquals(List.of(userTwo, userThree), filteredUsers);
    }


    @Test
    public void shouldReturnElementsInBorder() {
        User userOne = new User(18, "Коля", true);
        User userTwo = new User(55, "Оля", true);

        em.add(userOne);
        em.add(userTwo);

        List<User> usersBeforeFiltering = em.getAll();
        assertEquals(2, usersBeforeFiltering.size());

        List<User> filteredUsers = em.filterByAge(18, 55);

        // check that the size do not change
        assertEquals(2, filteredUsers.size());
    }


    @Test
    public void shouldReturnEmptyListWhenNoMatches() {
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

        List<User> filteredUsers = em.filterByAge(0, 3);

        // check that the List is empty
        assertTrue(filteredUsers.isEmpty());
    }


    @Test
    public void shouldReturnListWithSameQuantityOfElements() {
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

        List<User> filteredUsers = em.filterByAge(0, 3);

        // check that the quantity of the elements in the List does not change
        assertEquals(5, usersBeforeFiltering.size());
    }


    @Test
    public void shouldReturnEmptyListWhenFilteringEmptyList() {
        List<User> usersBeforeFiltering = em.getAll();
        assertEquals(0, usersBeforeFiltering.size());

        List<User> filteredUsers = em.filterByAge(0, 3);

        // check that the List is Empty
        assertTrue(filteredUsers.isEmpty());
    }
}