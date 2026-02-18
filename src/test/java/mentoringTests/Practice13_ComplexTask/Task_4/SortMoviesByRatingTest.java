package mentoringTests.Practice13_ComplexTask.Task_4;

import mentoring.Practice13_ComplexTask.Task_4.Movie;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortMoviesByRatingTest extends MovieServiceObjectSetUp {

    @Test
    public void shouldSortMoviesByRatingDescending() {
        Movie movie1 = new Movie("Movie1"); // 4.6
        movieService.addMovieRating(movie1, 5);
        movieService.addMovieRating(movie1, 1);
        movieService.addMovieRating(movie1, 8);
        Movie movie2 = new Movie("Movie2"); // 5.5
        movieService.addMovieRating(movie2, 5);
        movieService.addMovieRating(movie2, 6);
        Movie movie3 = new Movie("Movie3"); // 5
        movieService.addMovieRating(movie3, 5);
        movieService.addMovieRating(movie3, 5);
        movieService.addMovieRating(movie3, 5);
        Movie movie4 = new Movie("Movie4"); // 7
        movieService.addMovieRating(movie4, 7);

        List<Movie> sortedMoviesActualResult = movieService.sortMoviesByRating();
        List<Movie> sortedMoviesExpectedResult = List.of(movie4, movie2, movie3, movie1);
        assertIterableEquals(sortedMoviesExpectedResult, sortedMoviesActualResult);
    }

    @Test
    public void shouldSortMoviesWithSameRating() {
        Movie movie1 = new Movie("Movie1");
        movieService.addMovieRating(movie1, 5);
        movieService.addMovieRating(movie1, 5);
        movieService.addMovieRating(movie1, 5);
        Movie movie2 = new Movie("Movie2");
        movieService.addMovieRating(movie2, 5);
        movieService.addMovieRating(movie2, 5);


        List<Movie> sortedMoviesActualResult = movieService.sortMoviesByRating();
        assertEquals(2, sortedMoviesActualResult.size());
        assertTrue(sortedMoviesActualResult.contains(movie1));
        assertTrue(sortedMoviesActualResult.contains(movie2));
    }

    @Test
    public void shouldSortOneMoviesWithRatingRating() {
        Movie movie1 = new Movie("Movie1");
        movieService.addMovieRating(movie1, 5);

        List<Movie> sortedMoviesActualResult = movieService.sortMoviesByRating();
        assertEquals(1, sortedMoviesActualResult.size());
        assertTrue(sortedMoviesActualResult.contains(movie1));
    }

    @Test
    public void shouldReturnEmptyListAfterSoringMovie() {

        List<Movie> sortedMoviesActualResult = movieService.sortMoviesByRating();
        List<Movie> sortedMoviesExpectedResult = List.of();
        assertIterableEquals(sortedMoviesExpectedResult, sortedMoviesActualResult);
    }

    @Test
    public void shouldBeThreadsSafeWhenSortingMovieWithRatings() throws InterruptedException {

        Movie movie1 = new Movie("Movie1");//4.6
        movieService.addMovieRating(movie1, 5);
        movieService.addMovieRating(movie1, 1);
        movieService.addMovieRating(movie1, 8);
        Movie movie2 = new Movie("Movie2"); //5.5
        movieService.addMovieRating(movie2, 5);
        movieService.addMovieRating(movie2, 6);

        Thread t1 = new Thread(() -> movieService.sortMoviesByRating());
        Thread t2 = new Thread(() -> movieService.sortMoviesByRating());

        t1.start();;
        t2.start();
        t1.join();
        t2.join();

        List<Movie> sortedMoviesActualResult = movieService.sortMoviesByRating();
        List<Movie> sortedMoviesExpectedResult = List.of( movie2, movie1);
        assertIterableEquals(sortedMoviesExpectedResult, sortedMoviesActualResult);
    }
}