package com.leite.edvaldo.edgame.repositories;

import com.leite.edvaldo.edgame.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {
}
