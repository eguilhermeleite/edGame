package com.leite.edvaldo.edgame.repositories;

import com.leite.edvaldo.edgame.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
