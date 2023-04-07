package com.example.achivementwebapp.dto;

import com.example.achivementwebapp.domain.PlayerGame;
import com.example.achivementwebapp.domain.PlayerSummary;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class PlayerSummaryDto {
    long completedGames;
    double avgPercent;
    long totalGames;
    LocalDate lastUpdate;

    public static PlayerSummaryDto toDto(PlayerSummary playerSummary){
        if (playerSummary != null) {
            return new PlayerSummaryDto(playerSummary.getCompletedGames(), playerSummary.getAvgPercent(), playerSummary.getTotalGames(), playerSummary.getLastUpdate());
        }
        return new PlayerSummaryDto();
    }
}
