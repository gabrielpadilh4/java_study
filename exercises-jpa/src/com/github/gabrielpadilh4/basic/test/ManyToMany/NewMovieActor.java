package com.github.gabrielpadilh4.basic.test.ManyToMany;

import com.github.gabrielpadilh4.infra.DAO;
import com.github.gabrielpadilh4.model.ManyToMany.Actor;
import com.github.gabrielpadilh4.model.ManyToMany.Movie;

public class NewMovieActor {

    public static void main(String[] args) {

        Movie movie = new Movie("Star Wars Episode IV", 10.0);
        Movie movieA = new Movie("Star Wars Episode VII", 5.0);

        Actor actor = new Actor("Mark Hamill");
        Actor actress = new Actor("Carrie Fisher");

        actor.getMovies().add(movieA);
        actor.getMovies().add(movie);

       /* movie.addActor(actor);
        movie.addActor(actress);*/

       /* DAO<Movie> dao = new DAO<>();

        dao.atomicPersist(movie);*/

        DAO<Actor> dao1 = new DAO<>();

        dao1.atomicPersist(actor);
        dao1.atomicPersist(actress);

    }
}
