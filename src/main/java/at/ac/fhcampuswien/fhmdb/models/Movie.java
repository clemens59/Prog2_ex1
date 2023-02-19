package at.ac.fhcampuswien.fhmdb.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Movie {
    private String title;
    private String description;

    private List<String> Genres;
    // TODO add more properties here

    public Movie(String title, String description, List<String> Genres) {
        this.title = title;
        this.description = description;
        this.Genres = Genres;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
    @Override
    public String toString() {

        String delim = ", ";

        StringBuilder sb = new StringBuilder();

        int i = 0;
        while (i < Genres.size() - 1)
        {
            sb.append(Genres.get(i));
            sb.append(delim);
            i++;
        }
        sb.append(Genres.get(i));

         return sb.toString();
    }

    public static List<Movie> initializeMovies(){
        List<Movie> movies = new ArrayList<>();
        // TODO add some dummy data here

        List<String> starwarsgenre = List.of("SCIENCE FICTION", "ACTION");
        List<String> shrekgenre = List.of("VERY FUNNY");
        List<String> midsommergenre = List.of("SCARY");


        Movie star_wars = new Movie ("Star Wars", "A space opera set “a long time ago in a galaxy far, far away,” the film centres on Luke Skywalker (played by the then relatively unknown Mark Hamill), a young man who finds himself embroiled in an interplanetary war between an authoritarian empire and rebel forces.",starwarsgenre );
        Movie midsommer = new Movie("Midsommer", "Midsommar is a 2019 folk horror film written and directed by Ari Aster. The film stars Florence Pugh and Jack Reynor as a dysfunctional couple who travel to Sweden with a group of friends for a midsummer festival, only to find themselves in the clutches of a sinister cult practicing Scandinavian paganism.",midsommergenre );
        Movie shrek = new Movie("Shrek", "In the film, an embittered ogre named Shrek (Myers) finds his home in the swamp overrun by fairy tale creatures banished by the obsessive ruler Lord Farquaad (Lithgow). With the help of Donkey (Murphy), Shrek makes a pact with Farquaad to rescue Princess Fiona (Diaz) in exchange for regaining control of his swamp.", shrekgenre);

        movies.add(star_wars);
        movies.add(midsommer);
        movies.add(shrek);

        return movies;
    }
}
