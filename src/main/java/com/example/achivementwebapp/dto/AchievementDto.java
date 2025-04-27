package com.example.achivementwebapp.dto;

import com.example.achivementwebapp.domain.Achievement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class AchievementDto {
    long id;
    String name;
    String extId;
    String description;
    long numOwners;
    double percentOwners;
    String iconUrl;
    String lockedIconUrl;
    boolean hidden;
    GameDto game;
    public static AchievementDto toDto(Achievement achievement){
        if (achievement != null) {
            return new AchievementDto(achievement.getId(), achievement.getName(), achievement.getExtId(), achievement.getDescription(), achievement.getNumOwners(),
                    achievement.getPercentOwners(), achievement.getIconUrl(), achievement.getLockedIconUrl(), achievement.isHidden(), GameDto.toDtoLight(achievement.getGame()));
        }
        return new AchievementDto();
    }
}
