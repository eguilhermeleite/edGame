package com.leite.edvaldo.edgame.services;

import com.leite.edvaldo.edgame.dtos.GameMinDTO;
import com.leite.edvaldo.edgame.entities.Game;
import com.leite.edvaldo.edgame.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> games = gameRepository.findAll();
        return games.stream().map(GameMinDTO::new).toList();
    }
}
