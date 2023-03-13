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
    void createController(){
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
        String expected = "Star Wars";

        assertEquals(expected, actual.get(0).getTitle());
    }


    @Test
    void genre_filter_history_returns_nothing(){
        //give
        String genre = "HISTORY";

        //when
        List<Movie> actual = homeController.filterByGenre(genre);

        //then
        boolean expected = true;

        assertEquals(expected, actual.isEmpty());
    }


    @Test
    void text_filter_star_returns_star_wars(){
        //give
        String text = "star";

        //when
        List<Movie> actual = homeController.filterByText(text);

        //then
        String expected = "Star Wars";

        assertEquals(expected, actual.get(0).getTitle());
    }


    @Test
    void text_filter_abcde_returns_empty(){
        //give
        String text = "abcde";

        //when
        List<Movie> actual = homeController.filterByText(text);

        //then
        boolean expected = true;

        assertEquals(expected, actual.isEmpty());
    }


    @Test
    void text_filter_AbCdE_returns_empty(){
        //give
        String text = "AbCdE";

        //when
        List<Movie> actual = homeController.filterByText(text);

        //then
        boolean expected = true;

        assertEquals(expected, actual.isEmpty());
    }


    @Test
    public void testSortMoviesByTitleAscending() {
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
    public void testSortMoviesByTitleDescending() {
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