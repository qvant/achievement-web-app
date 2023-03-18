package com.example.achivementwebapp.service;

import com.example.achivementwebapp.domain.Game;
import com.example.achivementwebapp.repository.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameServiceImpl implements GameService {
    private final GameRepository gameRepository;
    @Override
    public List<Game> findAll() {
        return gameRepository.findAll();
    }

    @Override
    public Game findByIdAndPlatformId(Long id, Long platformId) {
        return gameRepository.findByIdAndPlatformId(id, platformId).orElseThrow(()-> new RuntimeException(("Not found game " + id)));
    }
}
