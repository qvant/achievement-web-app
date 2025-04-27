package com.example.achivementwebapp.service;

import com.example.achivementwebapp.domain.PlayerGame;

import java.util.List;

public interface PlayerGamesService {
    List<PlayerGame> findByPlayerIdAndPlatformId(Long playerId, Long platformId);
}
