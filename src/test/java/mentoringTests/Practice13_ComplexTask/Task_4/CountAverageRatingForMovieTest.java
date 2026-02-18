package mentoringTests.Practice13_ComplexTask.Task_4;

import mentoring.Practice13_ComplexTask.Task_4.Movie;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountAverageRatingForMovieTest extends MovieServiceObjectSetUp {

    @Test
    public void shouldReturnAverageRatingWithOddValuesForMovie() {
        Movie movie = new Movie("Movie");
        movieService.addMovieRating(movie, 1);
        movieService.addMovieRating(movie, 5);
        movieService.addMovieRating(movie, 10);

        double averageActualResult = movieService.countAverageRatingForMovie(movie);
        assertEquals(5.3, averageActualResult);
    }

    @Test
    public void shouldReturnAverageRatingWithEvenValuesForMovie() {
        Movie movie = new Movie("Movie");
        movieService.addMovieRating(movie, 4);
        movieService.addMovieRating(movie, 6);

        double averageActualResult = movieService.countAverageRatingForMovie(movie);
        assertEquals(5.0, averageActualResult);
    }

    @Test
    public void shouldReturnAverageRatingWithSingleValuesForMovie() {
        Movie movie = new Movie("Movie");
        movieService.addMovieRating(movie, 7);

        double averageActualResult = movieService.countAverageRatingForMovie(movie);
        assertEquals(7.0, averageActualResult);
    }

    @Test
    public void shouldReturnAverageRatingWithSameValuesForMovie() {
        Movie movie = new Movie("Movie");
        movieService.addMovieRating(movie, 4);
        movieService.addMovieRating(movie, 4);
        movieService.addMovieRating(movie, 4);
        movieService.addMovieRating(movie, 4);

        double averageActualResult = movieService.countAverageRatingForMovie(movie);
        assertEquals(4.0, averageActualResult);
    }

    @Test
    public void shouldReturnZeroRatingForNotAddedMovie() {
        Movie movie = new Movie("Movie");

        double averageActualResult = movieService.countAverageRatingForMovie(movie);
        assertEquals(0.0, averageActualResult);
    }

    @Test
    public void shouldBeThreadsSafeWhenCountingAverageRatingsForMovie() throws InterruptedException {

        Movie movie = new Movie("Movie");

        Thread t1 = new Thread(() -> movieService.addMovieRating(movie, 6));
        Thread t2 = new Thread(() -> movieService.addMovieRating(movie, 7));

        t1.start();;
        t2.start();
        t1.join();
        t2.join();

        double averageActualResult = movieService.countAverageRatingForMovie(movie);
        assertEquals(6.5, averageActualResult);
    }
}