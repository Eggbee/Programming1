import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import static java.util.Collections.reverse;

public class MovieDatabase {

    static ArrayList<Movie> movieIndex = new ArrayList<>(); //create an array to allow for indexes for each movie to be created

    public void readData() //method used to read in the data from the movies.txt file
    {
        try
        {
            BufferedReader myData = new BufferedReader(new FileReader("movies.txt")); //provides the file name to be read in
            String line;
            while ((line = myData.readLine()) != null)
            {

                Movie newmovie = new Movie(line);

                movieIndex.add(newmovie); //add the movie to the array
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }



    //sort by Duration
    public static void sortDuration(){
        Collections.sort(movieIndex); //sorts the array in ascending order
        reverse(movieIndex); //converts from ascending order to descending order
    }


    public static class ByReleaseDate implements Comparator<Movie> {
        @Override
        public int compare(Movie movie1, Movie movie2) {
            return movie1.getReleaseDate() - movie2.getReleaseDate(); //compares two movies and returns the gap in between each release year
        }
    }

    //finds the lowest rated sci-fi film
    public Movie sciFi() {
        List<Movie> filteredGenres = new ArrayList<>();
        for(Movie movie:movieIndex){
            if (movie.getGenre().contains("Sci-Fi") == true) { //if the genre of 'Sci-Fi' is present, then the index of that movie is added to the filteredGenres list
                filteredGenres.add(movie);
            }
        }
        Collections.sort(filteredGenres);
        filteredGenres.sort(new ByRating()); //the filteredGenres list is then sorted by their rating in ascending order and returns the first value of the string
        return filteredGenres.get(0);
    }

    //Finds the five most recent PG film
    public Movie PGratedMovie()
    {
        ArrayList<Movie> filteredCertificates = new ArrayList<>();
        for(Movie movie:movieIndex){

            String temp = movie.getCertificate().replaceAll("\"",""); //removes speech marks from certificate attribute and adds to temporary string using regular expression
            if (temp.equals("PG") == true) { //The link below was used to help split the 'Certificate' field as we experienced issues due to the PG-13 rating
                filteredCertificates.add(movie); //https://www.baeldung.com/java-remove-start-end-double-quote#:~:text=Using%20replaceAll%2C%20we%20can%20remove,the%20string%20has%20multiple%20lines.
            }//and if the genre is equal to PG then it is added to the filteredCertificates arrayList
        }
        Collections.sort(filteredCertificates);
        filteredCertificates.sort(new ByReleaseDate());
        reverse(filteredCertificates); //the arrayLost is then sorted into ascending order by releaseDate and then flipped into descednding order where the fifth movie is selected
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
                longestName = movie; //the collection of movies is iterated through to find the longest named film which is then returned
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
        Integer latestYear = Collections.max(listOfYears); //the arrayList of movies is sorted by releaseDate and then the very first and very last values are retreived and compared to find the year gap
        Integer oldestYear = Collections.min(listOfYears);
        Integer yearGap = latestYear - oldestYear;
        return yearGap;
    }

    public static void main(String[] args) {

    }

}









