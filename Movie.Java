

public class Movie {

    private String name;
    private int releaseDate;
    private String certificate;
    private String genre;
    private int duration;
    private double rating;

    public Movie(String line){
        String[] fields = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
        name = fields[0];
        releaseDate = Integer.parseInt(fields[1]);
        certificate = fields[2];
        genre = fields[3];
        duration = Integer.parseInt(fields[4]);
        rating = Double.parseDouble(fields[5]);
    }

    public String getName() {
        return name;
    }
    public int getReleaseDate() {
        return releaseDate;
    }
    public String getCertificate() {
        return certificate;
    }
    public String getGenre() {
        return genre;
    }
    public int getDuration() {
        return duration;
    }
    public double getRating() {
        return rating;
    }


     public int compareTo(Movie other) {
         return Integer.compare(this.duration, other.duration);
     }

}
