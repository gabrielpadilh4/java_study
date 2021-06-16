package com.github.gabrielpadilh4.basic.test.named_query;

import com.github.gabrielpadilh4.infra.DAO;
import com.github.gabrielpadilh4.model.ManyToMany.Movie;

import java.util.List;
import java.util.function.Consumer;

public class GetMovies {

    public static void main(String[] args) {

        DAO<Movie> dao = new DAO<>(Movie.class);

        List<Movie> movies = dao.query("findMoviesWithRateBiggerThan", "rating", 4.0);

        Consumer<Movie> print = System.out::println;

        movies.stream().forEach(print);

    }
}
