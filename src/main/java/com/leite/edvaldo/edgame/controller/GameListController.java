package com.leite.edvaldo.edgame.controller;

import com.leite.edvaldo.edgame.entities.GameList;
import com.leite.edvaldo.edgame.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/list")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameList> all(){
        return gameListService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<GameList> byId(@PathVariable Long id){
        return gameListService.findById(id);
    }
}
