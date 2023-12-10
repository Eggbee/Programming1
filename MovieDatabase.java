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


    public static class ByReleaseDate implements Comparator<Movie> {
        @Override
        public int compare(Movie movie1, Movie movie2) {
            return movie1.getReleaseDate() - movie2.getReleaseDate();
        }
    }

    //finds the lowest rated sci-fi film
    public Movie sciFi() {
        List<Movie> filteredGenres = new ArrayList<>();
        for(Movie movie:movieIndex){
            if (movie.getGenre().contains("Sci-Fi") == true) {
                filteredGenres.add(movie);
            }
        }
        Collections.sort(filteredGenres);
        filteredGenres.sort(new ByReleaseDate());
        return filteredGenres.get(0);
    }

    //Finds the five most recent PG film
    public Movie PGratedMovie()
    {
        ArrayList<Movie> filteredCertificates = new ArrayList<>();
        for(Movie movie:movieIndex){
            String temp = movie.getCertificate().replaceAll("\"","");
            if (temp.equals("PG") == true) {
                filteredCertificates.add(movie);
            }
        }
        Collections.sort(filteredCertificates);
        filteredCertificates.sort(new ByReleaseDate());
        reverse(filteredCertificates);
        return filteredCertificates.get(4);
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

    //find the gap between the oldest and newest film
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

    public static void main(String[] args) {

    }
    
}





