package assignment12;

/*
 * Change 'Movie' class to abstract class and add additional abstract methods in 
 * 'Movie' class and define them in the child classes.
 */
import java.util.Scanner;

abstract class Movies {
 protected String title;
 protected String genre;
 protected String director;
 protected int releaseYear;
 protected double rating;

 public Movies(String title, String genre, String director, int releaseYear, double rating) {
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

 public abstract void playTrailer();
}

//FeatureFilm 
class FeatureFilm extends Movies {

 public FeatureFilm(String title, String genre, String director, int releaseYear, double rating) {
     super(title, genre, director, releaseYear, rating);
 }

 public void playTrailer() {
     System.out.println("Playing trailer for the feature film: " + title);
 }

}

//Documentary 
class Documentary extends Movies {

 public Documentary(String title, String genre, String director, int releaseYear, double rating) {
     super(title, genre, director, releaseYear, rating);
 }

 public void playTrailer() {
     System.out.println("Playing trailer for the documentary: " + title);
 }

}

public class Movie {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     Movies featureFilm = new FeatureFilm("Maharaja", "Family", "Nithilan Swaminathan", 2024, 10);
     featureFilm.displayMovieDetails();
     featureFilm.playTrailer();

     System.out.println("----------------------------------------------------------------------------");

     Movies documentary = new Documentary("The Social Dilemma", "Documentary", "Jeff Orlowski", 2020, 7.6);
     documentary.displayMovieDetails();
     documentary.playTrailer();

 }
}
