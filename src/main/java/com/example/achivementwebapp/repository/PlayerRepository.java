package com.example.achivementwebapp.repository;

import com.example.achivementwebapp.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PlayerRepository extends JpaRepository<Player, Long> {

    @Override
    List<Player> findAll();
    @Query(value = "select count(1) from achievements_hunt.players p where (p.platform_id = :platformId or :platformId is null) and (id = :playerId or :playerId is null) and (name like :playerName || '%' or :playerName is null)", nativeQuery = true)
    Long countByConditions(Long platformId, Long playerId, String playerName);
    @Query(value = "select * from achievements_hunt.players p where (p.platform_id = :platformId or :platformId is null) and (id = :playerId or :playerId is null) and (name like :playerName || '%' or :playerName is null) order by name limit :pageSize offset :offset", nativeQuery = true)
    List<Player> findByConditionsPaginated(Long platformId, Long playerId, String playerName, Long offset, Long pageSize);
    Optional<Player> findByIdAndPlatformId(Long id, Long platformId);


}
