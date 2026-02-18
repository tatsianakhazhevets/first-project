package mentoringTests.Practice13_ComplexTask.Task_4;

import mentoring.Practice13_ComplexTask.Task_4.Movie;
import mentoring.Practice13_ComplexTask.Task_4.Rating;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class AddMovieRatingTest extends MovieServiceObjectSetUp {

    @Test
    public void shouldAddRatingForNewMovie() {
        Movie movie = new Movie("Movie");
        movieService.addMovieRating(movie, 5);

        Map<Movie, List<Rating<? extends Number>>> storage = movieService.getMovieRaring();

        assertEquals(1, storage.size());
        assertTrue(storage.containsKey(movie));
        assertEquals(1, storage.get(movie).size());
        assertEquals(5, storage.get(movie).get(0).getRating());
    }

    @Test
    public void shouldAddSecondRatingForDifferentMovie() {
        Movie movie1 = new Movie("Movie 1");
        movieService.addMovieRating(movie1, 7);

        Movie movie2 = new Movie("Movie 2");
        movieService.addMovieRating(movie2, 3);

        Map<Movie, List<Rating<? extends Number>>> storage = movieService.getMovieRaring();

        assertEquals(2, storage.size());
        assertTrue(storage.containsKey(movie1));
        assertTrue(storage.containsKey(movie2));
        assertEquals(7, storage.get(movie1).get(0).getRating());
        assertEquals(3, storage.get(movie2).get(0).getRating());
    }

    @Test
    public void shouldAddDifferentRatingsForSameMovie() {
        Movie movie = new Movie("Movie");
        movieService.addMovieRating(movie, 5);
        movieService.addMovieRating(movie, 8);

        Map<Movie, List<Rating<? extends Number>>> storage = movieService.getMovieRaring();

        assertEquals(1, storage.size());
        assertEquals(2, storage.get(movie).size());
        assertEquals(5, storage.get(movie).get(0).getRating());
        assertEquals(8, storage.get(movie).get(1).getRating());
    }

    @Test
    public void shouldAddMinRatingsForMovie() {
        Movie movie = new Movie("Movie");
        movieService.addMovieRating(movie, 1);

        Map<Movie, List<Rating<? extends Number>>> storage = movieService.getMovieRaring();

        assertEquals(1, storage.get(movie).size());
        assertEquals(1, storage.get(movie).get(0).getRating());
    }

    @Test
    public void shouldAddMaxRatingsForMovie() {
        Movie movie = new Movie("Movie");
        movieService.addMovieRating(movie, 10);

        Map<Movie, List<Rating<? extends Number>>> storage = movieService.getMovieRaring();

        assertEquals(1, storage.get(movie).size());
        assertEquals(10, storage.get(movie).get(0).getRating());
    }

    @Test
    public void shouldThrowExceptionWhenRatingBelowMin() {
        Movie movie = new Movie("Movie");

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> movieService.addMovieRating(movie, 0));

        assertTrue(exception.getMessage().contains("Rating must be between"));
    }

    @Test
    public void shouldThrowExceptionWhenRatingAboveMax() {
        Movie movie = new Movie("Movie");

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> movieService.addMovieRating(movie, 11));

        assertTrue(exception.getMessage().contains("Rating must be between"));
    }

    @Test
    public void shouldBeThreadsSafeWhenAddingRatingsForMovie() throws InterruptedException {

        Movie movie = new Movie("Movie");

        Thread t1 = new Thread(() -> movieService.addMovieRating(movie, 5));
        Thread t2 = new Thread(() -> movieService.addMovieRating(movie, 5));

        t1.start();;
        t2.start();
        t1.join();
        t2.join();

        Map<Movie, List<Rating<? extends Number>>> storage = movieService.getMovieRaring();

        assertEquals(1, storage.size());
        assertEquals(2, storage.get(movie).size());
        assertEquals(5, storage.get(movie).get(0).getRating());
        assertEquals(5, storage.get(movie).get(1).getRating());
    }
}