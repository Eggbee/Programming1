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

    public static void sortDuration(){
        Collections.sort(movieIndex);
        for(Movie other:movieIndex){

        }
        reverse(movieIndex);
    }

    public static void main(String[] args) {
        
    }
}

