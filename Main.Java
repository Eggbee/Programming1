public class Main {
    public static void main(String[] args) {

        System.out.println("These are all of the films arranged in descending order of duration: " + Movie.descendingOrder());
        System.out.println("The lowest rated Sci-Fi movie: " + Movie.lowestRated());
        System.out.println("The fifth most recent PG rated movie is: " + Movie.fifthPGfilm());
        System.out.println("The movie with the longest name is: " + Movie.longestMovieName());
        System.out.println("The number of years seperating the oldest and newest movies is: " + Movie.filmYearDifference() +  " years");
    }
}
