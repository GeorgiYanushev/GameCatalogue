package com.first.GameCatalogue.Repositories;

import com.first.GameCatalogue.Classes.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game,Long> {

}
