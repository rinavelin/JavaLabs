import java.util.ArrayList;
import java.util.List;

public class Actor {
    private String name;
    private List<Movie> movies;

    public Actor(String name) {
        this.name = name;
        this.movies = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    @Override
    public String toString() {
        return name;
    }
}