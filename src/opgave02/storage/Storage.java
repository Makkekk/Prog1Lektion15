package opgave02.storage;

import opgave02.models.Actor;
import opgave02.models.Movie;
import opgave02.models.TVSerie;

import java.security.AllPermission;
import java.util.ArrayList;

public class Storage {
    private ArrayList<Movie> movies = new ArrayList<Movie>();
    private ArrayList<TVSerie> series = new ArrayList<>();
    private ArrayList<Actor> actors = new ArrayList<Actor>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }

    public void addTVSerie(TVSerie serie) {
        series.add(serie);
    }


    public void printMovies() {
        if (movies.isEmpty()) {
            System.out.println("Ingen gemte film");
        } else {
            System.out.println("Film:");
            for (Movie movie : movies) {
                System.out.println("- " + movie);
            }
        }
    }

    public void printTvSeries() {
        if (series.isEmpty()) {
            System.out.println("Ingen gemte TV-Serier");
        } else {
            System.out.println("TV-Serier:");
            for (TVSerie serie : series) {
                System.out.println("- " + serie);
            }
        }
    }
}