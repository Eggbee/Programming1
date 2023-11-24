public class Movie {
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
       Integer oldestFilm = 0;
       Integer newestFilm = 0;
       
       for (int i = 0; i < Database.length; i++) /*will iterate through the database, specifically at the release year*/
       {
           Integer currentYear = DatabaseYear[i];
           if(currentYear > newestFilm){
               newestFilm = currentYear;
           }
           else if (currentYear < oldestFilm){
               oldestFilm = currentYear;
           }
       }
       Integer yearGap = newestFilm - oldestFilm;
       return yearGap;
   }
}
