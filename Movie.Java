public class Movie implements Comparable<Movie>{

    private String name;
    private int releaseDate;
    private String certificate;
    private String genre;
    private int duration;
    private double rating;

    public Movie(String line){
        String[] fields = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
        this.name = fields[0];
        this.releaseDate = Integer.parseInt(fields[1]);
        this.certificate = fields[2];
        this.genre = fields[3];
        this.duration = Integer.parseInt(fields[4]);
        this.rating = Double.parseDouble(fields[5]);
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

    public String toString(){
        return name + " " + releaseDate + " " + certificate + " "
                + genre + " " + duration + " " + rating;
    }

}
