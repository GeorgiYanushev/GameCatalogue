package com.first.GameCatalogue.Controllers;

import com.first.GameCatalogue.Services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping
    public void registerNewRating(@RequestBody Rating rating){
        ratingService.addNewRating(rating);
    }
    @DeleteMapping(path = "{ratingId}")
    public void deleteRating(@PathVariable("ratingId") Long id){
        ratingService.deleteStudent(id);
    }
    @PutMapping(path = "{ratingId}")
    public void updateStudent(
            @PathVariable("ratingId") Long ratingId,
            @RequestBody Rating rating){
        ratingService.updateRating(ratingId,rating.getNumbOfReviews(), rating.getScore());
        System.out.println(ratingId+" "+rating.getNumbOfReviews()+"  "+ rating.getScore());
    }

}
