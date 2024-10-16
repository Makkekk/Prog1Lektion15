package opgave02.models;

import java.util.ArrayList;
import java.util.Arrays;

public class TVSerie {
    private String title;
    private int numberOfSeasons;
    private Genre[] genres;
    private ArrayList<Actor> cast;

    public TVSerie(String title, int numberOfSeasons, Genre[] genres, ArrayList<Actor> cast) {
        this.title = title;
        this.numberOfSeasons = numberOfSeasons;
        this.genres = genres;
        this.cast = cast;
    }

    public String toString() {
        return title + " (Number of seasons: " + numberOfSeasons +"), Genres: " + Arrays.toString(genres) + ", cast: " + cast;
    }
}