package com.example.achivementwebapp.dto;

import com.example.achivementwebapp.domain.Achievement;
import com.example.achivementwebapp.domain.Player;
import com.example.achivementwebapp.domain.PlayerAchievement;
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
public class PlayerAchievementDto {
    private long id;
    private AchievementDto achievement;
    private LocalDate dtUnlock;

    public static PlayerAchievementDto toDto(PlayerAchievement achievement){
        if (achievement != null) {
            return new PlayerAchievementDto(achievement.getId(), AchievementDto.toDto(achievement.getAchievement()), achievement.getDtUnlock());
        }
        return new PlayerAchievementDto();
    }
}
