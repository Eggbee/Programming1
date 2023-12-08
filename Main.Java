import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        MovieDatabase imdb = new MovieDatabase();
        imdb.readData();
        ArrayList<Movie> movies = imdb.movieIndex;

        //Query for Part  2
        imdb.sortDuration();
        System.out.println(movies);

        //Query for Part 3
        movies.sort(new ByRating());
        //Query for Part 4

        //Query for Part 5

        //Query for Part 6
    }
}
