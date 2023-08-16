package com.leite.edvaldo.edgame.entities;

import com.leite.edvaldo.edgame.pk.BelongingPK;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;


@Entity
public class Belonging {

    @EmbeddedId
    private BelongingPK id = new BelongingPK();
    private Integer position;
}
