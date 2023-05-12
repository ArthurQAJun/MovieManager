import org.example.MovieManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void ShouldTestAllMovie() {
        String movie1 = "Movie 1";
        String movie2 = "Movie 2";
        String movie3 = "Movie 3";

        MovieManager manager = new MovieManager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);

        String[] expected = {"Movie 1", "Movie 2", "Movie 3"};
        String[] actual = manager.findAllMovie();


        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldTestLastMovie() {
        String movie1 = "Movie 1";
        String movie2 = "Movie 2";
        String movie3 = "Movie 3";

        MovieManager manager = new MovieManager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);

        String[] expected = {"Movie 3", "Movie 2", "Movie 1"};
        String[] actual = manager.findLastMovie();


        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldTestLimitAllMovie() {
        String movie1 = "Movie 1";
        String movie2 = "Movie 2";
        String movie3 = "Movie 3";
        String movie4 = "Movie 4";
        String movie5 = "Movie 5";
        String movie6 = "Movie 6";
        String movie7 = "Movie 7";
        String movie8 = "Movie 8";
        String movie9 = "Movie 9";
        String movie10 = "Movie 10";


        MovieManager manager = new MovieManager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);


        String[] expected = {"Movie 1", "Movie 2", "Movie 3", "Movie 4", "Movie 5", "Movie 6", "Movie 7", "Movie 8", "Movie 9", "Movie 10"};
        String[] actual = manager.findAllMovie();


        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldTestOverLimitLastMovie() {
        String movie1 = "Movie 1";
        String movie2 = "Movie 2";
        String movie3 = "Movie 3";
        String movie4 = "Movie 4";
        String movie5 = "Movie 5";
        String movie6 = "Movie 6";
        String movie7 = "Movie 7";
        String movie8 = "Movie 8";
        String movie9 = "Movie 9";
        String movie10 = "Movie 10";
        String movie11 = "Movie 11";


        MovieManager manager = new MovieManager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);
        manager.addMovie(movie11);


        String[] expected = {"Movie 11", "Movie 10", "Movie 9", "Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2"};
        String[] actual = manager.findLastMovie();


        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldTestOnLimitLastMovie() {
        String movie1 = "Movie 1";
        String movie2 = "Movie 2";
        String movie3 = "Movie 3";
        String movie4 = "Movie 4";
        String movie5 = "Movie 5";
        String movie6 = "Movie 6";
        String movie7 = "Movie 7";
        String movie8 = "Movie 8";
        String movie9 = "Movie 9";
        String movie10 = "Movie 10";


        MovieManager manager = new MovieManager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);


        String[] expected = {"Movie 10", "Movie 9", "Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = manager.findLastMovie();


        Assertions.assertArrayEquals(expected, actual);
    }
}
