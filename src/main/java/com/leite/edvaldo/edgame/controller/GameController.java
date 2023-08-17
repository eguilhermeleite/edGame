package com.leite.edvaldo.edgame.controller;

import com.leite.edvaldo.edgame.dtos.GameDTO;
import com.leite.edvaldo.edgame.dtos.GameMinDTO;
import com.leite.edvaldo.edgame.entities.Game;
import com.leite.edvaldo.edgame.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> all(){
        return gameService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<GameDTO> byId(@PathVariable Long id){
        return gameService.findById(id);
    }
}
