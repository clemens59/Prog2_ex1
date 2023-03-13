package at.ac.fhcampuswien.fhmdb.testingResources;

import at.ac.fhcampuswien.fhmdb.models.GenreList;
import at.ac.fhcampuswien.fhmdb.models.Genres;
import at.ac.fhcampuswien.fhmdb.models.Movie;

import java.util.ArrayList;
import java.util.List;

public class TestMovie {


    ArrayList<Movie> movies = new ArrayList<>();


    public TestMovie() {

        GenreList<Genres> testGenre = new GenreList<>();
        testGenre.addGenre(Genres.DRAMA);


        Movie a = new Movie ("A", "test",testGenre);
        Movie b = new Movie ("B", "test",testGenre);
        Movie c = new Movie ("C", "test",testGenre);
        Movie d = new Movie ("D", "test",testGenre);
        Movie e = new Movie ("E", "test",testGenre);



        movies.add(a);
        movies.add(b);
        movies.add(c);
        movies.add(d);
        movies.add(e);


    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }
}
