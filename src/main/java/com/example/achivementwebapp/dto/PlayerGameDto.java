package com.example.achivementwebapp.dto;

import com.example.achivementwebapp.domain.PlayerGame;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class PlayerGameDto {
    private long id;
    private GameDto game;
    private Double percentComplete;
    private Boolean perfect;
    private LocalDate LastPerfected;

    public static PlayerGameDto toDto(PlayerGame playerGame){
        if (playerGame != null) {
            return new PlayerGameDto(playerGame.getId(), GameDto.toDto(playerGame.getGame()), playerGame.getPercentComplete(), playerGame.getPerfect(), playerGame.getLastPerfected());
        }
        return new PlayerGameDto();
    }
}
