package com.first.GameCatalogue.Services;

import com.first.GameCatalogue.Repositories.RatingRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.first.GameCatalogue.Models.Rating;
import java.util.List;

@Service
public class RatingService {
    private RatingRepository ratingRepository;

    @Autowired
    public RatingService(RatingRepository ratingRepository){
        this.ratingRepository=ratingRepository;
    }


    public List<Rating> getRatings(){
        return ratingRepository.findAll();
    }

    public void addNewRating(Rating rating) {
        ratingRepository.save(rating);
    }

    public void deleteStudent(Long id) {
        ratingRepository.deleteById(id);
    }
    @Transactional
    public void updateRating(Long ratingId, Integer numbOfReviews, Integer score) {
        Rating rating=ratingRepository.getReferenceById(ratingId);
        if(score!=null){rating.setScore(score);}
        if(numbOfReviews!=null){rating.setNumbOfReviews(numbOfReviews);}
    }
}
