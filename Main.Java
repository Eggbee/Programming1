import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        MovieDatabase imdb = new MovieDatabase();
        imdb.readData(); //reads in the data from the database


        //Query for Part  2
        ArrayList<Movie> movies = imdb.movieIndex;
        imdb.sortDuration();
        System.out.println(movies);
        //Query for Part 3
        movies.sort(new ByRating());
        System.out.println("The lowest rated Sci-Fi movie is: " + imdb.sciFi());
        //Query for Part 4
        System.out.println("The fifth most recent PG movie is: " + imdb.PGratedMovie());
        //Query for Part 5
        System.out.println("The movie with the longest name is: " + imdb.longestName());
        //Query for Part 6
        System.out.println("The number of years seperating the oldest and newest films is : " + imdb.sortReleaseDate());

    }
}
