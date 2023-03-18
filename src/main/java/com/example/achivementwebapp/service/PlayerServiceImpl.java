package com.example.achivementwebapp.service;

import com.example.achivementwebapp.domain.Player;
import com.example.achivementwebapp.repository.GameRepository;
import com.example.achivementwebapp.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService {
    private final PlayerRepository playerRepository;
    @Override
    public List<Player> findAll() {
        return playerRepository.findAll();
    }

    @Override
    public Player findByIdAndPlatformId(Long id, Long platformId) {
        return playerRepository.findByIdAndPlatformId(id, platformId).orElseThrow(()-> new RuntimeException(("Not found player " + id)));
    }
}