package com.github.gabrielpadilh4.model.ManyToMany;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private Double rating;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "actors_movies",
            joinColumns = @JoinColumn(name = "movie_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id", referencedColumnName = "id")
    )
    private List<Actor> actors;

    public Movie() {
    }

    public Movie(String name, Double rating) {
        this.name = name;
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public List<Actor> getActors() {
        if(this.actors == null){
            return this.actors = new ArrayList<>();
        }
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public void addActor(Actor actor) {
        if (actor != null && !getActors().contains(actor)) {
            actor.getMovies().add(this);

            if (!actor.getMovies().contains(this)) {
                this.getActors().add(actor);
            }
        }
    }
}
