package com.example.achivementwebapp.dto;

import com.example.achivementwebapp.domain.Game;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class GameDto {
    public GameDto(long id, String name, String extId) {
        this.id = id;
        this.name = name;
        this.extId = extId;
    }

    private long id;
    private String name;
    private String extId;

    public static GameDto toDto(Game game){
        return new GameDto(game.getId(), game.getName(), game.getExtId());
    }
}
