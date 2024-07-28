package assignment8;

public class MovieDTO {

    static String title;
    static String genre;
    static String director;
    static int releaseYear;
    static double rating;

    public void displayMovieDetails() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Director: " + director);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Rating: " + rating);
    }

    public static void main(String[] args) {
        title = "Maharaja";
        genre = "Family";
        director = "Nithilan Swaminathan";
        releaseYear = 2024;
        rating = 10;

        MovieDTO movie1 = new MovieDTO();
        movie1.displayMovieDetails();
    }
}


