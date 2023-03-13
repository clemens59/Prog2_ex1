package at.ac.fhcampuswien.fhmdb;


import at.ac.fhcampuswien.fhmdb.models.GenreList;
import at.ac.fhcampuswien.fhmdb.models.Genres;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class GenreListTest {

    @Test
    void GenreList_toString(){
        //Arrange
        GenreList<Genres> TestGenreList = new GenreList<>();
        TestGenreList.addGenre(Genres.ACTION);
        TestGenreList.addGenre(Genres.HORROR);


        //Act
        String toString = TestGenreList.toString();


        //Assert
        Assertions.assertEquals("ACTION, HORROR",toString);
    }

    @Test
    void GenreList_addGenre(){
        //Arrange
        GenreList<Genres> TestGenreList = new GenreList<>();


        //Act
        TestGenreList.addGenre(Genres.HISTORY);


        //Assert
        Assertions.assertEquals(Genres.HISTORY.toString(),TestGenreList.toString());
    }


}
