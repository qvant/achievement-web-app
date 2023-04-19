package com.example.achivementwebapp.service;

import com.example.achivementwebapp.domain.Player;
import com.example.achivementwebapp.domain.PlayerGame;
import com.example.achivementwebapp.repository.PlayerGamesRepository;

import java.util.List;

public interface PlayerGamesService {
    List<PlayerGame> findByPlayerIdAndPlatformId(Long playerId, Long platformId);
}
