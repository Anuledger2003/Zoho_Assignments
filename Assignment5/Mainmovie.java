class Movie {
    String title;

    public Movie(String title) {
        this.title = title;
    }

    public String getGenre() {
        return "General";
    }

    public String getMovieDetails() {
        return "Title: " + title + ", Genre: " + getGenre();
    }
}

class RomComMovie extends Movie {
    public RomComMovie(String title) {
        super(title);
    }

    @Override
    public String getGenre() {
        return "Romantic Comedy";
    }
}

class ThrillerMovie extends Movie {
    public ThrillerMovie(String title) {
        super(title);
    }

    @Override
    public String getGenre() {
        return "Thriller";
    }
}

public class Mainmovie {
    public static void main(String[] args) {
        Movie movie1 = new RomComMovie("Romantic Nights");
        Movie movie2 = new ThrillerMovie("Thrill Seeker");

        System.out.println(movie1.getMovieDetails());
        System.out.println(movie2.getMovieDetails());
    }
}
