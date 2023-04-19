package com.example.achivementwebapp.service;

import com.example.achivementwebapp.domain.PlayerGame;
import com.example.achivementwebapp.repository.PlayerGamesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerGamesServiceImpl implements PlayerGamesService {
    private final PlayerGamesRepository playerGamesRepository;

    @Override
    public List<PlayerGame> findByPlayerIdAndPlatformId(Long playerId, Long platformId){
        return playerGamesRepository.findByPlayerIdAndPlatformId(playerId, platformId);
    }
}
