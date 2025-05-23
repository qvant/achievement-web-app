package com.example.achivementwebapp.repository;

import com.example.achivementwebapp.domain.Achievement;
import com.example.achivementwebapp.domain.PlayerAchievement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlayerAchievementRepository  extends JpaRepository<PlayerAchievement, Long> {
    // TODO: Remove query for achievements_hunt.achievements
    @Query(value = "select pa.* from achievements_hunt.player_achievements pa where pa.player_id = :playerId and pa.platform_id = :platformId order by pa.dt_unlock desc limit 10", nativeQuery = true)
    List<PlayerAchievement> findLastByPlayerId(Long playerId, Long platformId);
    @Query(value = "select pa.* from achievements_hunt.player_achievements pa " +
            "join achievements_hunt.achievements a on pa.achievement_id = a.id where pa.player_id = :playerId and pa.platform_id = :platformId order by a.percent_owners desc limit 10", nativeQuery = true)
    List<PlayerAchievement> findRarestByPlayerId(Long playerId, Long platformId);
    @Query(value = "select pa.* from achievements_hunt.player_achievements pa order by pa.dt_unlock desc limit :limit", nativeQuery = true)
    List<PlayerAchievement> getLastAchievements(Long limit);
}
