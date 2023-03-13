package at.ac.fhcampuswien.fhmdb.models;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private String description;

    private GenreList<Genres> newGenres;
    // TODO add more properties here

    public Movie(String title, String description, GenreList<Genres> Genres) {
        this.title = title;
        this.description = description;
        this.newGenres = Genres;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;

    }

    public String getStringGenre() {
        return newGenres.toString();
    }

    public static List<Movie> initializeMovies(){
        List<Movie> movies = new ArrayList<>();
        // TODO add some dummy data here

        GenreList<Genres> starwarsgenre = new GenreList<>();
        starwarsgenre.addGenre(Genres.ACTION);

        GenreList<Genres> midsommergenre = new GenreList<>();
        midsommergenre.addGenre(Genres.THRILLER);

        GenreList<Genres> shrekgenre = new GenreList<>();
        shrekgenre.addGenre(Genres.ADVENTURE);

        GenreList<Genres> theGodfathergenre = new GenreList<>();
        theGodfathergenre.addGenre(Genres.CRIME);
        theGodfathergenre.addGenre(Genres.DRAMA);

        GenreList<Genres> theDarkKnightgenre = new GenreList<>();
        theDarkKnightgenre.addGenre(Genres.ACTION);
        theDarkKnightgenre.addGenre(Genres.CRIME);
        theDarkKnightgenre.addGenre(Genres.DRAMA);

        GenreList<Genres> inceptiongenre = new GenreList<>();
        inceptiongenre.addGenre(Genres.ACTION);
        inceptiongenre.addGenre(Genres.ADVENTURE);
        inceptiongenre.addGenre(Genres.SCIENCE_FICTION);

        GenreList<Genres> parasitegenre = new GenreList<>();
        parasitegenre.addGenre(Genres.DRAMA);
        parasitegenre.addGenre(Genres.THRILLER);

        Movie star_wars = new Movie ("Star Wars", "A space opera set “a long time ago in a galaxy far, far away,” the film centres on Luke Skywalker (played by the then relatively unknown Mark Hamill), a young man who finds himself embroiled in an interplanetary war between an authoritarian empire and rebel forces.",starwarsgenre );
        Movie midsommer = new Movie("Midsommer", "Midsommar is a 2019 folk horror film written and directed by Ari Aster. The film stars Florence Pugh and Jack Reynor as a dysfunctional couple who travel to Sweden with a group of friends for a midsummer festival, only to find themselves in the clutches of a sinister cult practicing Scandinavian paganism.",midsommergenre );
        Movie shrek = new Movie("Shrek", "In the film, an embittered ogre named Shrek (Myers) finds his home in the swamp overrun by fairy tale creatures banished by the obsessive ruler Lord Farquaad (Lithgow). With the help of Donkey (Murphy), Shrek makes a pact with Farquaad to rescue Princess Fiona (Diaz) in exchange for regaining control of his swamp.", shrekgenre);
        Movie theGodfather = new Movie("The Godfather", "The Godfather Don Vito Corleone is the head of the Corleone mafia family in New York. He is at the event of his daughter's wedding. Michael, Vito's youngest son and a decorated WW II Marine is also present at the wedding. Michael seems to be uninterested in being a part of the family business. Vito is a powerful man, and is kind to all those who give him respect but is ruthless against those who do not. But when a powerful and treacherous rival wants to sell drugs and needs the Don's influence for the same, Vito refuses to do it. What follows is a clash between Vito's fading old values and the new ways which may cause Michael to do the thing he was most reluctant in doing and wage a mob war against all the other mafia families which could tear the Corleone family apart.", theGodfathergenre);
        Movie theDarkKnight = new Movie("The Dark Knight","Set within a year after the events of Batman Begins (2005), Batman, Lieutenant James Gordon, and new District Attorney Harvey Dent successfully begin to round up the criminals that plague Gotham City, until a mysterious and sadistic criminal mastermind known only as \"The Joker\" appears in Gotham, creating a new wave of chaos. Batman's struggle against The Joker becomes deeply personal, forcing him to confront everything he believes and improve his technology to stop him. A love triangle develops between Bruce Wayne, Dent, and Rachel Dawes", theDarkKnightgenre);
        Movie inception = new Movie("Inception", "Dom Cobb is a skilled thief, the absolute best in the dangerous art of extraction, stealing valuable secrets from deep within the subconscious during the dream state, when the mind is at its most vulnerable. Cobb's rare ability has made him a coveted player in this treacherous new world of corporate espionage, but it has also made him an international fugitive and cost him everything he has ever loved. Now Cobb is being offered a chance at redemption. One last job could give him his life back but only if he can accomplish the impossible, inception. Instead of the perfect heist, Cobb and his team of specialists have to pull off the reverse: their task is not to steal an idea, but to plant one. If they succeed, it could be the perfect crime. But no amount of careful planning or expertise can prepare the team for the dangerous enemy that seems to predict their every move. An enemy that only Cobb could have seen coming.", inceptiongenre);
        Movie parasite = new Movie ("Parasite", "The Kims - mother and father Chung-sook and Ki-taek, and their young adult offspring, son Ki-woo and daughter Ki-jung - are a poor family living in a shabby and cramped half basement apartment in a busy lower working class commercial district of Seoul. Without even knowing it, they, especially Mr. and Mrs. Kim, literally smell of poverty. Often as a collective, they perpetrate minor scams to get by, and even when they have jobs, they do the minimum work required. Ki-woo is the one who has dreams of getting out of poverty by one day going to university.",parasitegenre);


        movies.add(star_wars);
        movies.add(midsommer);
        movies.add(shrek);
        movies.add(theGodfather);
        movies.add(theDarkKnight);
        movies.add(inception);
        movies.add(parasite);

        return movies;
    }
}
