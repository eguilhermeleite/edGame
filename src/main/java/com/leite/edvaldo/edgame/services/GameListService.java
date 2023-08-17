package com.leite.edvaldo.edgame.services;

import com.leite.edvaldo.edgame.entities.GameList;
import com.leite.edvaldo.edgame.exceptions.ResourceNotFoundException;
import com.leite.edvaldo.edgame.repositories.GameListRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional
    public List<GameList> findAll(){
       return gameListRepository.findAll();
    }

    @Transactional
    public ResponseEntity<GameList> findById(Long id){
        String message = "Resource with id: " + id + " Not Found...";
        return gameListRepository.findById(id)
                .map(ResponseEntity::ok).orElseThrow(
                        () -> new ResourceNotFoundException(message));
    }
}
