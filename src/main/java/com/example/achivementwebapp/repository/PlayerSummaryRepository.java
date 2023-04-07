package com.example.achivementwebapp.repository;

import com.example.achivementwebapp.domain.PlayerAchievement;
import com.example.achivementwebapp.domain.PlayerSummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlayerSummaryRepository extends JpaRepository<PlayerSummary, Long> {
    @Query(value = "select\n" +
            "            round(avg(case when g.has_achievements\n" +
            "                then pg.percent_complete else null\n" +
            "                end)\\:\\:numeric, 2) avg_percent,\n" +
            "            count(case when pg.is_perfect then 1 end) completed_games,\n" +
            "            count(1) total_games,\n" +
            "            greatest(p.dt_update_inc, p.dt_update_inc) last_update,\n" +
            "            p.id id,\n" +
            "            count(case when g.has_achievements then 1 end)\n" +
            "        from achievements_hunt.players p" +
            "        join achievements_hunt.player_games pg" +
            "            on p.platform_id = pg.platform_id" +
            "            and pg.player_id = p.id\n" +
            "        join achievements_hunt.games g\n" +
            "            on pg.game_id = g.id\n" +
            "            and pg.platform_id = g.platform_id\n" +
            "        where p.id = :playerId and p.platform_id = :platformId" +
            "        group by p.dt_update_inc, p.dt_update_inc, p.id", nativeQuery = true)
    PlayerSummary findPlayerId(Long playerId, Long platformId);
}
