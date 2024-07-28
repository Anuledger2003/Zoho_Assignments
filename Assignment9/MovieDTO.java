package assignment9;

import java.util.ArrayList;

public class MovieDTO {
    private String title;
    private String genre;
    private String director;
    private int releaseYear;
    private double rating;

    public MovieDTO(String title, String genre, String director, int releaseYear, double rating) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    public void displayMovieDetails() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Director: " + director);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Rating: " + rating);
    }

    public static void main(String[] args) {
        ArrayList<MovieDTO> movies = new ArrayList<>();
        
        movies.add(new MovieDTO("Maharaja", "Family", "Nithilan Swaminathan", 2024, 10));
        movies.add(new MovieDTO("Inception", "Sci-Fi", "Christopher Nolan", 2010, 8.8));
        movies.add(new MovieDTO("The Godfather", "Crime", "Francis Ford Coppola", 1972, 9.2));

        for (MovieDTO movie : movies) {
            movie.displayMovieDetails();
            System.out.println();
        }
    }
}
