import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class MovieDatabase {

    // MovieDatabase(){
    //     String name = movieList[0];
    //     String releaseDate = movieList[1];
    //     String certificate = movieList[2];
    //     String genre = movieList[3];
    //     String duration = movieList[4];
    //     String rating = movieList[5];
    // }

    static ArrayList<Movie> movieIndex = new ArrayList<>();
    private static String[] movieList = new String[6];

    public static void main(String[] args) { //throws java.io.IOException{

        try {
            BufferedReader myData = new BufferedReader(new FileReader("movies.txt"));
            String line;
            while((line = myData.readLine()) != null) {
                //System.out.println(line);
                Movie newmovie = new Movie(line);
                //System.out.println(newmovie);
                movieIndex.add(newmovie);

                //add movies to list
//                for (int i = 1; i <= 6; i++) {
//                    //potentially remove/ add ""
//                    movieList[i] = fields[i];
//                }
                //pass through constructor
                //potentially add object name to movieindex, potentially with a key
                //clear movielist

            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
//    MovieDatabase[] MovieList;


}

