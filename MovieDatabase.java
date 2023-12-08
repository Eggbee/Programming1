import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class MovieDatabase {

    static ArrayList<Movie> movieIndex = new ArrayList<>();


    public static void main(String[] args) { //throws java.io.IOException{

        try {
            BufferedReader myData = new BufferedReader(new FileReader("movies.txt"));
            String line;
            while((line = myData.readLine()) != null) {
//                System.out.println(line);
                Movie newmovie = new Movie(line);
//                System.out.println(newmovie);
                movieIndex.add(newmovie);
            }
//            System.out.println(movieIndex);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }



}

