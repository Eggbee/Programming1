public class Movie {
    String name;
    int releaseDate;
    String certificate;
    String genre;
    int duration;
    float rating;
    public Movie(String line){
        String[] fields = line.split(",");
        name = fields[0];
        releaseDate = Integer.parseInt(fields[1]);
        certificate = fields[2];
        genre = fields[3];
        duration = Integer.parseInt(fields[4]);
        rating = Float.parseFloat(fields[5]);
    }
