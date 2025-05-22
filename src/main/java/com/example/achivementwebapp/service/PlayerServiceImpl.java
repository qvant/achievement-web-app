package com.example.achivementwebapp.service;

import com.example.achivementwebapp.domain.Player;
import com.example.achivementwebapp.pageobjects.PlayersPaginated;
import com.example.achivementwebapp.repository.PlayerAchievementRepository;
import com.example.achivementwebapp.repository.PlayerRepository;
import com.example.achivementwebapp.repository.PlayerSummaryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService {
    private final PlayerRepository playerRepository;
    private final PlayerAchievementRepository playerAchievementRepository;
    private final PlayerSummaryRepository playerSummaryRepository;
    @Override
    public List<Player> findAll() {
        return playerRepository.findAll();
    }

    @Override
    public PlayersPaginated findByConditionsPaginated(Long platformId, Long playerId, String playerName, Long pageNumber, Long pageSize) {
        Long count = playerRepository.countByConditions(platformId, playerId, playerName);
        return PlayersPaginated.builder().players(playerRepository.findByConditionsPaginated(platformId, playerId, playerName, pageNumber * pageSize, pageSize)).count(count).build();
    }

    @Override
    public Player findByIdAndPlatformId(Long id, Long platformId) {
        var player =  playerRepository.findByIdAndPlatformId(id, platformId).orElseThrow(()-> new RuntimeException(("Not found player " + id)));
        player.setLastAchievements(playerAchievementRepository.findLastByPlayerId(id, platformId));
        player.setRarestAchievements(playerAchievementRepository.findRarestByPlayerId(id, platformId));
        player.setPlayerSummary(playerSummaryRepository.findPlayerId(id, platformId));
        return player;
    }
}
