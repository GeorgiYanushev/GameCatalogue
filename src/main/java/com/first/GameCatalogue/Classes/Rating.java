package com.first.GameCatalogue.Classes;

import jakarta.persistence.*;

@Entity
@Table
public class Rating {
    @Id
    @SequenceGenerator(
            name="rating_sequence",
            sequenceName="rating_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator ="rating_sequence"
    )
    private Long ratingId;
    private Integer numbOfReviews;
    private Integer score;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="game_id", referencedColumnName = "gameId")
    private Game game;

    public Rating() {
    }

    public Rating(Integer numbOfReviews, Integer score) {
        this.numbOfReviews = numbOfReviews;
        this.score = score;
    }

    public Rating(Long ratingId, Integer numbOfReviews, Integer score) {
        this.ratingId = ratingId;
        this.numbOfReviews = numbOfReviews;
        this.score = score;
    }

    public Long getRatingId() {
        return ratingId;
    }

    public void setRatingId(Long ratingId) {
        this.ratingId = ratingId;
    }

    public Integer getNumbOfReviews() {
        return numbOfReviews;
    }

    public void setNumbOfReviews(Integer numbOfReviews) {
        this.numbOfReviews = numbOfReviews;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "RatingId=" + ratingId +
                ", numbOfReviews=" + numbOfReviews +
                ", Score=" + score +
                '}';
    }
}
