import java.util.Comparator;

public class ByRating implements Comparator<Movie> {
    @Override
    public int compare(Movie movie1, Movie movie2) {
        return (int)(movie1.getRating() * 10) - (int)(movie2.getRating() * 10);
    }

    public static void main(String[] args) {

    }
}
