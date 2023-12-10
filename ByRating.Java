import java.util.Comparator;

public class ByRating implements Comparator<Movie> {
    @Override
    public int compare(Movie movie1, Movie movie2) {
        return (int)(movie1.getRating() * 10) - (int)(movie2.getRating() * 10); //We multiplied these by ten to obtain whole integers which were easier to work with for the meantime
    }

    public static void main(String[] args) {

    }
}
