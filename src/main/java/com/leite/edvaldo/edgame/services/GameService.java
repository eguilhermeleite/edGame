package com.leite.edvaldo.edgame.services;

import com.leite.edvaldo.edgame.dtos.GameDTO;
import com.leite.edvaldo.edgame.dtos.GameMinDTO;
import com.leite.edvaldo.edgame.entities.Game;
import com.leite.edvaldo.edgame.exceptions.ResourceNotFoundException;
import com.leite.edvaldo.edgame.repositories.GameRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional
    public List<GameMinDTO> findAll() {

        return gameRepository.findAll().stream().map(GameMinDTO::new).toList();
    }

    @Transactional
    public ResponseEntity<GameDTO> findById(Long id) {
        String message = "Resource with id: " + id + " Not Found...";
        Optional<Game> g = gameRepository.findById(id);

        if (g.isPresent()) {
            Game game = g.get();
            GameDTO gameDTO = new GameDTO(game);
            return ResponseEntity.ok(gameDTO);

        } else throw new ResourceNotFoundException(id, message);

    }


}
