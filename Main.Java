public class Main {
    public static void main(String[] args) {

        System.out.println("These are all of the films arranged in descending order of duration: " + Movie.descendingOrder());
        System.out.println("The lowest rated Sci-Fi movie: " + Movie.lowestRated());
        System.out.println("The fifth most recent PG rated movie is: " + Movie.fifthPGfilm());
        System.out.println("The movie with the longest name is: " + Movie.longestMovieName());
        System.out.println("The number of years seperating the oldest and newest movies is: " + Movie.filmYearDifference() +  " years");


        public static String descendingOrder(/*the brackets will need to be filled with the data type from movieDatabase.java*/) {

            String list = "example";
            return list;
        }

        public static String lowestRated(){
            String lowestMovie = "Sharknado";
            return lowestMovie;
        }

        public static String fifthPGfilm(){
            String fifthFilm = "Shrek";
            return fifthFilm;
        }

        public static String longestMovieName(){
            String longestName = "Die Hard";
            return longestName;
        }

        public static Integer filmYearDifference(){
            Integer yearGap = 12;
            return yearGap;
        }

    }
}
