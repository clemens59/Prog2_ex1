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
        GenreList<Genres> starwarsgenre = new GenreList<>();
        starwarsgenre.addGenre(Genres.ACTION);
        GenreList<Genres> midsommergenre = new GenreList<>();
        midsommergenre.addGenre(Genres.THRILLER);
        GenreList<Genres> shrekgenre = new GenreList<>();
        shrekgenre.addGenre(Genres.ADVENTURE);

        Movie a = new Movie ("A", "test",testGenre);
        Movie b = new Movie ("B", "test",testGenre);
        Movie c = new Movie ("C", "test",testGenre);
        Movie d = new Movie ("D", "test",testGenre);
        Movie e = new Movie ("E", "test",testGenre);
        Movie z = new Movie ("Z", "test",testGenre);
        Movie y = new Movie ("Y", "test",testGenre);
        Movie x = new Movie ("X", "test",testGenre);
        Movie w = new Movie ("W", "test",testGenre);
        Movie v = new Movie ("V", "test",testGenre);

        Movie star_wars = new Movie ("Star Wars", "A space opera set “a long time ago in a galaxy far, far away,” the film centres on Luke Skywalker (played by the then relatively unknown Mark Hamill), a young man who finds himself embroiled in an interplanetary war between an authoritarian empire and rebel forces.",starwarsgenre );
        Movie midsommer = new Movie("Midsommer", "Midsommar is a 2019 folk horror film written and directed by Ari Aster. The film stars Florence Pugh and Jack Reynor as a dysfunctional couple who travel to Sweden with a group of friends for a midsummer festival, only to find themselves in the clutches of a sinister cult practicing Scandinavian paganism.",midsommergenre );
        Movie shrek = new Movie("Shrek", "In the film, an embittered ogre named Shrek (Myers) finds his home in the swamp overrun by fairy tale creatures banished by the obsessive ruler Lord Farquaad (Lithgow). With the help of Donkey (Murphy), Shrek makes a pact with Farquaad to rescue Princess Fiona (Diaz) in exchange for regaining control of his swamp.", shrekgenre);



        movies.add(a);
        movies.add(b);
        movies.add(c);
        movies.add(d);
        movies.add(e);
        movies.add(z);
        movies.add(y);
        movies.add(x);
        movies.add(v);
        movies.add(w);
        movies.add(star_wars);
        movies.add(midsommer);
        movies.add(shrek);

    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }
}
