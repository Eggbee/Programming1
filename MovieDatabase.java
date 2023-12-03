import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.util.Scanner;

public class MovieDatabase {

    ArrayList<String> movieIndex = new ArrayList<>();
    String[] movieList = new String[6];
    MovieDatabase(){
        String name = movieList[0];
        String releaseDate = movieList[1];
        String certificate = movieList[2];
        String genre = movieList[3];
        String duration = movieList[4];
        String rating = movieList[5];
    }


    public static void main(String[] args) { //throws java.io.IOException{

        try {
            BufferedReader myData = new BufferedReader(new FileReader("movies.txt"));
            String line;
            while((line = myData.readLine()) != null)
                System.out.println(line);
                

        }catch (IOException e) {
            e.printStackTrace();
        }

    }
//    MovieDatabase[] MovieList;


}
