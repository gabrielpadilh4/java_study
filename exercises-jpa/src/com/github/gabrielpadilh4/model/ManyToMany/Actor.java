package com.github.gabrielpadilh4.model.ManyToMany;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "actors")
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @ManyToMany(mappedBy = "actors", cascade = CascadeType.PERSIST)
    private List<Movie> movies;

    public Actor() {
    }

    public Actor(String name) {
        this.name = name;
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

    public List<Movie> getMovies() {

        if (this.movies == null) {
            return this.movies = new ArrayList<>();
        }

        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
