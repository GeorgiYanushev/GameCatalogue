package com.first.GameCatalogue.Repositories;

import com.first.GameCatalogue.Models.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre,Long> {
}
