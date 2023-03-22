package com.first.GameCatalogue.Services;

import com.first.GameCatalogue.Repositories.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.first.GameCatalogue.Classes.Rating;
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

}
