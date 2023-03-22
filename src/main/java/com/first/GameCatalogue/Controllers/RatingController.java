package com.first.GameCatalogue.Controllers;

import com.first.GameCatalogue.Services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.first.GameCatalogue.Classes.Rating;
@RestController
@RequestMapping(path = "api/v1/rating")
public class RatingController {
    private RatingService ratingService;

    @Autowired
    public RatingController(RatingService RatingService) {
        this.ratingService = RatingService;
    }

    @GetMapping
    public List<Rating> getRatings(){
       return ratingService.getRatings();

    }

}
