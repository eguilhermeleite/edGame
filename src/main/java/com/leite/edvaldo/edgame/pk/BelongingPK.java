package com.leite.edvaldo.edgame.pk;

import com.leite.edvaldo.edgame.entities.Game;
import com.leite.edvaldo.edgame.entities.GameList;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
@Embeddable
@Getter
@Setter
public class BelongingPK {

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList list;

}
