import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        MovieDatabase imdb = new MovieDatabase();
        imdb.readData();
        ArrayList<Movie> movies = imdb.movieIndex;
        imdb.sortDuration();
        System.out.println(movies);
        movies.sort(new ByRating());
//        System.out.println(movies);
        for(int i = 0; i < movies.size(); i++) {
            System.out.println(movies.get(i).getName() + " , " + movies.get(i).getRating());
        }

    }
