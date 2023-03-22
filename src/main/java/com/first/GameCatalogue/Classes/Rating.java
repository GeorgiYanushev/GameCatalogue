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
    private int numbOfReviews;
    private double Score;

    public Rating() {
    }

    public Rating(int numbOfReviews, int score) {
        this.numbOfReviews = numbOfReviews;
        Score = score;
    }

    public Rating(Long ratingId, int numbOfReviews, double score) {
        this.ratingId = ratingId;
        this.numbOfReviews = numbOfReviews;
        Score = score;
    }

    public Long getRatingId() {
        return ratingId;
    }

    public void setRatingId(Long ratingId) {
        this.ratingId = ratingId;
    }

    public int getNumbOfReviews() {
        return numbOfReviews;
    }

    public void setNumbOfReviews(int numbOfReviews) {
        this.numbOfReviews = numbOfReviews;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double score) {
        Score = score;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "RatingId=" + ratingId +
                ", numbOfReviews=" + numbOfReviews +
                ", Score=" + Score +
                '}';
    }
}
