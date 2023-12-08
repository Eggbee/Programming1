import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        MovieDatabase imdb = new MovieDatabase();
        imdb.readData();
        ArrayList<Movie> movies = imdb.movieIndex;
        imdb.sortDuration();
        System.out.println(movies);



    }
}
