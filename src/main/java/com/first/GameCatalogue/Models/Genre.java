package com.first.GameCatalogue.Models;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Genre {
    @Id
    @SequenceGenerator(
            name="genre_sequence",
            sequenceName="genre_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator="genre_sequence"
    )
     private Long GenreId;
     private String Name;

    public Genre() {
    }
    @ManyToMany
    @JoinTable(
            name="games_genres",
            joinColumns = @JoinColumn(name="genre_id"),
            inverseJoinColumns = @JoinColumn(name="game_id")
    )
    private Set<Game> games=new HashSet<>();

    public Set<Game> getGames() {
        return games;
    }

    public Genre(String name) {
        Name = name;
    }

    public Genre(Long genreId, String name) {
        GenreId = genreId;
        Name = name;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "GenreId=" + GenreId +
                ", Name='" + Name + '\'' +
                '}';
    }

    public Long getGenreId() {
        return GenreId;
    }

    public void setGenreId(Long genreId) {
        GenreId = genreId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
