package com.first.GameCatalogue.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.first.GameCatalogue.Models.Rating;
@Repository
public interface RatingRepository extends JpaRepository<Rating, Long> {

}
