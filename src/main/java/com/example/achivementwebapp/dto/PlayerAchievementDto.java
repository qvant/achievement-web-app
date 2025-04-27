package com.example.achivementwebapp.dto;

import com.example.achivementwebapp.domain.PlayerAchievement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.query.sqm.TemporalUnit;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class PlayerAchievementDto {
    private long id;
    private AchievementDto achievement;
    private LocalDateTime dtUnlock;
    private PlayerDto player;

    public static PlayerAchievementDto toDto(PlayerAchievement achievement){
        if (achievement != null) {
            return new PlayerAchievementDto(achievement.getId(), AchievementDto.toDto(achievement.getAchievement()), achievement.getDtUnlock().truncatedTo(ChronoUnit.SECONDS), PlayerDto.toDtoNoChilds(achievement.getPlayer()));
        }
        return new PlayerAchievementDto();
    }
}
