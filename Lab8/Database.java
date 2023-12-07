import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Database {
    private Set<Movie> movies;
    private Set<Actor> actors;

    public Database() {
        this.movies = new HashSet<>();
        this.actors = new HashSet<>();
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public Set<Actor> getActors() {
        return actors;
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }

    public boolean hasActorNotInAnyMovie() {
        for (Actor actor : actors) {
            if (actor.getMovies().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public List<Actor> getCoActors(Actor targetActor) {
        Set<Actor> coActors = new HashSet<>();

        Iterator<Movie> movieIterator = targetActor.getMovies().iterator();
        while (movieIterator.hasNext()) {
            Movie movie = movieIterator.next();

            Iterator<Actor> actorIterator = movie.getActors().iterator();
            while (actorIterator.hasNext()) {
                Actor actor = actorIterator.next();
                if (!actor.equals(targetActor)) {
                    coActors.add(actor);
                }
            }
        }

        return new ArrayList<>(coActors);
    }

    public Movie findMovieWithMostActors() {
        Iterator<Movie> iterator = movies.iterator();
        Movie movieWithMostActors = iterator.next();

        while (iterator.hasNext()) {
            Movie currentMovie = iterator.next();
            if (currentMovie.getActors().size() > movieWithMostActors.getActors().size()) {
                movieWithMostActors = currentMovie;
            }
        }

        return movieWithMostActors;
    }
}
