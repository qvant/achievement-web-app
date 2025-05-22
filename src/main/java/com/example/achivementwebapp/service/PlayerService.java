package com.example.achivementwebapp.service;

import com.example.achivementwebapp.domain.Player;
import com.example.achivementwebapp.pageobjects.PlayersPaginated;

import java.util.List;

public interface PlayerService {
    List<Player> findAll();
    PlayersPaginated findByConditionsPaginated(Long platformId, Long playerId, String playerName, Long pageNumber, Long pageSize);
    Player findByIdAndPlatformId(Long id, Long platformId);
}
