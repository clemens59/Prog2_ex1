package at.ac.fhcampuswien.fhmdb;

import at.ac.fhcampuswien.fhmdb.models.Genres;
import at.ac.fhcampuswien.fhmdb.models.Movie;
import at.ac.fhcampuswien.fhmdb.ui.MovieCell;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXListView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.*;

public class HomeController implements Initializable {
    @FXML
    public JFXButton searchBtn;

    @FXML
    public TextField searchField;

    @FXML
    public JFXListView movieListView;

    @FXML
    public JFXComboBox genreComboBox;

    @FXML
    public JFXButton sortBtn;

    public List<Movie> allMovies = Movie.initializeMovies();

    public List<Genres> allGenre = Arrays.asList(Genres.values());

    private final ObservableList<Movie> observableMovies = FXCollections.observableArrayList();   // automatically updates corresponding UI elements when underlying data changes

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        observableMovies.addAll(allMovies);         // add dummy data to observable list

        // initialize UI stuff
        movieListView.setItems(observableMovies);   // set data of observable list to list view
        movieListView.setCellFactory(movieListView -> new MovieCell()); // use custom cell factory to display data

        // TODO add genre filter items with genreComboBox.getItems().addAll(...)
        genreComboBox.setPromptText("Filter by Genre");
        genreComboBox.getItems().addAll(allGenre);

        // TODO add event handlers to buttons and call the regarding methods
        // either set event handlers in the fxml file (onAction) or add them here

        //search button
        searchBtn.setOnAction(actionEvent -> {
            // TODO add button functions markrei
        });

        // Sort button example:
        sortBtn.setOnAction(actionEvent -> {
            if(sortBtn.getText().equals("Sort (asc)")) {
                // TODO sort observableMovies ascending
                sortByTitleAscending(observableMovies);


                sortBtn.setText("Sort (desc)");
            } else {
                // TODO sort observableMovies descending
                sortByTitleDescending(observableMovies);
                sortBtn.setText("Sort (asc)");
            }
        });


    }

    public List<Movie> filterByGenre(String genre) {
        List<Movie> movies = new ArrayList<>();
        String expected;
        String actual;

        for (Movie movie : allMovies){
            expected = genre.toString();
            actual = movie.getGenre();

            if(movie.getGenre().equals(genre)){
                movies.add(movie);
            }
        }
        return movies;
    }

    public List<Movie> filterByText(String text) {
        List<Movie> movies = new ArrayList<>();

        for (Movie movie : allMovies){
            if(movie.getTitle().matches(text)){
                movies.add(movie);
            } else if (movie.getDescription().matches(text)){
                movies.add(movie);
            }
        }
        return movies;
    }

    public static List<Movie> sortByTitleAscending(List<Movie> movies) {
        Collections.sort(movies, (m1, m2) -> m1.getTitle().compareTo(m2.getTitle()));
        return movies;
    }

    public static List<Movie> sortByTitleDescending(List<Movie> movies) {
        Collections.sort(movies, (m1, m2) -> m2.getTitle().compareTo(m1.getTitle()));
        return movies;
    }


}