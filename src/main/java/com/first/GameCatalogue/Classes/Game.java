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
    @Embedded
    @AttributeOverrides({
            @AttributeOverride( name = "name", column = @Column(name = "engine_name")),
            @AttributeOverride(name = "version", column = @Column(name = "engine_version")),
            @AttributeOverride(name = "type", column = @Column(name = "engine_type"))
    })
    private Engine engine;


    @ManyToMany(mappedBy = "games")
    private Set<Genre> genre=new HashSet<>();

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="Company_Id", referencedColumnName = "companyId")
    private Company company;

    @OneToOne(mappedBy = "game")
    private Rating rating;

    public Game() {
    }

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public Game(String name, int price, int yearOfRelease, Engine engine) {
        this.name = name;
        this.price = price;
        YearOfRelease = yearOfRelease;
        this.engine=engine;
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

    public Set<Genre> getGenre() {
        return genre;
    }

    public Company getCompany() {
        return company;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
