public class Movie implements Comparable<Movie>{

    private String name;
    private int releaseDate;
    private String certificate;
    private String genre;
    private int duration;
    private double rating;

    public Movie(String line){ //movie constructor to set out each field of the movie
        String[] fields = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1); //The two links below were used to aid to split each line of the text file to obtain the individual fields of a movie. We utilised examples of regex and .split() to aid our work
        this.name = fields[0]; //https://www.baeldung.com/java-split-string-commas https://www.baeldung.com/regular-expressions-java
        this.releaseDate = Integer.parseInt(fields[1]);
        this.certificate = fields[2];
        this.genre = fields[3];
        this.duration = Integer.parseInt(fields[4]);
        this.rating = Double.parseDouble(fields[5]);
    }

    //accessor methods to retrieve the various fields
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




    public String toString(){ //toString method that will format the data to show all the movie's data when required
        return name + " " + releaseDate + " " + certificate + " "
                + genre + " " + duration + " " + rating;
    }

    public static void main(String[] args) {

    }

}
