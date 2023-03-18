package com.example.achivementwebapp.dto;

import com.example.achivementwebapp.domain.Game;
import com.example.achivementwebapp.domain.Player;
import com.example.achivementwebapp.domain.PlayerGame;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
    private double percentComplete;
    private boolean perfect;
    private LocalDate LastPerfected;

    public static PlayerGameDto toDto(PlayerGame playerGame){
        if (playerGame != null) {
            return new PlayerGameDto(playerGame.getId(), GameDto.toDto(playerGame.getGame()), playerGame.getPercentComplete(), playerGame.isPerfect(), playerGame.getLastPerfected());
        }
        return new PlayerGameDto();
    }
}
