package com.example.achivementwebapp.dto;

import com.example.achivementwebapp.domain.Achievement;
import com.example.achivementwebapp.domain.Company;
import jakarta.persistence.Column;
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
    public static AchievementDto toDto(Achievement achievement){
        if (achievement != null) {
            return new AchievementDto(achievement.getId(), achievement.getName(), achievement.getExtId(), achievement.getDescription(), achievement.getNumOwners(),
                    achievement.getPercentOwners(), achievement.getIconUrl(), achievement.getLockedIconUrl(), achievement.isHidden());
        }
        return new AchievementDto();
    }
}
