package com.leite.edvaldo.edgame.controller;

import com.leite.edvaldo.edgame.dtos.GameMinDTO;
import com.leite.edvaldo.edgame.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
