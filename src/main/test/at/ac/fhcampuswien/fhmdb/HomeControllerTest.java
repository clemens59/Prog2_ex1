package at.ac.fhcampuswien.fhmdb;


import at.ac.fhcampuswien.fhmdb.models.GenreList;
import at.ac.fhcampuswien.fhmdb.models.Genres;
import at.ac.fhcampuswien.fhmdb.models.Movie;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import at.ac.fhcampuswien.fhmdb.testingResources.TestMovie;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HomeControllerTest {

    HomeController homeController;
    TestMovie testMovie;

    @BeforeEach
    void createTestingResources(){
        homeController = new HomeController();
        testMovie = new TestMovie();
    }



    @Test
    void genre_filter_action_returns_star_wars(){
        //give
        String genre = "ACTION";

        //when
        List<Movie> actual = homeController.filterByGenre(genre);

        //then
        List<Movie> expected = new ArrayList<>();

        GenreList<Genres> starwarsgenre = new GenreList<>();
        starwarsgenre.addGenre(Genres.ACTION);

        Movie star_wars = new Movie ("Star Wars", "A space opera set “a long time ago in a galaxy far, far away,” the film centres on Luke Skywalker (played by the then relatively unknown Mark Hamill), a young man who finds himself embroiled in an interplanetary war between an authoritarian empire and rebel forces.",starwarsgenre );
        expected.add(star_wars);

        assertEquals(expected, actual);
    }

    @Test
    void genre_filter_history_returns_nothing(){
        //give
        String genre = "HISTORY";

        //when
        List<Movie> actual = homeController.filterByGenre(genre);

        //then
        List<Movie> expected = new ArrayList<>();

        assertEquals(expected, actual);
    }

    @Test
    void text_filter_star_returns_star_wars(){
        //give
        String text = "star";

        //when
        List<Movie> actual = homeController.filterByText(text);

        //then
        List<Movie> expected = new ArrayList<>();

        GenreList<Genres> starwarsgenre = new GenreList<>();
        starwarsgenre.addGenre(Genres.ACTION);

        Movie star_wars = new Movie ("Star Wars", "A space opera set “a long time ago in a galaxy far, far away,” the film centres on Luke Skywalker (played by the then relatively unknown Mark Hamill), a young man who finds himself embroiled in an interplanetary war between an authoritarian empire and rebel forces.",starwarsgenre );
        expected.add(star_wars);

        assertEquals(expected, actual);
    }
    @Test
    public void test_sort_movies_by_title_ascending() {
        // Arrange
        List<Movie> sortedMovies = testMovie.getMovies();

        // Act
        homeController.sortByTitleAscending(sortedMovies);

        // Assert
        Assertions.assertEquals("A", sortedMovies.get(0).getTitle());
        Assertions.assertEquals("B", sortedMovies.get(1).getTitle());
        Assertions.assertEquals("C", sortedMovies.get(2).getTitle());
        Assertions.assertEquals("D", sortedMovies.get(3).getTitle());
        Assertions.assertEquals("E", sortedMovies.get(4).getTitle());
    }

    @Test
    public void test_sort_movies_by_title_descending() {
        // Arrange
        List<Movie> sortedMovies = testMovie.getMovies();

        // Act
        homeController.sortByTitleDescending(sortedMovies);

        // Assert
        Assertions.assertEquals("E", sortedMovies.get(0).getTitle());
        Assertions.assertEquals("D", sortedMovies.get(1).getTitle());
        Assertions.assertEquals("C", sortedMovies.get(2).getTitle());
        Assertions.assertEquals("B", sortedMovies.get(3).getTitle());
        Assertions.assertEquals("A", sortedMovies.get(4).getTitle());
    }



}