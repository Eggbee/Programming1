import java.util.Comparator;

public class ByReleaseDate implements Comparator<Movie> {
    @Override
    public int compare(Movie movie1, Movie movie2) {
        return movie1.getReleaseDate() - movie2.getReleaseDate();
    }

    public static void main(String[] args) {

    }
}
