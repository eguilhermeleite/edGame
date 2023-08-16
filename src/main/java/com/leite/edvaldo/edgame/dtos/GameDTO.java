package com.leite.edvaldo.edgame.dtos;

import com.leite.edvaldo.edgame.entities.Game;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@NoArgsConstructor
@Getter
@Setter
public class GameDTO {

    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    //instacia todos os atributos de Game nos atributos de GameDTO
    //necessario ter os Getters e Setters
    public GameDTO(Game entiy){
        BeanUtils.copyProperties(entiy,this);
    }
}
