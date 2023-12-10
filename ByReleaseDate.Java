import java.util.Collections;
import java.util.Comparator;

import static java.util.Collections.reverse;

public class ByReleaseDate implements Comparator<Movie> {
    @Override
    public int compare(Movie movie1, Movie movie2) {
        return movie1.getReleaseDate() - movie2.getReleaseDate();
    }



    public static void main(String[] args) {
        System.out.println();
    }
}
