import javax.swing.text.html.StyleSheet;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import static java.util.Collections.reverse;

public class MovieDatabase {

    static ArrayList<Movie> movieIndex = new ArrayList<>();

    public void readData()
    {
        try
        {
            BufferedReader myData = new BufferedReader(new FileReader("movies.txt"));
            String line;
            while ((line = myData.readLine()) != null)
            {

                Movie newmovie = new Movie(line);

                movieIndex.add(newmovie);
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    //sort by Duration
    public static void sortDuration(){
        Collections.sort(movieIndex);
        reverse(movieIndex); //converts from ascending order to descending order
    }

    public Integer sortReleaseDate(){
        ArrayList<Integer> listOfYears = new ArrayList<>();
        for (Movie movie : movieIndex) {
            listOfYears.add(movie.getReleaseDate());
        }
        Collections.sort(movieIndex, new ByReleaseDate());
        Integer latestYear = Collections.max(listOfYears);
        Integer oldestYear = Collections.min(listOfYears);
        Integer yearGap = latestYear - oldestYear;
        return yearGap;
    }
    public static class ByReleaseDate implements Comparator<Movie> {
        @Override
        public int compare(Movie movie1, Movie movie2) {
            return movie1.getReleaseDate() - movie2.getReleaseDate();
        }
    }

    //find the longest name
    public Movie longestName()
    {
        Collections.sort(movieIndex);
        Movie longestName = movieIndex.get(0);
        for(Movie movie:movieIndex){
            if (movie.getName().length() > longestName.getName().length())
            {
                longestName = movie;
            }
        }
        return longestName;

    }

    public static void main(String[] args) {

    }





}




