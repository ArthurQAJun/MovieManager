package org.example;

public class MovieManager {

    private String[] movie = new String[0];

    private int limit;

    public MovieManager() {
        this.limit = 10;

    }

    public MovieManager(int limit) {
        this.limit = limit;

    }

    public void addMovie(String movieName) {
        String[] tmp = new String[movie.length + 1];
        for (int i = 0; i < movie.length; i++) {
            tmp[i] = movie[i];
        }
        tmp[tmp.length - 1] = movieName;
        movie = tmp;

    }

    public String[] findAllMovie() {
        return movie;

    }

    public String[] findLastMovie() {
        int resultLength;
        if (movie.length < limit) {
            resultLength = movie.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movie[movie.length - 1 - i];


        }
        return tmp;
    }
}
