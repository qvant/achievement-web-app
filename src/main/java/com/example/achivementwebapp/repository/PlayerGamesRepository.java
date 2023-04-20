package com.example.achivementwebapp.repository;

import com.example.achivementwebapp.domain.PlayerGame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlayerGamesRepository extends JpaRepository<PlayerGame, Long> {
    @Query(value = "select pa.* from achievements_hunt.player_games pa where pa.player_id = :playerId and pa.platform_id = :platformId", nativeQuery = true)
    public List<PlayerGame> findByPlayerIdAndPlatformId(Long playerId, Long platformId);
}
