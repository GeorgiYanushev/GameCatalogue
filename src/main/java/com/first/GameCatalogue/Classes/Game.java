package com.first.GameCatalogue.Classes;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Game {
    @Id
    @SequenceGenerator(
            name="game_sequence",
            sequenceName="game_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator ="game_sequence"
    )
    private Long gameId;
    private String name;
    private int price;
    private int YearOfRelease;
    private int GenreId;
    private int ComoanyId;

    @ManyToMany(mappedBy = "games")
    private Set<Genre> genre=new HashSet<>();



    public Game() {
    }

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYearOfRelease() {
        return YearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        YearOfRelease = yearOfRelease;
    }

    public Game(String name, int price, int yearOfRelease) {
        this.name = name;
        this.price = price;
        YearOfRelease = yearOfRelease;
    }



    public Set<Genre> getGenre() {
        return genre;
    }

}
