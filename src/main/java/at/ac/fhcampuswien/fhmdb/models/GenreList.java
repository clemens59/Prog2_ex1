package at.ac.fhcampuswien.fhmdb.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenreList<T extends Enum<Genres>> {

    private List<T> genres;

    public GenreList() {
        this.genres = new ArrayList<>();
    }

    public void addGenre(T genre) {
        if (Arrays.asList(Genres.values()).contains(genre)) {
            this.genres.add(genre);
        } else {
            throw new IllegalArgumentException("Genre not supported");
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < genres.size(); i++) {
            sb.append(genres.get(i));
            if (i < genres.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }


    public List<T> getGenres() {
        return this.genres;
    }
}

