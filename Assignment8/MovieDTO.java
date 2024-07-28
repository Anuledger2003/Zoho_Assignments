package assignment8;

public class MovieDTO {

    private String title;
    private String genre;
    private String director;
    private int releaseYear;
    private double rating;

    private static int movieCount = 0;

    public MovieDTO(String title, String genre, String director, int releaseYear, double rating) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;
        movieCount++;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public static int getMovieCount() {
        return movieCount;
    }

    public void displayMovieDetails() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Director: " + director);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Rating: " + rating);
    }
    
    public static void main(String[] args) {
        MovieDTO movie1 = new MovieDTO("Maharaja", "Family", "Nithilan Swaminathan", 2024, 10);
        MovieDTO movie2 = new MovieDTO("Kalki 2898 AD", "Sci - fci", "Nag Ashwin", 2024, 9.2);

        movie1.displayMovieDetails();
        movie2.displayMovieDetails();

        System.out.println("Total number of movies: " + MovieDTO.getMovieCount());
    }
}
